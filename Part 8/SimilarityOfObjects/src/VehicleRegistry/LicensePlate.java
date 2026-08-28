package VehicleRegistry;

public class LicensePlate {

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public boolean equals(Object comparedObject) {
        if(this == comparedObject) {
            return true;
        }
        if(!(comparedObject instanceof LicensePlate)) {
            return false;
        }
        LicensePlate comparedPlate = (LicensePlate) comparedObject;
        return liNumber == comparedPlate.liNumber &&
                country == comparedPlate.country;
    }

    public int hashCode() {
        if(liNumber == null) {
            return this.country.hashCode();
        }
        return this.liNumber.hashCode();
    }
}