package online.tinkie101.dentamedcashflow.models;

public class MonthlyStatement {
    private String date;
    private EntryJSON[] entries;
    private Double in;
    private Double exp;
    private  Double net;

    public MonthlyStatement(String date, EntryJSON[] entries, Double in, Double exp, Double net) {
        this.date = date;
        this.entries = entries;
        this.in = in;
        this.exp = exp;
        this.net = net;
    }

    public String getDate() {
        return date;
    }

    public EntryJSON[] getEntries() {
        return entries;
    }

    public Double getIn() {
        return in;
    }

    public Double getExp() {
        return exp;
    }

    public Double getNet() {
        return net;
    }
}
