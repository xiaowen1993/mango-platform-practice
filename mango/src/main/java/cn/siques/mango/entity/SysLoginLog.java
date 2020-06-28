package cn.siques.mango.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Model class of 登陆日志表.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class SysLoginLog implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 编号. */
	private Long id;

	/** 用户名. */
	private String userName;

	/** 登陆状态online login logout. */
	private String status;

	/** IP 地址. */
	private String ip;

	/** 创建人. */
	private String createBy;

	/** 创建时间. */
	private Date createTime;

	/** 更新人. */
	private String lastUpdateBy;

	/** 更新时间. */
	private Date lastUpdateTime;

	/** 备注. */
	private String remarks;

	/**
	 * Constructor.
	 */
	public SysLoginLog() {
	}

	/**
	 * Set the 编号.
	 * 
	 * @param id
	 *            编号
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Get the 编号.
	 * 
	 * @return 编号
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Set the 用户名.
	 * 
	 * @param userName
	 *            用户名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Get the 用户名.
	 * 
	 * @return 用户名
	 */
	public String getUserName() {
		return this.userName;
	}

	/**
	 * Set the 登陆状态online login logout.
	 * 
	 * @param status
	 *            登陆状态online login logout
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Get the 登陆状态online login logout.
	 * 
	 * @return 登陆状态online login logout
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * Set the IP 地址.
	 * 
	 * @param ip
	 *            IP 地址
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * Get the IP 地址.
	 * 
	 * @return IP 地址
	 */
	public String getIp() {
		return this.ip;
	}

	/**
	 * Set the 创建人.
	 * 
	 * @param createBy
	 *            创建人
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	/**
	 * Get the 创建人.
	 * 
	 * @return 创建人
	 */
	public String getCreateBy() {
		return this.createBy;
	}

	/**
	 * Set the 创建时间.
	 * 
	 * @param createTime
	 *            创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * Get the 创建时间.
	 * 
	 * @return 创建时间
	 */
	public Date getCreateTime() {
		return this.createTime;
	}

	/**
	 * Set the 更新人.
	 * 
	 * @param lastUpdateBy
	 *            更新人
	 */
	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	/**
	 * Get the 更新人.
	 * 
	 * @return 更新人
	 */
	public String getLastUpdateBy() {
		return this.lastUpdateBy;
	}

	/**
	 * Set the 更新时间.
	 * 
	 * @param lastUpdateTime
	 *            更新时间
	 */
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	/**
	 * Get the 更新时间.
	 * 
	 * @return 更新时间
	 */
	public Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	/**
	 * Set the 备注.
	 * 
	 * @param remarks
	 *            备注
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * Get the 备注.
	 * 
	 * @return 备注
	 */
	public String getRemarks() {
		return this.remarks;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		SysLoginLog other = (SysLoginLog) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}