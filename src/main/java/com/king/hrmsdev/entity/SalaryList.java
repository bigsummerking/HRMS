package com.king.hrmsdev.entity;

import java.math.BigDecimal;

/**
 * creat By SalaryList 0n 2019/9/21
 */
public class SalaryList {
    private  int job_id;
    private  String ename;
    private  String sex;
    private  String position;//职位
    private BigDecimal baseMoney;//基本工资
    private BigDecimal checkMoney;//考勤奖金
    private BigDecimal finalMoney;//最终薪资

    public SalaryList(int job_id, String ename, String sex, String position, BigDecimal baseMoney, BigDecimal checkMoney, BigDecimal finalMoney) {
        this.job_id = job_id;
        this.ename = ename;
        this.sex = sex;
        this.position = position;
        this.baseMoney = baseMoney;
        this.checkMoney = checkMoney;
        this.finalMoney = finalMoney;
    }

    public SalaryList() {
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getBaseMoney() {
        return baseMoney;
    }

    public void setBaseMoney(BigDecimal baseMoney) {
        this.baseMoney = baseMoney;
    }

    public BigDecimal getCheckMoney() {
        return checkMoney;
    }

    public void setCheckMoney(BigDecimal checkMoney) {
        this.checkMoney = checkMoney;
    }

    public BigDecimal getFinalMoney() {
        return finalMoney;
    }

    public void setFinalMoney(BigDecimal finalMoney) {
        this.finalMoney = finalMoney;
    }
}
