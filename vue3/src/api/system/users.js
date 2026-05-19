import request from '@/utils/request'

// 查询用户主档案，存储注册成功的用户基本信息列表
export function listUsers(query) {
  return request({
    url: '/system/users/list',
    method: 'get',
    params: query
  })
}

// 查询用户主档案，存储注册成功的用户基本信息详细
export function getUsers(id) {
  return request({
    url: '/system/users/' + id,
    method: 'get'
  })
}

// 新增用户主档案，存储注册成功的用户基本信息
export function addUsers(data) {
  return request({
    url: '/system/users',
    method: 'post',
    data: data
  })
}

// 修改用户主档案，存储注册成功的用户基本信息
export function updateUsers(data) {
  return request({
    url: '/system/users',
    method: 'put',
    data: data
  })
}

// 删除用户主档案，存储注册成功的用户基本信息
export function delUsers(id) {
  return request({
    url: '/system/users/' + id,
    method: 'delete'
  })
}
