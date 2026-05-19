package org.xingyu.system.ccq.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 短信验证码记录，用于发送、校验及频率控制对象 phone_verification_codes
 * 
 * @author ruoyi
 * @date 2026-05-20
 */
public class PhoneVerificationCodes extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 验证码记录唯一标识，主键 */
    private Long id;

    /** 目标手机号，用于匹配与去重校验 */
    @Excel(name = "目标手机号，用于匹配与去重校验")
    private String phone;

    /** 6位数字验证码 */
    @Excel(name = "6位数字验证码")
    private String code;

    /** 验证码过期时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "验证码过期时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date expiresAt;

    /** 是否已被使用：0-未使用，1-已使用 */
    @Excel(name = "是否已被使用：0-未使用，1-已使用")
    private Long used;

    /** 验证码生成时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "验证码生成时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    /** 该手机号当前有效期内发送次数（用于频率限制） */
    @Excel(name = "该手机号当前有效期内发送次数", readConverterExp = "用=于频率限制")
    private Long attemptCount;

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

    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }

    public void setExpiresAt(Date expiresAt) 
    {
        this.expiresAt = expiresAt;
    }

    public Date getExpiresAt() 
    {
        return expiresAt;
    }

    public void setUsed(Long used) 
    {
        this.used = used;
    }

    public Long getUsed() 
    {
        return used;
    }

    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }

    public void setAttemptCount(Long attemptCount) 
    {
        this.attemptCount = attemptCount;
    }

    public Long getAttemptCount() 
    {
        return attemptCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("phone", getPhone())
            .append("code", getCode())
            .append("expiresAt", getExpiresAt())
            .append("used", getUsed())
            .append("createdAt", getCreatedAt())
            .append("attemptCount", getAttemptCount())
            .toString();
    }
}
