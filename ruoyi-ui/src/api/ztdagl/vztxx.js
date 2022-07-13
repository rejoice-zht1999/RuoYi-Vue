import request from '@/utils/request'

// 查询主体信息列表
export function listVztxx(query) {
  return request({
    url: '/dagl/vztxx/list',
    method: 'get',
    params: query
  })
}
