package br.com.freiberg.firstproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Launch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    @NotNull
    private String description;

    @NotNull
    private LocalDate dueDate;

    private LocalDate paymentDate;

    @NotNull
    private BigDecimal value;

    private String note;

    @NotNull
    @Enumerated(EnumType.STRING)
    private launchType type;

    @NotNull
    @ManyToOne
    private Category category;

    @NotNull
    @ManyToOne
    private Person person;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public launchType getType() {
        return type;
    }

    public void setType(launchType type) {
        this.type = type;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Launch launch = (Launch) o;
        return code.equals(launch.code) &&
                description.equals(launch.description) &&
                dueDate.equals(launch.dueDate) &&
                paymentDate.equals(launch.paymentDate) &&
                value.equals(launch.value) &&
                note.equals(launch.note) &&
                type.equals(launch.type) &&
                category.equals(launch.category) &&
                person.equals(launch.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, description, dueDate, paymentDate, value, note, type, category, person);
    }
}
