package com.chinabigdata.dao.monggo;

import com.chinabigdata.po.CustomerPo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by chenpengjiang on 2018/1/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerMongoTest {
    @Autowired
    CustomerMongo customerMongo;

    /**
     * 新增测试
     */
    @Test
    public void saveTest(){
        CustomerPo customerPo = new CustomerPo();
        customerPo.setCustomerName("张三114241");
        customerPo.setNickName("张三昵称");
        customerPo.setMail("231@qq.com");
        customerPo.setPhone("18032322323");
        customerPo.setOrg("某某公司");
        customerPo.setDetail("详情描述");
        customerPo.setWeixin("weixing123123");

        customerMongo.save(customerPo);
    }

    /**
     * 删除测试
     */
    @Test
    public void delTest(){
        Query query = new Query(Criteria.where("id").is(1));
        customerMongo.remove(query);
    }


    /**
     * 更新测试
     */
    @Test
    public void updateTest(){
        Query query = new Query(Criteria.where("nickName").is("张三昵称"));
        //特殊更新，更新author为jason的数据，如果没有author为jason的数据则以此条件创建一条新的数据
        //update的rename方法用于修改key的名称
        //update的inc方法用于做累加操作，将money在之前的基础上加上100
        //更新条件不变，更新字段改成了一个我们集合中不存在的，用set方法如果更新的key不存在则创建一个新的key
        //update的unset方法用于删除key
        //update的pull方法用于删除tags数组中的java
        Update update = new Update().set("detail", "详情描述，更新后123456");
        customerMongo.update(query,update);
    }


    /**
     * 查询测试
     */
    @Test
    public void getTest(){
        Query query = new Query(Criteria.where("nickName").is("张三昵称"));
        List<CustomerPo> list =  customerMongo.find(query);
        System.out.println(list.get(0).getDetail());
    }

}