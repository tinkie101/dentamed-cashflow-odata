package online.tinkie101.dentamedcashflow.models;

public class MonthlyStatement {
    private String date;
    private EntryJSON[] entries;

    public MonthlyStatement(String date, EntryJSON[] entries) {
        this.date = date;
        this.entries = entries;
    }

    public String getDate() {
        return date;
    }

    public EntryJSON[] getEntries() {
        return entries;
    }
}
