package com.chinabigdata.service;

import com.chinabigdata.po.CustomerPo;

/**
 * @author chenpengjiang
 * @date 2018/1/16
 */
public interface CustomerService {
    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    CustomerPo getCustomerById(Long id);

    /**
     * 增加
     *
     * @param customerPo
     * @return
     */
    Integer insert(CustomerPo customerPo);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    Integer delete(CustomerPo customerPo);


    /**
     * 修改
     *
     * @param customerPo
     * @return
     */
    Integer update(CustomerPo customerPo);


}
