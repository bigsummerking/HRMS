package com.king.hrmsdev.entity;

import java.math.BigDecimal;

/**
 * creat By DepartMentAverage 0n 2019/9/24
 */
public class DepartMentAverage {
    private  String departmentName;
    private BigDecimal count;

    public DepartMentAverage(String departmentName, BigDecimal count) {
        this.departmentName = departmentName;
        this.count = count;
    }
    public DepartMentAverage(){

    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }
}
