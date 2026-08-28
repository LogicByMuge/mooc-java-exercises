package VehicleRegistry;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        VehicleRegistry registry = new VehicleRegistry();

        // Test add
        System.out.println("Adding li1: " + registry.add(li1, "Arto"));   // true
        System.out.println("Adding li2: " + registry.add(li2, "Pekka"));  // true
        System.out.println("Adding li3: " + registry.add(li3, "Jürgen")); // true
        System.out.println("Adding li1 again: " + registry.add(li1, "Matti")); // false

        // Test get
        System.out.println("Owner of li1: " + registry.get(li1)); // Arto
        System.out.println("Owner of li3: " + registry.get(li3)); // Jürgen
        System.out.println("Owner of new plate: " + registry.get(new LicensePlate("FI", "ZZZ-999"))); // null

        // Test remove
        System.out.println("Removing li2: " + registry.remove(li2)); // true
        System.out.println("Owner of li2 after removal: " + registry.get(li2)); // null
        System.out.println("Removing li2 again: " + registry.remove(li2)); // false
    }
}
