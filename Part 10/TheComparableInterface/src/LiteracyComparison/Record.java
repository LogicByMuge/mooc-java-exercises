package LiteracyComparison;

class Record implements Comparable<Record> {
    private String country;
    private int year;
    private String gender;
    private double literacyPercent;

    public Record(String country, int year, String gender, double literacyPercent) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.literacyPercent = literacyPercent;
    }

    @Override
    public int compareTo(Record other) {
        return Double.compare(this.literacyPercent, other.literacyPercent);
    }

    @Override
    public String toString() {
        return country + " (" + year + "), " + gender + ", " + literacyPercent;
    }
}