package br.com.freiberg.firstproject.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Permission.class)
public abstract class Permission_ {

    public static volatile SingularAttribute<Permission, Long> code;
    public static volatile SingularAttribute<Permission, String > description;
}
