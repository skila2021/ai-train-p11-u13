package org.xingyu.system.service;

import java.util.List;
import org.xingyu.system.domain.UserProfiles;

/**
 * 用户扩展档案，关联用户主，支持后续寄件/收件信息补充Service接口
 * 
 * @author ruoyi
 * @date 2026-05-20
 */
public interface IUserProfilesService 
{
    /**
     * 查询用户扩展档案，关联用户主，支持后续寄件/收件信息补充
     * 
     * @param id 用户扩展档案，关联用户主，支持后续寄件/收件信息补充主键
     * @return 用户扩展档案，关联用户主，支持后续寄件/收件信息补充
     */
    public UserProfiles selectUserProfilesById(Long id);

    /**
     * 查询用户扩展档案，关联用户主，支持后续寄件/收件信息补充列表
     * 
     * @param userProfiles 用户扩展档案，关联用户主，支持后续寄件/收件信息补充
     * @return 用户扩展档案，关联用户主，支持后续寄件/收件信息补充集合
     */
    public List<UserProfiles> selectUserProfilesList(UserProfiles userProfiles);

    /**
     * 新增用户扩展档案，关联用户主，支持后续寄件/收件信息补充
     * 
     * @param userProfiles 用户扩展档案，关联用户主，支持后续寄件/收件信息补充
     * @return 结果
     */
    public int insertUserProfiles(UserProfiles userProfiles);

    /**
     * 修改用户扩展档案，关联用户主，支持后续寄件/收件信息补充
     * 
     * @param userProfiles 用户扩展档案，关联用户主，支持后续寄件/收件信息补充
     * @return 结果
     */
    public int updateUserProfiles(UserProfiles userProfiles);

    /**
     * 批量删除用户扩展档案，关联用户主，支持后续寄件/收件信息补充
     * 
     * @param ids 需要删除的用户扩展档案，关联用户主，支持后续寄件/收件信息补充主键集合
     * @return 结果
     */
    public int deleteUserProfilesByIds(Long[] ids);

    /**
     * 删除用户扩展档案，关联用户主，支持后续寄件/收件信息补充信息
     * 
     * @param id 用户扩展档案，关联用户主，支持后续寄件/收件信息补充主键
     * @return 结果
     */
    public int deleteUserProfilesById(Long id);
}
