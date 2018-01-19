package com.chinabigdata.controller;

import com.chinabigdata.po.CustomerPo;
import com.chinabigdata.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author chenpengjiang
 * @date 2018/1/16
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("getCustomer")
    public CustomerPo getCustomer(@RequestParam("id") Long id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping("insertCustomer")
    public Integer insert() {
        CustomerPo customerPo = new CustomerPo();
        customerPo.setNickName("test");
        customerPo.setPhone("13123233232");
        return customerService.insert(customerPo);
    }

    @GetMapping("deleteCustomer")
    public Integer delete(@RequestParam("id") Long id) {
        CustomerPo customerPo = new CustomerPo();
//        customerPo.setId(Integer.parseInt(id.toString()));
        return customerService.delete(customerPo);
    }


    @GetMapping("updateCustomer")
    public Integer update(@RequestParam("id") Long id) {
        CustomerPo customerPo = new CustomerPo();
//        customerPo.setId(Integer.parseInt(id.toString()));
        customerPo.setDetail("修改后");
        return customerService.update(customerPo);
    }


}
