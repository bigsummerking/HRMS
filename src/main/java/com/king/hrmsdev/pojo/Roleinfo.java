package com.king.hrmsdev.pojo;

/**
 * @Copyright (C), 2015-2019, XXX有限公司
 * @ClassName: Roleinfo
 * @Author: 作者姓名(一般是写姓名的拼音)
 * @E-mail: 邮箱
 * @Date: 2019/10/10 10:39
 * @Version: V1.0
 * @Description: 对该类的描述
 */
public class Roleinfo {
    private int job_id;
    private String realname;
    private int role_id;

    public int getJob_id(){return job_id;}

    public void setJob_id(int job_id){this.job_id = job_id;}

    public String getRealname(){return realname;}

    public void setRealname(String realname){this.realname = realname;}

    public int getRole_id(){return role_id;}

    public void setRole_id(int role_id){this.role_id = role_id;}

    public Roleinfo(int job_id,String realname,int role_id){
        this.job_id = job_id;
        this.realname = realname;
        this.role_id = role_id;
    }
    public Roleinfo(){

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
