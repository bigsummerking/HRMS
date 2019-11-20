package com.king.hrmsdev.pojo;

/**
 * @Auther:SnakeKing
 * @Date: 2019-11-20
 * @Description: com.king.hrmsdev.pojo
 * @version:1.0
 */
public class ReportSalary {
    private String  ename;
    private String  department;
    private int     salary;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ReportSalary{" +
                "ename='" + ename + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
