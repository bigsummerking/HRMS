package com.king.hrmsdev.pojo;

/**
 * @Auther:SnakeKing
 * @Date: 2019-11-20
 * @Description: com.king.hrmsdev.pojo
 * @version:1.0
 */
public class employee_salary {
    private String department;
    private int employee_salarys;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmployee_salarys() {
        return employee_salarys;
    }

    public void setEmployee_salarys(int employee_salarys) {
        this.employee_salarys = employee_salarys;
    }

    @Override
    public String toString() {
        return "employee_salary{" +
                "department='" + department + '\'' +
                ", employee_salarys=" + employee_salarys +
                '}';
    }
}
