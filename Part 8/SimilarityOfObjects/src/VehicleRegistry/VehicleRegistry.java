package VehicleRegistry;

import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        registry = new HashMap<>();
    }

    // If the license plate doesn't have an owner, the method returns true.
    // If the license already has an owner attached, the method returns false and does nothing.
    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate)) {
            return false;
        }
        registry.put(licensePlate, owner);
        return true;
    }

    // returns the owner of the car corresponding to the license plate received as a parameter.
    // If the car isn't in the registry, the method returns null.
    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate);
    }

    // removes the license plate and attached data from the registry.
    // The method returns true if removed successfully and false if the license plate wasn't in the registry.
    public boolean remove(LicensePlate licensePlate) {
        if(registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;
        }
        return false;
    }
}
