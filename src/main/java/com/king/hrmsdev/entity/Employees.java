package com.king.hrmsdev.entity;

import java.util.Date;

/**
 * creat By Position 0n 2019/9/21
 */
public class Employees {
    private  Integer job_id;
    private  String ename;
    private  int sex;
    private  int phone;
    private Date birth;
    private String idcard;
    private String  hometown;
    private String nation;
    private String education;
    private String address;
    private  Date hiredate;
    private int department_id;
    private  int position_id;
    private  int  workstate;
    private  String icon;
    private  String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public int getPosition_id() {
        return position_id;
    }

    public void setPosition_id(int position_id) {
        this.position_id = position_id;
    }

    public int getWorkstate() {
        return workstate;
    }

    public void setWorkstate(int workstate) {
        this.workstate = workstate;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getJob_id() {
        return job_id;
    }

    public void setJob_id(Integer job_id) {
        this.job_id = job_id;
    }

    public Employees(Integer job_id, String ename, int sex, int phone, Date birth, String idcard, String hometown, String nation, String education, String address, Date hiredate, int department_id, int position_id, int workstate, String icon) {
        this.job_id = job_id;
        this.ename = ename;
        this.sex = sex;
        this.phone = phone;
        this.birth = birth;
        this.idcard = idcard;
        this.hometown = hometown;
        this.nation = nation;
        this.education = education;
        this.address = address;
        this.hiredate = hiredate;
        this.department_id = department_id;
        this.position_id = position_id;
        this.workstate = workstate;
        this.icon = icon;
    }

    public Employees() {
    }

}
