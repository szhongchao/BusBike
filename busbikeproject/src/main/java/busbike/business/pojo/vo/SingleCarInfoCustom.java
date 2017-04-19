package busbike.business.pojo.vo;

public class SingleCarInfoCustom {
    private String rentDateTime;

    private String rentNetid;

    private String rentNum;

    private String carNum;
    
    private String carFaultDesc;
    
    public String getCarFaultDesc() {
		return carFaultDesc;
	}

	public void setCarFaultDesc(String carFaultDesc) {
		this.carFaultDesc = carFaultDesc;
	}

	public String getRentDateTime() {
		return rentDateTime;
	}

	public void setRentDateTime(String rentDateTime) {
		this.rentDateTime = rentDateTime;
	}

	public String getRentNetid() {
		return rentNetid;
	}

	public void setRentNetid(String rentNetid) {
		this.rentNetid = rentNetid;
	}

	public String getRentNum() {
		return rentNum;
	}

	public void setRentNum(String rentNum) {
		this.rentNum = rentNum;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

}
