package com.king.hrmsdev.pojo;

public class echeckinfo {
    private int echeck_id;
    private int job_id;
    private String opentime;
    private String closetime;
    private int state;
    private String ename;
    private int sex;

    public int getEcheck_id() {
        return echeck_id;
    }

    public void setEcheck_id(int echeck_id) {
        this.echeck_id = echeck_id;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public String getOpentime() {
        return opentime;
    }

    public void setOpentime(String opentime) {
        this.opentime = opentime;
    }

    public String getClosetime() {
        return closetime;
    }

    public void setClosetime(String closetime) {
        this.closetime = closetime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
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

    public echeckinfo(int echeck_id, int job_id, String opentime, String closetime, int state, String ename, int sex) {
        this.echeck_id = echeck_id;
        this.job_id = job_id;
        this.opentime = opentime;
        this.closetime = closetime;
        this.state = state;
        this.ename = ename;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "echeckinfo{" +
                "echeck_id=" + echeck_id +
                ", job_id=" + job_id +
                ", opentime='" + opentime + '\'' +
                ", closetime='" + closetime + '\'' +
                ", state=" + state +
                ", ename='" + ename + '\'' +
                ", sex=" + sex +
                '}';
    }
}
