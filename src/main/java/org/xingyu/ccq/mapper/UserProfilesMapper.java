package org.xingyu.ccq.mapper;

import java.util.List;
import org.xingyu.ccq.domain.UserProfiles;

/**
 * 用户扩展档案，关联用户主，支持后续寄件/收件信息补充Mapper接口
 * 
 * @author ruoyi
 * @date 2026-05-20
 */
public interface UserProfilesMapper 
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
     * 删除用户扩展档案，关联用户主，支持后续寄件/收件信息补充
     * 
     * @param id 用户扩展档案，关联用户主，支持后续寄件/收件信息补充主键
     * @return 结果
     */
    public int deleteUserProfilesById(Long id);

    /**
     * 批量删除用户扩展档案，关联用户主，支持后续寄件/收件信息补充
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserProfilesByIds(Long[] ids);
}
