package com.maritime.models;

import java.util.Date;

public class Point {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.point.pid
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.point.psid
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private Integer psid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.point.pcategory
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private Integer pcategory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.point.ptype
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private Integer ptype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.point.is_active
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private Boolean isActive;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.point.pdescription
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private String pdescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.point.last_update_user
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private String lastUpdateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.point.last_update_dt
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private Date lastUpdateDt;

    private Float ppoint;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.point.pid
     *
     * @return the value of maritime.point.pid
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.point.pid
     *
     * @param pid the value for maritime.point.pid
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.point.psid
     *
     * @return the value of maritime.point.psid
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public Integer getPsid() {
        return psid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.point.psid
     *
     * @param psid the value for maritime.point.psid
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setPsid(Integer psid) {
        this.psid = psid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.point.pcategory
     *
     * @return the value of maritime.point.pcategory
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public Integer getPcategory() {
        return pcategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.point.pcategory
     *
     * @param pcategory the value for maritime.point.pcategory
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setPcategory(Integer pcategory) {
        this.pcategory = pcategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.point.ptype
     *
     * @return the value of maritime.point.ptype
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public Integer getPtype() {
        return ptype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.point.ptype
     *
     * @param ptype the value for maritime.point.ptype
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setPtype(Integer ptype) {
        this.ptype = ptype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.point.is_active
     *
     * @return the value of maritime.point.is_active
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.point.is_active
     *
     * @param isActive the value for maritime.point.is_active
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.point.pdescription
     *
     * @return the value of maritime.point.pdescription
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public String getPdescription() {
        return pdescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.point.pdescription
     *
     * @param pdescription the value for maritime.point.pdescription
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setPdescription(String pdescription) {
        this.pdescription = pdescription == null ? null : pdescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.point.last_update_user
     *
     * @return the value of maritime.point.last_update_user
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.point.last_update_user
     *
     * @param lastUpdateUser the value for maritime.point.last_update_user
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser == null ? null : lastUpdateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.point.last_update_dt
     *
     * @return the value of maritime.point.last_update_dt
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public Date getLastUpdateDt() {
        return lastUpdateDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.point.last_update_dt
     *
     * @param lastUpdateDt the value for maritime.point.last_update_dt
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setLastUpdateDt(Date lastUpdateDt) {
        this.lastUpdateDt = lastUpdateDt;
    }

    public Float getPpoint() {
        return ppoint;
    }

    public void setPpoint(Float ppoint) {
        this.ppoint = ppoint;
    }
}