package com.zqx.pojo;

public class Department {
    private Integer deptId;

    private String deptName;

    private String locadd;

    public Department() {
    }

    public Department(Integer deptId, String deptName, String locadd) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.locadd = locadd;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getLocadd() {
        return locadd;
    }

    public void setLocadd(String locadd) {
        this.locadd = locadd == null ? null : locadd.trim();
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", locadd='" + locadd + '\'' +
                '}';
    }
}