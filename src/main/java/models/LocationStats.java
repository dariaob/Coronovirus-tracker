package models;

public class LocationStats {
    private String state;
    private String country;
    private int CasesTotal;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCasesTotal() {
        return CasesTotal;
    }

    public void setCasesTotal(int casesTotal) {
        CasesTotal = casesTotal;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", CasesTotal=" + CasesTotal +
                '}';
    }
}
