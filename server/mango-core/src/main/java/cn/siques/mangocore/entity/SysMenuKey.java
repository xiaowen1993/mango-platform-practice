package cn.siques.mangocore.entity;

public class SysMenuKey {

    @Override
    public String toString() {
        return "SysMenuKey{" +
                "id=" + id +
                '}';
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.id
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    private Long id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.id
     *
     * @return the value of sys_menu.id
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.id
     *
     * @param id the value for sys_menu.id
     *
     * @mbggenerated Mon Jun 29 20:40:38 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }
}