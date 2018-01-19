package com.chinabigdata.dao.monggo;

import com.chinabigdata.dao.base.AbstractMongoDao;
import com.chinabigdata.po.CustomerPo;
import org.springframework.stereotype.Repository;

/**
 *
 * @author chenpengjiang
 * @date 2018/1/19
 */
@Repository
public class CustomerMongo extends AbstractMongoDao<CustomerPo> {
    @Override
    public Class getEntityClass() {
        return CustomerPo.class;
    }

    @Override
    public String getCollectionName() {
        return CustomerPo.COLLECTION_NAME;
    }
}
