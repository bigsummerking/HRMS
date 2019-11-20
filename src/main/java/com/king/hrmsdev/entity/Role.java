package com.king.hrmsdev.entity;


public class Role {
    private int job_id;
    private String realname;
    private int role_id;

    public int getJob_id(){return job_id;}

    public void setJob_id(int job_id){this.job_id = job_id;}

    public String getRealname(){return realname;}

    public void setRealname(String realname){this.realname = realname;}

    public int getRole_id(){return role_id;}

    public void setRole_id(int role_id){this.role_id = role_id;}

    public Role(int job_id,String realname,int role_id){
        this.job_id = job_id;
        this.realname = realname;
        this.role_id = role_id;
    }

    public Role(){
    }
    @Override
    public String toString() {
        return "Role{" +
                ", job_id=" + job_id +
                ", realname=" + realname +
                ", role_id=" + role_id +
                '}';
    }
}
