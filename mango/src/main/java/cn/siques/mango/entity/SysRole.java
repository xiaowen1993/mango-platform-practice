package cn.siques.mango.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of 角色管理.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class SysRole implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 编号. */
	private Long id;

	/** 角色名称. */
	private String name;

	/** 备注. */
	private String remark;

	/** 创建人. */
	private String createBy;

	/** 创建时间. */
	private Date createTime;

	/** 更新人. */
	private String lastUpdateBy;

	/** 更新时间. */
	private Date lastUpdateTime;

	/** 是否删除 -1：已删除 0：正常. */
	private Byte delFlag;

	/** The set of 角色机构管理. */
	private Set<SysRoleDept> sysRoleDeptSet;

	/** The set of 角色菜单管理. */
	private Set<SysRoleMenu> sysRoleMenuSet;

	/** The set of 用户角色表. */
	private Set<SysUserRole> sysUserRoleSet;

	/**
	 * Constructor.
	 */
	public SysRole() {
		this.sysRoleDeptSet = new HashSet<SysRoleDept>();
		this.sysRoleMenuSet = new HashSet<SysRoleMenu>();
		this.sysUserRoleSet = new HashSet<SysUserRole>();
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
	 * Set the 角色名称.
	 * 
	 * @param name
	 *            角色名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the 角色名称.
	 * 
	 * @return 角色名称
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the 备注.
	 * 
	 * @param remark
	 *            备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * Get the 备注.
	 * 
	 * @return 备注
	 */
	public String getRemark() {
		return this.remark;
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
	 * Set the 是否删除 -1：已删除 0：正常.
	 * 
	 * @param delFlag
	 *            是否删除 -1：已删除 0：正常
	 */
	public void setDelFlag(Byte delFlag) {
		this.delFlag = delFlag;
	}

	/**
	 * Get the 是否删除 -1：已删除 0：正常.
	 * 
	 * @return 是否删除 -1：已删除 0：正常
	 */
	public Byte getDelFlag() {
		return this.delFlag;
	}

	/**
	 * Set the set of the 角色机构管理.
	 * 
	 * @param sysRoleDeptSet
	 *            The set of 角色机构管理
	 */
	public void setSysRoleDeptSet(Set<SysRoleDept> sysRoleDeptSet) {
		this.sysRoleDeptSet = sysRoleDeptSet;
	}

	/**
	 * Add the 角色机构管理.
	 * 
	 * @param sysRoleDept
	 *            角色机构管理
	 */
	public void addSysRoleDept(SysRoleDept sysRoleDept) {
		this.sysRoleDeptSet.add(sysRoleDept);
	}

	/**
	 * Get the set of the 角色机构管理.
	 * 
	 * @return The set of 角色机构管理
	 */
	public Set<SysRoleDept> getSysRoleDeptSet() {
		return this.sysRoleDeptSet;
	}

	/**
	 * Set the set of the 角色菜单管理.
	 * 
	 * @param sysRoleMenuSet
	 *            The set of 角色菜单管理
	 */
	public void setSysRoleMenuSet(Set<SysRoleMenu> sysRoleMenuSet) {
		this.sysRoleMenuSet = sysRoleMenuSet;
	}

	/**
	 * Add the 角色菜单管理.
	 * 
	 * @param sysRoleMenu
	 *            角色菜单管理
	 */
	public void addSysRoleMenu(SysRoleMenu sysRoleMenu) {
		this.sysRoleMenuSet.add(sysRoleMenu);
	}

	/**
	 * Get the set of the 角色菜单管理.
	 * 
	 * @return The set of 角色菜单管理
	 */
	public Set<SysRoleMenu> getSysRoleMenuSet() {
		return this.sysRoleMenuSet;
	}

	/**
	 * Set the set of the 用户角色表.
	 * 
	 * @param sysUserRoleSet
	 *            The set of 用户角色表
	 */
	public void setSysUserRoleSet(Set<SysUserRole> sysUserRoleSet) {
		this.sysUserRoleSet = sysUserRoleSet;
	}

	/**
	 * Add the 用户角色表.
	 * 
	 * @param sysUserRole
	 *            用户角色表
	 */
	public void addSysUserRole(SysUserRole sysUserRole) {
		this.sysUserRoleSet.add(sysUserRole);
	}

	/**
	 * Get the set of the 用户角色表.
	 * 
	 * @return The set of 用户角色表
	 */
	public Set<SysUserRole> getSysUserRoleSet() {
		return this.sysUserRoleSet;
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
		SysRole other = (SysRole) obj;
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