package org.xingyu.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户主档案，存储注册成功的用户基本信息对象 users
 * 
 * @author ruoyi
 * @date 2026-05-20
 */
public class Users extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户唯一标识，主键 */
    private Long id;

    /** 已实名认证的11位手机号，全局唯一 */
    @Excel(name = "已实名认证的11位手机号，全局唯一")
    private String phone;

    /** 密码哈希值（BCrypt等），可为空（仅短信登录） */
    @Excel(name = "密码哈希值", readConverterExp = "B=Crypt等")
    private String passwordHash;

    /** 用户状态：0-禁用，1-正常，2-待验证（注册未完成） */
    @Excel(name = "用户状态：0-禁用，1-正常，2-待验证", readConverterExp = "注=册未完成")
    private Long status;

    /** 账户创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "账户创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    /** 最后更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedAt;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }

    public void setPasswordHash(String passwordHash) 
    {
        this.passwordHash = passwordHash;
    }

    public String getPasswordHash() 
    {
        return passwordHash;
    }

    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }

    public void setUpdatedAt(Date updatedAt) 
    {
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt() 
    {
        return updatedAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("phone", getPhone())
            .append("passwordHash", getPasswordHash())
            .append("status", getStatus())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .toString();
    }
}
