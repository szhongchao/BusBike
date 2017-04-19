package busbike.base.pojo.po;

public class DictInfo {
    private Integer dictInfoId;

    private String dictCode;

    private String typeCode;

    private String info;

    private String remark;

    private String updateTime;

    private String dictSort;

    private String isEnable;

    private String valueType;

    public Integer getDictInfoId() {
        return dictInfoId;
    }

    public void setDictInfoId(Integer dictInfoId) {
        this.dictInfoId = dictInfoId;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode == null ? null : dictCode.trim();
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getDictSort() {
        return dictSort;
    }

    public void setDictSort(String dictSort) {
        this.dictSort = dictSort == null ? null : dictSort.trim();
    }

    public String getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable == null ? null : isEnable.trim();
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType == null ? null : valueType.trim();
    }
}