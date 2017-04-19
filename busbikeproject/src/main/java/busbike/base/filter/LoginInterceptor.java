package busbike.base.filter;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import busbike.base.pojo.vo.ActiveEmp;
import busbike.base.process.context.Config;
import busbike.base.process.result.ResultUtil;
import busbike.util.ResourcesUtil;

/**
 * 
 * <p>Title: LoginInterceptor</p>
 * <p>Description:用户身份校验 </p>
 * <p>Company: www.itcast.com</p> 
 * @author	苗润�?
 * @date	2014�?11�?29日上�?10:03:24
 * @version 1.0
 */
public class LoginInterceptor implements HandlerInterceptor{

	
	//执行时机：进入action方法之前执行
	//使用场景：用于用户认证�?�用户授权拦�?
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		//校验用户身份是否合法
		HttpSession session = request.getSession();
		ActiveEmp activeEmp = (ActiveEmp) session.getAttribute(Config.ACTIVEUSER_KEY);
		if(activeEmp != null){
             //用户已经登陆，放�?
			return true;
		}
		
		//校验用户访问是否是公�?资源 地址
		List<String> open_urls = ResourcesUtil.gekeyList(Config.ANONYMOUS_ACTIONS);
		
		//用户访问的url
		String url = request.getRequestURI();
		for(String open_url:open_urls){
			if(url.indexOf(open_url)>=0){
				//如果访问的是公开 地址则放�?
				return true;
			}
		}
		
		//拦截用户操作，跳转到登陆页面
		//request.getRequestDispatcher("/WEB-INF/jsp/base/login.jsp").forward(request, response);
		
		//抛出异常，异常代�?106（需要登陆后继续操作�?
		ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 106, null));
		
		return false;
	}

	//执行时机：进入action方法，在返回modelAndView之前执行
	//使用场景：在这里统一对返回数据进行处理，比如统一添加菜单 导航
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		
	}

	//执行时机:action方法执行完成，已�? 返回modelAndView，执行�??
	//使用场景：统�?处理系统异常，在这里统一记录系统日志 ，监控action方法执行时间，在preHandle记录�?始时间，在afterCompletion记录结束时间
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		
	}

}
