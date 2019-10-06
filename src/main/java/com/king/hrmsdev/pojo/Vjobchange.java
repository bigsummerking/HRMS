package com.king.hrmsdev.pojo;

import java.sql.Date;

/**
 * @Auther:SnakeKing
 * @Date: 2019-09-23
 * @Description: com.king.hrmsdev.pojo
 * @version:1.0
 */
public class Vjobchange {
    private int change_id;
    private String job_id;
    private String beforedp_id;
    private String afterdp_id;
    private Date changetime;

    public int getChange_id() {
        return change_id;
    }

    public void setChange_id(int change_id) {
        this.change_id = change_id;
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getBeforedp_id() {
        return beforedp_id;
    }

    public void setBeforedp_id(String beforedp_id) {
        this.beforedp_id = beforedp_id;
    }

    public String getAfterdp_id() {
        return afterdp_id;
    }

    public void setAfterdp_id(String afterdp_id) {
        this.afterdp_id = afterdp_id;
    }

    public Date getChangetime() {
        return changetime;
    }

    public void setChangetime(Date changetime) {
        this.changetime = changetime;
    }

    public Vjobchange(int change_id, String job_id, String beforedp_id, String afterdp_id, Date changetime) {
        this.change_id = change_id;
        this.job_id = job_id;
        this.beforedp_id = beforedp_id;
        this.afterdp_id = afterdp_id;
        this.changetime = changetime;
    }

    public Vjobchange() {

    }

    @Override
    public String toString() {
        return "Vjobchange{" +
                "change_id=" + change_id +
                ", job_id='" + job_id + '\'' +
                ", beforedp_id='" + beforedp_id + '\'' +
                ", afterdp_id='" + afterdp_id + '\'' +
                ", changetime=" + changetime +
                '}';
    }
}
