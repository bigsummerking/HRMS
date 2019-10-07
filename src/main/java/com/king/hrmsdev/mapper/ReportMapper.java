package com.king.hrmsdev.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;

/**
 * creat By ReportMapper 0n 2019/9/21
 */
@Mapper
public interface ReportMapper {
    Integer   QuaryToualByID(int department_id);//查询每个部门总人数
    Integer   QuaryCheckByID(int department_id);//查询每个部门月旷工次数
    BigDecimal QuarySlaryByID(int department_id);//查询每个部门月总工资

}
