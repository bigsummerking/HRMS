package com.king.hrmsdev.entity;

import java.sql.Date;

/**
 * @Auther:SnakeKing
 * @Date: 2019-09-11
 * @Description: com.king.hrmsdev.entity
 * @version:1.0
 */
public class JobChange {
    private int change_id;
    private int job_id;
    private int beforedp_id;
    private int afterdp_id;
    private Date changetime;

    public int getChange_id() {
        return change_id;
    }

    public void setChange_id(int change_id) {
        this.change_id = change_id;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public int getBeforedp_id() {
        return beforedp_id;
    }

    public void setBeforedp_id(int beforedp_id) {
        this.beforedp_id = beforedp_id;
    }

    public int getAfterdp_id() {
        return afterdp_id;
    }

    public void setAfterdp_id(int afterdp_id) {
        this.afterdp_id = afterdp_id;
    }

    public Date getChangetime() {
        return changetime;
    }

    public void setChangetime(Date changetime) {
        this.changetime = changetime;
    }

    public JobChange(int change_id, int job_id, int beforedp_id, int afterdp_id, Date changetime) {
        this.change_id = change_id;
        this.job_id = job_id;
        this.beforedp_id = beforedp_id;
        this.afterdp_id = afterdp_id;
        this.changetime = changetime;
    }

    public JobChange() {
    }

    @Override
    public String toString() {
        return "JobChange{" +
                "change_id=" + change_id +
                ", job_id=" + job_id +
                ", beforedp_id=" + beforedp_id +
                ", afterdp_id=" + afterdp_id +
                ", changetime=" + changetime +
                '}';
    }
}
