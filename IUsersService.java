package org.xingyu.system.ccq.service;

import java.util.List;
import org.xingyu.system.ccq.domain.Users;

/**
 * 用户主档案，存储注册成功的用户基本信息Service接口
 * 
 * @author ruoyi
 * @date 2026-05-20
 */
public interface IUsersService 
{
    /**
     * 查询用户主档案，存储注册成功的用户基本信息
     * 
     * @param id 用户主档案，存储注册成功的用户基本信息主键
     * @return 用户主档案，存储注册成功的用户基本信息
     */
    public Users selectUsersById(Long id);

    /**
     * 查询用户主档案，存储注册成功的用户基本信息列表
     * 
     * @param users 用户主档案，存储注册成功的用户基本信息
     * @return 用户主档案，存储注册成功的用户基本信息集合
     */
    public List<Users> selectUsersList(Users users);

    /**
     * 新增用户主档案，存储注册成功的用户基本信息
     * 
     * @param users 用户主档案，存储注册成功的用户基本信息
     * @return 结果
     */
    public int insertUsers(Users users);

    /**
     * 修改用户主档案，存储注册成功的用户基本信息
     * 
     * @param users 用户主档案，存储注册成功的用户基本信息
     * @return 结果
     */
    public int updateUsers(Users users);

    /**
     * 批量删除用户主档案，存储注册成功的用户基本信息
     * 
     * @param ids 需要删除的用户主档案，存储注册成功的用户基本信息主键集合
     * @return 结果
     */
    public int deleteUsersByIds(Long[] ids);

    /**
     * 删除用户主档案，存储注册成功的用户基本信息信息
     * 
     * @param id 用户主档案，存储注册成功的用户基本信息主键
     * @return 结果
     */
    public int deleteUsersById(Long id);
}
