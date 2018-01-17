package com.chinabigdata.dao;

import com.chinabigdata.po.CustomerPo;
import tk.mybatis.mapper.common.Mapper;

/**
 *
 * @author chenpengjiang
 * @date 2018/1/16
 */
public interface CustomerDao extends Mapper<CustomerPo> {
    /**
     * 根据ID查询
     * @param id
     * @return
     */
    CustomerPo getCustomerById(Long  id);


}
