package com.king.hrmsdev.entity;

/**
 * @Auther:SnakeKing
 * @Date: 2019-09-11
 * @Description: com.king.hrmsdev.entity
 * @version:1.0
 */
public class Department {
    private int department_id;
    private String department;
    private int employee_count;
    private String manager;
    private int state;
    private String departmentName;
    private  int count;
    public Department(String departmentName, int count) {
        this.departmentName = departmentName;
        this.count = count;
    }
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmployee_count() {
        return employee_count;
    }

    public void setEmployee_count(int employee_count) {
        this.employee_count = employee_count;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Department(int department_id, String department, int employee_count, String manager, int state) {
        this.department_id = department_id;
        this.department = department;
        this.employee_count = employee_count;
        this.manager = manager;
        this.state = state;
    }

    public Department() {

    }

    @Override
    public String toString() {
        return "Department{" +
                "department_id=" + department_id +
                ", department='" + department + '\'' +
                ", employee_count=" + employee_count +
                ", manager='" + manager + '\'' +
                ", state=" + state +
                '}';
    }
}
