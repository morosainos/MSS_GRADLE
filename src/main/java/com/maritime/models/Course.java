package com.maritime.models;

import java.util.Date;

public class Course {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.course.coid
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private Integer coid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.course.coname
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private String coname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.course.conumber
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private Long conumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.course.coteacher1
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private Integer coteacher1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.course.coteacher2
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private Integer coteacher2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.course.is_active
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private Boolean isActive;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.course.coacademy
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private Integer coacademy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.course.cocategory
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private Integer cocategory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.course.cotype
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private Integer cotype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.course.copoint
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private Float copoint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.course.cohour
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private Integer cohour;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.course.codescription
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private String codescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.course.last_update_user
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private String lastUpdateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.course.last_update_dt
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    private Date lastUpdateDt;

    private Integer coExamType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.course.coid
     *
     * @return the value of maritime.course.coid
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public Integer getCoid() {
        return coid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.course.coid
     *
     * @param coid the value for maritime.course.coid
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setCoid(Integer coid) {
        this.coid = coid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.course.coname
     *
     * @return the value of maritime.course.coname
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public String getConame() {
        return coname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.course.coname
     *
     * @param coname the value for maritime.course.coname
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setConame(String coname) {
        this.coname = coname == null ? null : coname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.course.conumber
     *
     * @return the value of maritime.course.conumber
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public Long getConumber() {
        return conumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.course.conumber
     *
     * @param conumber the value for maritime.course.conumber
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setConumber(Long conumber) {
        this.conumber = conumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.course.coteacher1
     *
     * @return the value of maritime.course.coteacher1
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public Integer getCoteacher1() {
        return coteacher1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.course.coteacher1
     *
     * @param coteacher1 the value for maritime.course.coteacher1
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setCoteacher1(Integer coteacher1) {
        this.coteacher1 = coteacher1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.course.coteacher2
     *
     * @return the value of maritime.course.coteacher2
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public Integer getCoteacher2() {
        return coteacher2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.course.coteacher2
     *
     * @param coteacher2 the value for maritime.course.coteacher2
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setCoteacher2(Integer coteacher2) {
        this.coteacher2 = coteacher2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.course.is_active
     *
     * @return the value of maritime.course.is_active
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.course.is_active
     *
     * @param isActive the value for maritime.course.is_active
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.course.coacademy
     *
     * @return the value of maritime.course.coacademy
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public Integer getCoacademy() {
        return coacademy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.course.coacademy
     *
     * @param coacademy the value for maritime.course.coacademy
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setCoacademy(Integer coacademy) {
        this.coacademy = coacademy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.course.cocategory
     *
     * @return the value of maritime.course.cocategory
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public Integer getCocategory() {
        return cocategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.course.cocategory
     *
     * @param cocategory the value for maritime.course.cocategory
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setCocategory(Integer cocategory) {
        this.cocategory = cocategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.course.cotype
     *
     * @return the value of maritime.course.cotype
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public Integer getCotype() {
        return cotype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.course.cotype
     *
     * @param cotype the value for maritime.course.cotype
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setCotype(Integer cotype) {
        this.cotype = cotype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.course.copoint
     *
     * @return the value of maritime.course.copoint
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public Float getCopoint() {
        return copoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.course.copoint
     *
     * @param copoint the value for maritime.course.copoint
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setCopoint(Float copoint) {
        this.copoint = copoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.course.cohour
     *
     * @return the value of maritime.course.cohour
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public Integer getCohour() {
        return cohour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.course.cohour
     *
     * @param cohour the value for maritime.course.cohour
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setCohour(Integer cohour) {
        this.cohour = cohour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.course.codescription
     *
     * @return the value of maritime.course.codescription
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public String getCodescription() {
        return codescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.course.codescription
     *
     * @param codescription the value for maritime.course.codescription
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setCodescription(String codescription) {
        this.codescription = codescription == null ? null : codescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.course.last_update_user
     *
     * @return the value of maritime.course.last_update_user
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.course.last_update_user
     *
     * @param lastUpdateUser the value for maritime.course.last_update_user
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser == null ? null : lastUpdateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.course.last_update_dt
     *
     * @return the value of maritime.course.last_update_dt
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public Date getLastUpdateDt() {
        return lastUpdateDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.course.last_update_dt
     *
     * @param lastUpdateDt the value for maritime.course.last_update_dt
     *
     * @mbggenerated Wed Apr 19 22:55:14 CST 2017
     */
    public void setLastUpdateDt(Date lastUpdateDt) {
        this.lastUpdateDt = lastUpdateDt;
    }

    public Integer getCoExamType() {
        return coExamType;
    }

    public void setCoExamType(Integer coExamType) {
        this.coExamType = coExamType;
    }

}