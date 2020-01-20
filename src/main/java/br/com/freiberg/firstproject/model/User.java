package br.com.freiberg.firstproject.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.Objects;

@Entity
public class User {

    @Id
    private Long code;

    private String name;
    private String email;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Permission> permissions;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return code.equals(user.code) &&
                name.equals(user.name) &&
                email.equals(user.email) &&
                password.equals(user.password) &&
                permissions.equals(user.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, email, password, permissions);
    }
}
