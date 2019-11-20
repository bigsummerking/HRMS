package com.king.hrmsdev.pojo;

/**
 * @Auther:SnakeKing
 * @Date: 2019-11-20
 * @Description: com.king.hrmsdev.pojo
 * @version:1.0
 */
public class employee_check {
    private int state;
    private int count;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "employee_check{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
