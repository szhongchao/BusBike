package busbike.business.pojo.po;

public class RentInfo {
    private Integer id;

    private String rentId;

    private String zoneName;

    private String road;

    private String rentName;

    private String rentPosition;

    private Integer maxNumber;

    private String lat;

    private String lng;

    private String leftOrRight;

    private String rentRank;

    private Integer areaId;

    private String topLimit;

    private String lowLimit;

    private Integer operNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRentId() {
        return rentId;
    }

    public void setRentId(String rentId) {
        this.rentId = rentId == null ? null : rentId.trim();
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName == null ? null : zoneName.trim();
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road == null ? null : road.trim();
    }

    public String getRentName() {
        return rentName;
    }

    public void setRentName(String rentName) {
        this.rentName = rentName == null ? null : rentName.trim();
    }

    public String getRentPosition() {
        return rentPosition;
    }

    public void setRentPosition(String rentPosition) {
        this.rentPosition = rentPosition == null ? null : rentPosition.trim();
    }

    public Integer getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(Integer maxNumber) {
        this.maxNumber = maxNumber;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng == null ? null : lng.trim();
    }

    public String getLeftOrRight() {
        return leftOrRight;
    }

    public void setLeftOrRight(String leftOrRight) {
        this.leftOrRight = leftOrRight == null ? null : leftOrRight.trim();
    }

    public String getRentRank() {
        return rentRank;
    }

    public void setRentRank(String rentRank) {
        this.rentRank = rentRank == null ? null : rentRank.trim();
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getTopLimit() {
        return topLimit;
    }

    public void setTopLimit(String topLimit) {
        this.topLimit = topLimit == null ? null : topLimit.trim();
    }

    public String getLowLimit() {
        return lowLimit;
    }

    public void setLowLimit(String lowLimit) {
        this.lowLimit = lowLimit == null ? null : lowLimit.trim();
    }

    public Integer getOperNum() {
        return operNum;
    }

    public void setOperNum(Integer operNum) {
        this.operNum = operNum;
    }
}