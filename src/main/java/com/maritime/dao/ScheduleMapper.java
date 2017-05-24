package com.maritime.dao;

import com.maritime.models.Schedule;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScheduleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maritime.schedule
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    int deleteByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maritime.schedule
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    int insert(Schedule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maritime.schedule
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    int insertSelective(Schedule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maritime.schedule
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    Schedule selectByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maritime.schedule
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    int updateByPrimaryKeySelective(Schedule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maritime.schedule
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    int updateByPrimaryKey(Schedule record);
}