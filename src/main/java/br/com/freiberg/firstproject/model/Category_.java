package br.com.freiberg.firstproject.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Category.class)
public abstract class Category_ {

    public static volatile SingularAttribute<Category, Long> code;

    public static SingularAttribute<Category, String> name;
}
