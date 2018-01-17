package com.chinabigdata.service.Impl;

import com.chinabigdata.dao.CustomerDao;
import com.chinabigdata.po.CustomerPo;
import com.chinabigdata.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chenpengjiang on 2018/1/16.
 */
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    final
    CustomerDao customerDao;

    @Autowired
    public CustomerServiceImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public CustomerPo getCustomerById(Long id) {
        return customerDao.getCustomerById(id);
    }

    @Override
    public Integer insert(CustomerPo customerPo) {
        return customerDao.insert(customerPo);
    }

    @Override
    public Integer delete(CustomerPo customerPo) {
        return customerDao.delete(customerPo);
    }

    @Override
    public Integer update(CustomerPo customerPo) {
        return customerDao.updateByPrimaryKey(customerPo);
    }
}
