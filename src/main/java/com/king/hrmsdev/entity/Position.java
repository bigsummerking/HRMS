package com.king.hrmsdev.entity;

import java.math.BigDecimal;

/**
 * @Auther:SnakeKing
 * @Date: 2019-09-11
 * @Description: com.king.hrmsdev.entity
 * @version:1.0
 */
public class Position {
    private int position_id;
    private String position_name;
    private BigDecimal salary;

    public int getPosition_id() {
        return position_id;
    }

    public void setPosition_id(int position_id) {
        this.position_id = position_id;
    }

    public String getPosition() {
        return position_name;
    }

    public void setPosition(String position_name) {
        this.position_name = position_name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Position(int position_id, String position_name, BigDecimal salary) {
        this.position_id = position_id;
        this.position_name = position_name;
        this.salary = salary;
    }

    public Position() {
    }

    @Override
    public String toString() {
        return "Position{" +
                "position_id=" + position_id +
                ", position_name='" + position_name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
