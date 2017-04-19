package busbike.business.pojo.po;

public class RentReturnInfo {
    private String hostSeri;

    private String tranDate;

    private String tranTime;

    private String rentDateTime;

    private String rentNetid;

    private String rentNum;

    private String carNum;

    private String instCard;

    private String returnDate;

    private String returnTime;

    private String returnDateTime;

    private String returnNetid;

    private String parkNum;

    private Integer cardType;

    private String tranFlag;

    private String rentType;

    private String chType;

    public String getHostSeri() {
        return hostSeri;
    }

    public void setHostSeri(String hostSeri) {
        this.hostSeri = hostSeri == null ? null : hostSeri.trim();
    }

    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate == null ? null : tranDate.trim();
    }

    public String getTranTime() {
        return tranTime;
    }

    public void setTranTime(String tranTime) {
        this.tranTime = tranTime == null ? null : tranTime.trim();
    }

    public String getRentDateTime() {
        return rentDateTime;
    }

    public void setRentDateTime(String rentDateTime) {
        this.rentDateTime = rentDateTime == null ? null : rentDateTime.trim();
    }

    public String getRentNetid() {
        return rentNetid;
    }

    public void setRentNetid(String rentNetid) {
        this.rentNetid = rentNetid == null ? null : rentNetid.trim();
    }

    public String getRentNum() {
        return rentNum;
    }

    public void setRentNum(String rentNum) {
        this.rentNum = rentNum == null ? null : rentNum.trim();
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum == null ? null : carNum.trim();
    }

    public String getInstCard() {
        return instCard;
    }

    public void setInstCard(String instCard) {
        this.instCard = instCard == null ? null : instCard.trim();
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate == null ? null : returnDate.trim();
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime == null ? null : returnTime.trim();
    }

    public String getReturnDateTime() {
        return returnDateTime;
    }

    public void setReturnDateTime(String returnDateTime) {
        this.returnDateTime = returnDateTime == null ? null : returnDateTime.trim();
    }

    public String getReturnNetid() {
        return returnNetid;
    }

    public void setReturnNetid(String returnNetid) {
        this.returnNetid = returnNetid == null ? null : returnNetid.trim();
    }

    public String getParkNum() {
        return parkNum;
    }

    public void setParkNum(String parkNum) {
        this.parkNum = parkNum == null ? null : parkNum.trim();
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getTranFlag() {
        return tranFlag;
    }

    public void setTranFlag(String tranFlag) {
        this.tranFlag = tranFlag == null ? null : tranFlag.trim();
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType == null ? null : rentType.trim();
    }

    public String getChType() {
        return chType;
    }

    public void setChType(String chType) {
        this.chType = chType == null ? null : chType.trim();
    }
}