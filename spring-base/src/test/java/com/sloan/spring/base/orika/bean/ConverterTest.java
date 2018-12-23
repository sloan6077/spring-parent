package com.sloan.spring.base.orika.bean;

import com.sloan.spring.base.orika.Converter;
import com.sloan.spring.base.orika.bean.bo.BeanABO;
import com.sloan.spring.base.orika.bean.bo.BeanBBO;
import com.sloan.spring.base.orika.bean.bo.BeanCBO;
import com.sloan.spring.base.orika.bean.dto.BeanADO;
import com.sloan.spring.base.orika.bean.dto.BeanBDO;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kakaluote zhaozhong@youzan.com
 * @date 2018/10/28
 **/
public class ConverterTest {

    @Test
    public void test() {

        BeanBBO beanBBO1 = new BeanBBO().setTag("tag1");
        BeanCBO beanCBO1 = new BeanCBO().setNum(1);
        BeanBBO beanBBO2 = new BeanBBO().setTag("tag2");
        BeanCBO beanCBO2 = new BeanCBO().setNum(2);

        List<BeanBBO> beanBBOList = new ArrayList<>();
        beanBBOList.add(beanBBO1);
        beanBBOList.add(beanBBO2);

        List<BeanCBO> beanCBOList = new ArrayList<>();
        beanCBOList.add(beanCBO1);
        beanCBOList.add(beanCBO2);

        BeanABO beanABO
                = new BeanABO()
                .setName("name")
                .setAge(1)
                .setPerHeight("height")
                .setBeanBBOList(beanBBOList)
                .setBeanCBOList(beanCBOList);


        Converter converter = new Converter();
        BeanADO beanADO = converter.convert(beanABO, BeanADO.class);

        List<BeanBDO> beanBDOList = converter.convertList(beanBBOList, BeanBDO.class);

        System.out.println(beanADO);
        System.out.println(beanBDOList);
    }
}
