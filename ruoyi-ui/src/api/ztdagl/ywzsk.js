import request from '@/utils/request'

// 查询业务知识库列表
export function listYwzsk(query) {
  return request({
    url: '/ztdagl/ywzsk/list',
    method: 'get',
    params: query
  })
}

// 查询业务知识库详细
export function getYwzsk(recid) {
  return request({
    url: '/ztdagl/ywzsk/' + recid,
    method: 'get'
  })
}

// 新增业务知识库
export function addYwzsk(data) {
  return request({
    url: '/ztdagl/ywzsk',
    method: 'post',
    data: data
  })
}

// 修改业务知识库
export function updateYwzsk(data) {
  return request({
    url: '/ztdagl/ywzsk',
    method: 'put',
    data: data
  })
}

// 删除业务知识库
export function delYwzsk(recid) {
  return request({
    url: '/ztdagl/ywzsk/' + recid,
    method: 'delete'
  })
}
