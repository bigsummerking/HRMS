package com.king.hrmsdev.entity;

/**
 * @Auther:SnakeKing
 * @Date: 2019-09-11
 * @Description: com.king.hrmsdev.entity
 * @version:1.0
 */
public class DPRelation {

    private int relationship_id;
    private int department_id;
    private int position_id;

    public int getRelationship_id() {
        return relationship_id;
    }

    public void setRelationship_id(int relationship_id) {
        this.relationship_id = relationship_id;
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

    public DPRelation(int relationship_id, int department_id, int position_id) {
        this.relationship_id = relationship_id;
        this.department_id = department_id;
        this.position_id = position_id;
    }

    public DPRelation() {
    }

    @Override
    public String toString() {
        return "DPRelation{" +
                "relationship_id=" + relationship_id +
                ", department_id=" + department_id +
                ", position_id=" + position_id +
                '}';
    }
}
