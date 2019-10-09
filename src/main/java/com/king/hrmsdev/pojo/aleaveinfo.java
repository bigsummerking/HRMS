package com.king.hrmsdev.pojo;

public class aleaveinfo {
    private int aleave_id;
    private int job_id;
    private String btime;
    private String etime;
    private String reason;
    private int examine;
    private String ename;
    private int sex;

    public int getAleave_id() {
        return aleave_id;
    }

    public void setAleave_id(int aleave_id) {
        this.aleave_id = aleave_id;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public String getBtime() {
        return btime;
    }

    public void setBtime(String btime) {
        this.btime = btime;
    }

    public String getEtime() {
        return etime;
    }

    public void setEtime(String etime) {
        this.etime = etime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getExamine() {
        return examine;
    }

    public void setExamine(int examine) {
        this.examine = examine;
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

    public aleaveinfo(int aleave_id, int job_id, String btime, String etime, String reason, int examine, String ename, int sex) {
        this.aleave_id = aleave_id;
        this.job_id = job_id;
        this.btime = btime;
        this.etime = etime;
        this.reason = reason;
        this.examine = examine;
        this.ename = ename;
        this.sex = sex;
    }

    public aleaveinfo() {
    }

    @Override
    public String toString() {
        return "aleaveinfo{" +
                "aleave_id=" + aleave_id +
                ", job_id=" + job_id +
                ", btime='" + btime + '\'' +
                ", etime='" + etime + '\'' +
                ", reason='" + reason + '\'' +
                ", examine=" + examine +
                ", ename='" + ename + '\'' +
                ", sex=" + sex +
                '}';
    }
}
