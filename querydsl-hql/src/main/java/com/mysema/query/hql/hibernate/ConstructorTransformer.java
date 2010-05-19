/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query.hql.hibernate;

import java.util.List;

import org.hibernate.transform.ResultTransformer;

import com.mysema.query.types.EConstructor;

/**
 * @author tiwe
 *
 */
public final class ConstructorTransformer implements ResultTransformer{

    private static final long serialVersionUID = -3625957233853100239L;

    private transient EConstructor<?> constructor;
    
    public ConstructorTransformer(EConstructor<?> constructor){
        this.constructor = constructor;
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List transformList(List collection) {
        return collection;
    }

    @Override
    public Object transformTuple(Object[] tuple, String[] aliases) {
	return constructor.newInstance(tuple);
    }

}
