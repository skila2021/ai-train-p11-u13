import request from '@/utils/request'

// 查询短信验证码记录，用于发送、校验及频率控制列表
export function listCodes(query) {
  return request({
    url: '/system/codes/list',
    method: 'get',
    params: query
  })
}

// 查询短信验证码记录，用于发送、校验及频率控制详细
export function getCodes(id) {
  return request({
    url: '/system/codes/' + id,
    method: 'get'
  })
}

// 新增短信验证码记录，用于发送、校验及频率控制
export function addCodes(data) {
  return request({
    url: '/system/codes',
    method: 'post',
    data: data
  })
}

// 修改短信验证码记录，用于发送、校验及频率控制
export function updateCodes(data) {
  return request({
    url: '/system/codes',
    method: 'put',
    data: data
  })
}

// 删除短信验证码记录，用于发送、校验及频率控制
export function delCodes(id) {
  return request({
    url: '/system/codes/' + id,
    method: 'delete'
  })
}
