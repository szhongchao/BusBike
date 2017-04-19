package busbike.business.pojo.po;

public class SingleCarInfo {
    private Integer id;

    private String rentNetid;

    private String returnNetid;

    private String rentDateTime;

    private String tranDate;

    private String returnDate;

    private String tranTime;

    private String returnTime;

    private String instCard;

    private String carNum;

    private Integer useMin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRentNetid() {
        return rentNetid;
    }

    public void setRentNetid(String rentNetid) {
        this.rentNetid = rentNetid == null ? null : rentNetid.trim();
    }

    public String getReturnNetid() {
        return returnNetid;
    }

    public void setReturnNetid(String returnNetid) {
        this.returnNetid = returnNetid == null ? null : returnNetid.trim();
    }

    public String getRentDateTime() {
        return rentDateTime;
    }

    public void setRentDateTime(String rentDateTime) {
        this.rentDateTime = rentDateTime == null ? null : rentDateTime.trim();
    }

    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate == null ? null : tranDate.trim();
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate == null ? null : returnDate.trim();
    }

    public String getTranTime() {
        return tranTime;
    }

    public void setTranTime(String tranTime) {
        this.tranTime = tranTime == null ? null : tranTime.trim();
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime == null ? null : returnTime.trim();
    }

    public String getInstCard() {
        return instCard;
    }

    public void setInstCard(String instCard) {
        this.instCard = instCard == null ? null : instCard.trim();
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum == null ? null : carNum.trim();
    }

    public Integer getUseMin() {
        return useMin;
    }

    public void setUseMin(Integer useMin) {
        this.useMin = useMin;
    }
}