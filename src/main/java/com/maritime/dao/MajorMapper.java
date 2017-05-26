package com.maritime.dao;

import com.maritime.models.Major;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MajorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maritime.major
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    int deleteByPrimaryKey(Integer mid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maritime.major
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    int insert(Major record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maritime.major
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    int insertSelective(Major record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maritime.major
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    Major selectByPrimaryKey(Integer mid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maritime.major
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    int updateByPrimaryKeySelective(Major record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maritime.major
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    int updateByPrimaryKey(Major record);

    List<Major> selectByAcademy(Integer macademy);
}