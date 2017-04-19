package busbike.base.pojo.po;

import java.util.Date;

public class ZoneInfo {
    private String zoneId;

    private String zoneName;

    private String centerLat;

    private String centerLng;

    private String cityId;

    private String isvisble;

    private Date createTime;

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId == null ? null : zoneId.trim();
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName == null ? null : zoneName.trim();
    }

    public String getCenterLat() {
        return centerLat;
    }

    public void setCenterLat(String centerLat) {
        this.centerLat = centerLat == null ? null : centerLat.trim();
    }

    public String getCenterLng() {
        return centerLng;
    }

    public void setCenterLng(String centerLng) {
        this.centerLng = centerLng == null ? null : centerLng.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getIsvisble() {
        return isvisble;
    }

    public void setIsvisble(String isvisble) {
        this.isvisble = isvisble == null ? null : isvisble.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}