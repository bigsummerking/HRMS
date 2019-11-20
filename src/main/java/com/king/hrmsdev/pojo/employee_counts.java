package com.king.hrmsdev.pojo;

/**
 * @Auther:SnakeKing
 * @Date: 2019-11-20
 * @Description: com.king.hrmsdev.pojo
 * @version:1.0
 */
public class employee_counts {

    private String department;
    private int employee_count;

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

    @Override
    public String toString() {
        return "employee_counts{" +
                "department='" + department + '\'' +
                ", employee_count=" + employee_count +
                '}';
    }
}
