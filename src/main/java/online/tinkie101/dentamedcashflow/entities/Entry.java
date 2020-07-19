package online.tinkie101.dentamedcashflow.entities;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "entries")
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    Calendar date;
    boolean income;
    double value;
    String comment;

    public Entry() {
    }

    public Entry(Calendar date, boolean income, double value, String comment) {
        this.value = value;
        this.income = income;
        this.date = date;
        this.comment = comment;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isIncome() {
        return this.income;
    }

    public void setIncome(boolean income) {
        this.income = income;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
