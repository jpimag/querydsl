/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query.hql.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The Class User.
 */
@Entity
@Table(name="USER_")
public class User {
    @ManyToOne
    Company company;
    
    @Id
    long id;
    
    String userName, firstName, lastName;
}