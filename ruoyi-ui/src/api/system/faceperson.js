import request from '@/utils/request'

// 查询人脸识别库列表
export function listFaceperson(query) {
  return request({
    url: '/system/faceperson/list',
    method: 'get',
    params: query
  })
}

// 查询人脸识别库详细
export function getFaceperson(id) {
  return request({
    url: '/system/faceperson/' + id,
    method: 'get'
  })
}

// 新增人脸识别库
export function addFaceperson(data) {
  return request({
    url: '/system/faceperson',
    method: 'post',
    data: data
  })
}

// 修改人脸识别库
export function updateFaceperson(data) {
  return request({
    url: '/system/faceperson',
    method: 'put',
    data: data
  })
}

// 删除人脸识别库
export function delFaceperson(id) {
  return request({
    url: '/system/faceperson/' + id,
    method: 'delete'
  })
}
