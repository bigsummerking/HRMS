package com.king.hrmsdev.pojo;

/**
 * @Auther:SnakeKing
 * @Date: 2019-09-23
 * @Description: com.king.hrmsdev.pojo
 * @version:1.0
 */
public class Peoplecountindepart {

    private int department_id;
    private int department_count;

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public int getDepartment_count() {
        return department_count;
    }

    public void setDepartment_count(int department_count) {
        this.department_count = department_count;
    }

    @Override
    public String toString() {
        return "Peoplecountindepart{" +
                "department_id=" + department_id +
                ", department_count=" + department_count +
                '}';
    }
}
