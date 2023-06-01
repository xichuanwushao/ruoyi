import request from '@/utils/request'

// 查询人脸识别库列表
export function listFacepeople(query) {
  return request({
    url: '/system/facepeople/list',
    method: 'get',
    params: query
  })
}

// 查询人脸识别库详细
export function getFacepeople(id) {
  return request({
    url: '/system/facepeople/' + id,
    method: 'get'
  })
}

// 新增人脸识别库
export function addFacepeople(data) {
  return request({
    url: '/system/facepeople',
    method: 'post',
    data: data
  })
}

// 修改人脸识别库
export function updateFacepeople(data) {
  return request({
    url: '/system/facepeople',
    method: 'put',
    data: data
  })
}

// 删除人脸识别库
export function delFacepeople(id) {
  return request({
    url: '/system/facepeople/' + id,
    method: 'delete'
  })
}
