package com.smart.crm.clue;

import com.smart.crm.clue.Activities;
import com.smart.crm.clue.ActivitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivitiesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activities
     *
     * @mbg.generated Sat Jun 15 16:31:43 CST 2024
     */
    long countByExample(ActivitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activities
     *
     * @mbg.generated Sat Jun 15 16:31:43 CST 2024
     */
    int deleteByExample(ActivitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activities
     *
     * @mbg.generated Sat Jun 15 16:31:43 CST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activities
     *
     * @mbg.generated Sat Jun 15 16:31:43 CST 2024
     */
    int insert(Activities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activities
     *
     * @mbg.generated Sat Jun 15 16:31:43 CST 2024
     */
    int insertSelective(Activities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activities
     *
     * @mbg.generated Sat Jun 15 16:31:43 CST 2024
     */
    List<Activities> selectByExampleWithBLOBs(ActivitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activities
     *
     * @mbg.generated Sat Jun 15 16:31:43 CST 2024
     */
    List<Activities> selectByExample(ActivitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activities
     *
     * @mbg.generated Sat Jun 15 16:31:43 CST 2024
     */
    Activities selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activities
     *
     * @mbg.generated Sat Jun 15 16:31:43 CST 2024
     */
    int updateByExampleSelective(@Param("record") Activities record, @Param("example") ActivitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activities
     *
     * @mbg.generated Sat Jun 15 16:31:43 CST 2024
     */
    int updateByExampleWithBLOBs(@Param("record") Activities record, @Param("example") ActivitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activities
     *
     * @mbg.generated Sat Jun 15 16:31:43 CST 2024
     */
    int updateByExample(@Param("record") Activities record, @Param("example") ActivitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activities
     *
     * @mbg.generated Sat Jun 15 16:31:43 CST 2024
     */
    int updateByPrimaryKeySelective(Activities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activities
     *
     * @mbg.generated Sat Jun 15 16:31:43 CST 2024
     */
    int updateByPrimaryKeyWithBLOBs(Activities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activities
     *
     * @mbg.generated Sat Jun 15 16:31:43 CST 2024
     */
    int updateByPrimaryKey(Activities record);
}