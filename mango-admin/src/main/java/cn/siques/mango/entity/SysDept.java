package cn.siques.mango.entity;

import java.util.Date;

public class SysDept extends SysDeptKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.name
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.parent_id
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    private Long parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.order_numm
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    private Integer orderNumm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.create_by
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    private String createBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.create_time
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.last_update_by
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    private String lastUpdateBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.last_update_time
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.del_flag
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    private Byte delFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.name
     *
     * @return the value of sys_dept.name
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.name
     *
     * @param name the value for sys_dept.name
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.parent_id
     *
     * @return the value of sys_dept.parent_id
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.parent_id
     *
     * @param parentId the value for sys_dept.parent_id
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.order_numm
     *
     * @return the value of sys_dept.order_numm
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    public Integer getOrderNumm() {
        return orderNumm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.order_numm
     *
     * @param orderNumm the value for sys_dept.order_numm
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    public void setOrderNumm(Integer orderNumm) {
        this.orderNumm = orderNumm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.create_by
     *
     * @return the value of sys_dept.create_by
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.create_by
     *
     * @param createBy the value for sys_dept.create_by
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.create_time
     *
     * @return the value of sys_dept.create_time
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.create_time
     *
     * @param createTime the value for sys_dept.create_time
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.last_update_by
     *
     * @return the value of sys_dept.last_update_by
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.last_update_by
     *
     * @param lastUpdateBy the value for sys_dept.last_update_by
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.last_update_time
     *
     * @return the value of sys_dept.last_update_time
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.last_update_time
     *
     * @param lastUpdateTime the value for sys_dept.last_update_time
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.del_flag
     *
     * @return the value of sys_dept.del_flag
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    public Byte getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.del_flag
     *
     * @param delFlag the value for sys_dept.del_flag
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }
}