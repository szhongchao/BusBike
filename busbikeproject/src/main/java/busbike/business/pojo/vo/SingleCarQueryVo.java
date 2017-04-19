package busbike.business.pojo.vo;

public class SingleCarQueryVo {
	private String carNum;
	private String minDateTime;
	private String maxDateTime ;
	private String minUseMin;
	private String maxUseMin;
	
	
	public String getMinUseMin() {
		return minUseMin;
	}
	public void setMinUseMin(String minUseMin) {
		this.minUseMin = minUseMin;
	}
	public String getMaxUseMin() {
		return maxUseMin;
	}
	public void setMaxUseMin(String maxUseMin) {
		this.maxUseMin = maxUseMin;
	}
	
	public String getCarNum() {
		return carNum;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	public String getMinDateTime() {
		return minDateTime;
	}
	public void setMinDateTime(String minDateTime) {
		this.minDateTime = minDateTime;
	}
	public String getMaxDateTime() {
		return maxDateTime;
	}
	public void setMaxDateTime(String maxDateTime) {
		this.maxDateTime = maxDateTime;
	}
	
	
}
