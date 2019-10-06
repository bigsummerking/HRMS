package com.king.hrmsdev.pojo;

import java.math.BigDecimal;

/**
 * @Auther:SnakeKing
 * @Date: 2019-09-24
 * @Description: com.king.hrmsdev.pojo
 * @version:1.0
 */
public class Vposition {
    private int relationship_id;
    private String position_name;
    private String department_name;
    private int department_id;
    private int position_id;
    private BigDecimal salary;

    public int getRelationship_id() {
        return relationship_id;
    }

    public void setRelationship_id(int relationship_id) {
        this.relationship_id = relationship_id;
    }

    public String getPosition_name() {
        return position_name;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public int getPosition_id() {
        return position_id;
    }

    public void setPosition_id(int position_id) {
        this.position_id = position_id;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Vposition{" +
                "relationship_id=" + relationship_id +
                ", position_name='" + position_name + '\'' +
                ", department_name='" + department_name + '\'' +
                ", department_id=" + department_id +
                ", position_id=" + position_id +
                ", salary=" + salary +
                '}';
    }
}
