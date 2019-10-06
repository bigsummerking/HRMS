package com.king.hrmsdev.entity;

/**
 * @Auther:SnakeKing
 * @Date: 2019-09-08
 * @Description: com.king.hrms.entity
 * @version:1.0
 */
public class User {
    private  int jobid;
    private  String username;
    private  String password;
    private  String wechatid;
    private  String realname;
    private  String roleid;

    public int getJobid() {
        return jobid;
    }

    public void setJobid(int jobid) {
        this.jobid = jobid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWechatid() {
        return wechatid;
    }

    public void setWechatid(String wechatid) {
        this.wechatid = wechatid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public User(int jobid, String username, String password, String wechatid, String realname, String roleid) {
        this.jobid = jobid;
        this.username = username;
        this.password = password;
        this.wechatid = wechatid;
        this.realname = realname;
        this.roleid = roleid;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "jobid=" + jobid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", wechatid='" + wechatid + '\'' +
                ", realname='" + realname + '\'' +
                ", roleid='" + roleid + '\'' +
                '}';
    }
}
