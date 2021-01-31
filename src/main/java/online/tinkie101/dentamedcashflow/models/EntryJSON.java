package online.tinkie101.dentamedcashflow.models;

public class EntryJSON {
    private String comment;
    private String date;
    private String income;
    private Double value;

    public EntryJSON(String comment, String date, String income, Double value) {
        this.comment = comment;
        this.date = date;
        this.income = income;
        this.value = value;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
