package busbike.business.pojo.po;

public class AllCarInfo {
    private Integer carInfoId;

    private String carNum;

    private Integer countSum;

    public Integer getCarInfoId() {
        return carInfoId;
    }

    public void setCarInfoId(Integer carInfoId) {
        this.carInfoId = carInfoId;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum == null ? null : carNum.trim();
    }

    public Integer getCountSum() {
        return countSum;
    }

    public void setCountSum(Integer countSum) {
        this.countSum = countSum;
    }
}