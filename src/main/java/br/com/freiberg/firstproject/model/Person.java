package br.com.freiberg.firstproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    @NotNull
    private String name;

    @Embedded
    private Address address;

    @NotNull
    private Boolean active;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return code.equals(person.code) &&
                name.equals(person.name) &&
                address.equals(person.address) &&
                active.equals(person.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, address, active);
    }
}
