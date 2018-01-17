package com.chinabigdata.po;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 客户信息Po类
 *
 * @author chenpengjiang
 * @date 2017/10/27
 */
@Data
@Table(name = "customer")
public class CustomerPo {
    /**
     * 主键
     **/
    @Id
    private Integer id;
    /**
     * 客户姓名
     */
    private String customerName;
    /**
     * 客户昵称
     */
    private String nickName;

    /**
     * 客户手机号
     */
    private String phone;

    /**
     * 客户微信号
     */
    private String weixin;

    /**
     * 客户邮箱
     */
    private String mail;

    /**
     * 所属机构
     */
    private String org;

    /**
     * 其他详情描述
     */
    private String detail;

    /**
     * 创建时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    private Date createTime;

    /**
     * 更新时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;
}
