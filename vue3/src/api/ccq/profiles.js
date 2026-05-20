import request from '@/utils/request'

// 查询用户扩展档案，关联用户主，支持后续寄件/收件信息补充列表
export function listProfiles(query) {
  return request({
    url: '/ccq/profiles/list',
    method: 'get',
    params: query
  })
}

// 查询用户扩展档案，关联用户主，支持后续寄件/收件信息补充详细
export function getProfiles(id) {
  return request({
    url: '/ccq/profiles/' + id,
    method: 'get'
  })
}

// 新增用户扩展档案，关联用户主，支持后续寄件/收件信息补充
export function addProfiles(data) {
  return request({
    url: '/ccq/profiles',
    method: 'post',
    data: data
  })
}

// 修改用户扩展档案，关联用户主，支持后续寄件/收件信息补充
export function updateProfiles(data) {
  return request({
    url: '/ccq/profiles',
    method: 'put',
    data: data
  })
}

// 删除用户扩展档案，关联用户主，支持后续寄件/收件信息补充
export function delProfiles(id) {
  return request({
    url: '/ccq/profiles/' + id,
    method: 'delete'
  })
}
