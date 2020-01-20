package br.com.freiberg.firstproject.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Address.class)
public abstract class Address_ {
    public static volatile SingularAttribute<Address, String >city;
    public static volatile SingularAttribute<Address, String >state;
    public static volatile SingularAttribute<Address, String >complement;
    public static volatile SingularAttribute<Address, String >number;
    public static volatile SingularAttribute<Address, String >public_place;
    public static volatile SingularAttribute<Address, String >neighborhood;
    public static volatile SingularAttribute<Address, String >cep;

}
