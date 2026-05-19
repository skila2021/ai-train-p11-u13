package org.xingyu.system.mapper;

import java.util.List;
import org.xingyu.system.domain.PhoneVerificationCodes;

/**
 * 短信验证码记录，用于发送、校验及频率控制Mapper接口
 * 
 * @author ruoyi
 * @date 2026-05-20
 */
public interface PhoneVerificationCodesMapper 
{
    /**
     * 查询短信验证码记录，用于发送、校验及频率控制
     * 
     * @param id 短信验证码记录，用于发送、校验及频率控制主键
     * @return 短信验证码记录，用于发送、校验及频率控制
     */
    public PhoneVerificationCodes selectPhoneVerificationCodesById(Long id);

    /**
     * 查询短信验证码记录，用于发送、校验及频率控制列表
     * 
     * @param phoneVerificationCodes 短信验证码记录，用于发送、校验及频率控制
     * @return 短信验证码记录，用于发送、校验及频率控制集合
     */
    public List<PhoneVerificationCodes> selectPhoneVerificationCodesList(PhoneVerificationCodes phoneVerificationCodes);

    /**
     * 新增短信验证码记录，用于发送、校验及频率控制
     * 
     * @param phoneVerificationCodes 短信验证码记录，用于发送、校验及频率控制
     * @return 结果
     */
    public int insertPhoneVerificationCodes(PhoneVerificationCodes phoneVerificationCodes);

    /**
     * 修改短信验证码记录，用于发送、校验及频率控制
     * 
     * @param phoneVerificationCodes 短信验证码记录，用于发送、校验及频率控制
     * @return 结果
     */
    public int updatePhoneVerificationCodes(PhoneVerificationCodes phoneVerificationCodes);

    /**
     * 删除短信验证码记录，用于发送、校验及频率控制
     * 
     * @param id 短信验证码记录，用于发送、校验及频率控制主键
     * @return 结果
     */
    public int deletePhoneVerificationCodesById(Long id);

    /**
     * 批量删除短信验证码记录，用于发送、校验及频率控制
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePhoneVerificationCodesByIds(Long[] ids);
}
