package com.sloan.spring.base.orika;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kakaluote zhaozhong@youzan.com
 * @date 2018/10/28
 **/
public abstract class AbstractBeanConverter {


    protected MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    private MapperFacade mapperFacade = null;

    public AbstractBeanConverter() {
        initMap();
        mapperFacade = mapperFactory.getMapperFacade();
    }

    protected abstract void initMap();

    public <V, P> P convert(V base, Class<P> target) {
        return mapperFacade.map(base, target);
    }

    public <V, P> List<P> convertList(List<V> baseList, Class<P> target) {
        return baseList == null? new ArrayList<>() : mapperFacade.mapAsList(baseList, target);
    }
}
