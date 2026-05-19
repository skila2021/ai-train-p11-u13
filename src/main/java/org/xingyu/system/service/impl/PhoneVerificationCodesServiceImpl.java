package org.xingyu.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xingyu.system.mapper.PhoneVerificationCodesMapper;
import org.xingyu.system.domain.PhoneVerificationCodes;
import org.xingyu.system.service.IPhoneVerificationCodesService;

/**
 * 短信验证码记录，用于发送、校验及频率控制Service业务层处理
 * 
 * @author ruoyi
 * @date 2026-05-20
 */
@Service
public class PhoneVerificationCodesServiceImpl implements IPhoneVerificationCodesService 
{
    @Autowired
    private PhoneVerificationCodesMapper phoneVerificationCodesMapper;

    /**
     * 查询短信验证码记录，用于发送、校验及频率控制
     * 
     * @param id 短信验证码记录，用于发送、校验及频率控制主键
     * @return 短信验证码记录，用于发送、校验及频率控制
     */
    @Override
    public PhoneVerificationCodes selectPhoneVerificationCodesById(Long id)
    {
        return phoneVerificationCodesMapper.selectPhoneVerificationCodesById(id);
    }

    /**
     * 查询短信验证码记录，用于发送、校验及频率控制列表
     * 
     * @param phoneVerificationCodes 短信验证码记录，用于发送、校验及频率控制
     * @return 短信验证码记录，用于发送、校验及频率控制
     */
    @Override
    public List<PhoneVerificationCodes> selectPhoneVerificationCodesList(PhoneVerificationCodes phoneVerificationCodes)
    {
        return phoneVerificationCodesMapper.selectPhoneVerificationCodesList(phoneVerificationCodes);
    }

    /**
     * 新增短信验证码记录，用于发送、校验及频率控制
     * 
     * @param phoneVerificationCodes 短信验证码记录，用于发送、校验及频率控制
     * @return 结果
     */
    @Override
    public int insertPhoneVerificationCodes(PhoneVerificationCodes phoneVerificationCodes)
    {
        return phoneVerificationCodesMapper.insertPhoneVerificationCodes(phoneVerificationCodes);
    }

    /**
     * 修改短信验证码记录，用于发送、校验及频率控制
     * 
     * @param phoneVerificationCodes 短信验证码记录，用于发送、校验及频率控制
     * @return 结果
     */
    @Override
    public int updatePhoneVerificationCodes(PhoneVerificationCodes phoneVerificationCodes)
    {
        return phoneVerificationCodesMapper.updatePhoneVerificationCodes(phoneVerificationCodes);
    }

    /**
     * 批量删除短信验证码记录，用于发送、校验及频率控制
     * 
     * @param ids 需要删除的短信验证码记录，用于发送、校验及频率控制主键
     * @return 结果
     */
    @Override
    public int deletePhoneVerificationCodesByIds(Long[] ids)
    {
        return phoneVerificationCodesMapper.deletePhoneVerificationCodesByIds(ids);
    }

    /**
     * 删除短信验证码记录，用于发送、校验及频率控制信息
     * 
     * @param id 短信验证码记录，用于发送、校验及频率控制主键
     * @return 结果
     */
    @Override
    public int deletePhoneVerificationCodesById(Long id)
    {
        return phoneVerificationCodesMapper.deletePhoneVerificationCodesById(id);
    }
}
