package com.maritime.dao;

import com.maritime.models.Point;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PointMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maritime.point
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    int deleteByPrimaryKey(Integer pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maritime.point
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    int insert(Point record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maritime.point
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    int insertSelective(Point record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maritime.point
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    Point selectByPrimaryKey(Integer pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maritime.point
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    int updateByPrimaryKeySelective(Point record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maritime.point
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    int updateByPrimaryKey(Point record);
}