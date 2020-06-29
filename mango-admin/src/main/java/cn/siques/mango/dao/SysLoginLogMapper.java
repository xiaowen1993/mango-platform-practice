package cn.siques.mango.dao;

import cn.siques.mango.entity.SysLoginLog;
import cn.siques.mango.entity.SysLoginLogExample;
import cn.siques.mango.entity.SysLoginLogKey;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SysLoginLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    @SelectProvider(type=SysLoginLogSqlProvider.class, method="countByExample")
    int countByExample(SysLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    @DeleteProvider(type=SysLoginLogSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    @Delete({
        "delete from sys_login_log",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(SysLoginLogKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    @Insert({
        "insert into sys_login_log (id, user_name, ",
        "status, ip, create_by, ",
        "create_time, last_update_by, ",
        "last_update_time, remarks)",
        "values (#{id,jdbcType=BIGINT}, #{userName,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=VARCHAR}, #{ip,jdbcType=VARCHAR}, #{createBy,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateTime,jdbcType=TIMESTAMP}, #{remarks,jdbcType=VARCHAR})"
    })
    int insert(SysLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    @InsertProvider(type=SysLoginLogSqlProvider.class, method="insertSelective")
    int insertSelective(SysLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    @SelectProvider(type=SysLoginLogSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_update_by", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_update_time", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR)
    })
    List<SysLoginLog> selectByExample(SysLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    @Select({
        "select",
        "id, user_name, status, ip, create_by, create_time, last_update_by, last_update_time, ",
        "remarks",
        "from sys_login_log",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_update_by", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_update_time", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR)
    })
    SysLoginLog selectByPrimaryKey(SysLoginLogKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    @UpdateProvider(type=SysLoginLogSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysLoginLog record, @Param("example") SysLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    @UpdateProvider(type=SysLoginLogSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysLoginLog record, @Param("example") SysLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    @UpdateProvider(type=SysLoginLogSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    @Update({
        "update sys_login_log",
        "set user_name = #{userName,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=VARCHAR},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "create_by = #{createBy,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "last_update_by = #{lastUpdateBy,jdbcType=VARCHAR},",
          "last_update_time = #{lastUpdateTime,jdbcType=TIMESTAMP},",
          "remarks = #{remarks,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SysLoginLog record);
}