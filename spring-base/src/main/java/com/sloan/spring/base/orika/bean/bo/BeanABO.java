package com.sloan.spring.base.orika.bean.bo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author kakaluote zhaozhong@youzan.com
 * @date 2018/10/28
 **/
@Data
@Accessors(chain = true)
public class BeanABO {

    private String name;

    private Integer age;

    private String perHeight;

    List<BeanBBO> beanBBOList;

    List<BeanCBO> beanCBOList;
}
