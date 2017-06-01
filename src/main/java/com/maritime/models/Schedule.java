package com.maritime.models;

import java.util.Date;

public class Schedule {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.schedule.sid
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    private Integer sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.schedule.scid
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    private Integer scid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.schedule.sterm
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    private String sterm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.schedule.sweek
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    private Integer sweek;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.schedule.ssection
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    private Integer ssection;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.schedule.spositon
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    private String spositon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.schedule.is_active
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    private Boolean isActive;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.schedule.sdescription
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    private String sdescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.schedule.last_update_user
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    private String lastUpdateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maritime.schedule.last_update_dt
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    private Date lastUpdateDt;

    private String cname;

    private String week;

    private String section;

    private Integer frequency;

    private String freq;

    private Integer allPeople;

    private Integer remainPeople;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.schedule.sid
     *
     * @return the value of maritime.schedule.sid
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.schedule.sid
     *
     * @param sid the value for maritime.schedule.sid
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.schedule.scid
     *
     * @return the value of maritime.schedule.scid
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public Integer getScid() {
        return scid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.schedule.scid
     *
     * @param scid the value for maritime.schedule.scid
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public void setScid(Integer scid) {
        this.scid = scid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.schedule.sterm
     *
     * @return the value of maritime.schedule.sterm
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public String getSterm() {
        return sterm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.schedule.sterm
     *
     * @param sterm the value for maritime.schedule.sterm
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public void setSterm(String sterm) {
        this.sterm = sterm == null ? null : sterm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.schedule.sweek
     *
     * @return the value of maritime.schedule.sweek
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public Integer getSweek() {
        return sweek;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.schedule.sweek
     *
     * @param sweek the value for maritime.schedule.sweek
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public void setSweek(Integer sweek) {
        this.sweek = sweek;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.schedule.ssection
     *
     * @return the value of maritime.schedule.ssection
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public Integer getSsection() {
        return ssection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.schedule.ssection
     *
     * @param ssection the value for maritime.schedule.ssection
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public void setSsection(Integer ssection) {
        this.ssection = ssection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.schedule.spositon
     *
     * @return the value of maritime.schedule.spositon
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public String getSpositon() {
        return spositon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.schedule.spositon
     *
     * @param spositon the value for maritime.schedule.spositon
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public void setSpositon(String spositon) {
        this.spositon = spositon == null ? null : spositon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.schedule.is_active
     *
     * @return the value of maritime.schedule.is_active
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.schedule.is_active
     *
     * @param isActive the value for maritime.schedule.is_active
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.schedule.sdescription
     *
     * @return the value of maritime.schedule.sdescription
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public String getSdescription() {
        return sdescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.schedule.sdescription
     *
     * @param sdescription the value for maritime.schedule.sdescription
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public void setSdescription(String sdescription) {
        this.sdescription = sdescription == null ? null : sdescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.schedule.last_update_user
     *
     * @return the value of maritime.schedule.last_update_user
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.schedule.last_update_user
     *
     * @param lastUpdateUser the value for maritime.schedule.last_update_user
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser == null ? null : lastUpdateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maritime.schedule.last_update_dt
     *
     * @return the value of maritime.schedule.last_update_dt
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public Date getLastUpdateDt() {
        return lastUpdateDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maritime.schedule.last_update_dt
     *
     * @param lastUpdateDt the value for maritime.schedule.last_update_dt
     *
     * @mbggenerated Wed May 24 16:49:51 CST 2017
     */
    public void setLastUpdateDt(Date lastUpdateDt) {
        this.lastUpdateDt = lastUpdateDt;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }

    public Integer getAllPeople() {
        return allPeople;
    }

    public void setAllPeople(Integer allPeople) {
        this.allPeople = allPeople;
    }

    public Integer getRemainPeople() {
        return remainPeople;
    }

    public void setRemainPeople(Integer remainPeople) {
        this.remainPeople = remainPeople;
    }
}