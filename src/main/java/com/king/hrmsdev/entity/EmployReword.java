package com.king.hrmsdev.entity;

/**
 * creat By EmployReword 0n 2019/9/21
 */
public class EmployReword {
    private  int reward_id;//奖惩ID
    private  int job_id;//工号ID
    private  String checktime;//检查年月
    private  int  overtime;//加班次数
    private  int  late;//迟到次数
    private  int  leaveearly;//早退次数
    private  int leave;//请假次数
    private  int absenteeism;//旷工次数

    public EmployReword() {
    }

    public EmployReword(int reward_id, int job_id, String checktime, int overtime, int late, int leaveearly, int leave, int absenteeism) {
        this.reward_id = reward_id;
        this.job_id = job_id;
        this.checktime = checktime;
        this.overtime = overtime;
        this.late = late;
        this.leaveearly = leaveearly;
        this.leave = leave;
        this.absenteeism = absenteeism;
    }

    public int getReward_id() {
        return reward_id;
    }

    public void setReward_id(int reward_id) {
        this.reward_id = reward_id;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public int getLate() {
        return late;
    }

    public void setLate(int late) {
        this.late = late;
    }

    public int getLeaveearly() {
        return leaveearly;
    }

    public void setLeaveearly(int leaveearly) {
        this.leaveearly = leaveearly;
    }

    public int getLeave() {
        return leave;
    }

    public void setLeave(int leave) {
        this.leave = leave;
    }

    public int getAbsenteeism() {
        return absenteeism;
    }

    public void setAbsenteeism(int absenteeism) {
        this.absenteeism = absenteeism;
    }
}
