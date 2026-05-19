package org.xingyu.system.ccq.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xingyu.system.ccq.mapper.UserProfilesMapper;
import org.xingyu.system.ccq.domain.UserProfiles;
import org.xingyu.system.ccq.service.IUserProfilesService;

/**
 * 用户扩展档案，关联用户主，支持后续寄件/收件信息补充Service业务层处理
 * 
 * @author ruoyi
 * @date 2026-05-20
 */
@Service
public class UserProfilesServiceImpl implements IUserProfilesService 
{
    @Autowired
    private UserProfilesMapper userProfilesMapper;

    /**
     * 查询用户扩展档案，关联用户主，支持后续寄件/收件信息补充
     * 
     * @param id 用户扩展档案，关联用户主，支持后续寄件/收件信息补充主键
     * @return 用户扩展档案，关联用户主，支持后续寄件/收件信息补充
     */
    @Override
    public UserProfiles selectUserProfilesById(Long id)
    {
        return userProfilesMapper.selectUserProfilesById(id);
    }

    /**
     * 查询用户扩展档案，关联用户主，支持后续寄件/收件信息补充列表
     * 
     * @param userProfiles 用户扩展档案，关联用户主，支持后续寄件/收件信息补充
     * @return 用户扩展档案，关联用户主，支持后续寄件/收件信息补充
     */
    @Override
    public List<UserProfiles> selectUserProfilesList(UserProfiles userProfiles)
    {
        return userProfilesMapper.selectUserProfilesList(userProfiles);
    }

    /**
     * 新增用户扩展档案，关联用户主，支持后续寄件/收件信息补充
     * 
     * @param userProfiles 用户扩展档案，关联用户主，支持后续寄件/收件信息补充
     * @return 结果
     */
    @Override
    public int insertUserProfiles(UserProfiles userProfiles)
    {
        return userProfilesMapper.insertUserProfiles(userProfiles);
    }

    /**
     * 修改用户扩展档案，关联用户主，支持后续寄件/收件信息补充
     * 
     * @param userProfiles 用户扩展档案，关联用户主，支持后续寄件/收件信息补充
     * @return 结果
     */
    @Override
    public int updateUserProfiles(UserProfiles userProfiles)
    {
        return userProfilesMapper.updateUserProfiles(userProfiles);
    }

    /**
     * 批量删除用户扩展档案，关联用户主，支持后续寄件/收件信息补充
     * 
     * @param ids 需要删除的用户扩展档案，关联用户主，支持后续寄件/收件信息补充主键
     * @return 结果
     */
    @Override
    public int deleteUserProfilesByIds(Long[] ids)
    {
        return userProfilesMapper.deleteUserProfilesByIds(ids);
    }

    /**
     * 删除用户扩展档案，关联用户主，支持后续寄件/收件信息补充信息
     * 
     * @param id 用户扩展档案，关联用户主，支持后续寄件/收件信息补充主键
     * @return 结果
     */
    @Override
    public int deleteUserProfilesById(Long id)
    {
        return userProfilesMapper.deleteUserProfilesById(id);
    }
}
