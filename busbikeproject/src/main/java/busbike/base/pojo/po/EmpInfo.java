package busbike.base.pojo.po;

public class EmpInfo {
    private Integer empId;

    private String empTypeId;

    private String empName;

    private String empPassword;

    private String realName;

    private String empType;

    private String telephone;

    private String email;

    private String empAddress;

    private String birthday;

    private String companyName;

    private String companyAddress;

    private String isVisible;

    private String securityLevel;

    private String empClassId;

    private String empClassName;

    private String empGroupId;

    private String empGroupName;

    private String description;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpTypeId() {
        return empTypeId;
    }

    public void setEmpTypeId(String empTypeId) {
        this.empTypeId = empTypeId == null ? null : empTypeId.trim();
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword == null ? null : empPassword.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType == null ? null : empType.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress == null ? null : empAddress.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(String isVisible) {
        this.isVisible = isVisible == null ? null : isVisible.trim();
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel == null ? null : securityLevel.trim();
    }

    public String getEmpClassId() {
        return empClassId;
    }

    public void setEmpClassId(String empClassId) {
        this.empClassId = empClassId == null ? null : empClassId.trim();
    }

    public String getEmpClassName() {
        return empClassName;
    }

    public void setEmpClassName(String empClassName) {
        this.empClassName = empClassName == null ? null : empClassName.trim();
    }

    public String getEmpGroupId() {
        return empGroupId;
    }

    public void setEmpGroupId(String empGroupId) {
        this.empGroupId = empGroupId == null ? null : empGroupId.trim();
    }

    public String getEmpGroupName() {
        return empGroupName;
    }

    public void setEmpGroupName(String empGroupName) {
        this.empGroupName = empGroupName == null ? null : empGroupName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}