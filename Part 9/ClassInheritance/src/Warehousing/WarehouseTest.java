package Warehousing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class WarehouseTest {
    @Test
    void constructorHandlesInvalidCapacity() {
        Warehouse w = new Warehouse(-10);
        assertEquals(0, w.getCapacity());
    }

    @Test
    void addToWarehouseWithinCapacity() {
        Warehouse w = new Warehouse(100);
        w.addToWarehouse(40);
        assertEquals(40, w.getBalance());
        assertEquals(60, w.howMuchSpaceLeft());
    }

    @Test
    void addToWarehouseOverflow() {
        Warehouse w = new Warehouse(50);
        w.addToWarehouse(100);
        assertEquals(50, w.getBalance());
        assertEquals(0, w.howMuchSpaceLeft());
    }

    @Test
    void addToWarehouseNegativeIgnored() {
        Warehouse w = new Warehouse(50);
        w.addToWarehouse(-10);
        assertEquals(0, w.getBalance());
    }

    @Test
    void takeFromWarehouseNegativeIgnored() {
        Warehouse w = new Warehouse(50);
        w.addToWarehouse(20);
        double taken = w.takeFromWarehouse(-5);
        assertEquals(0, taken);
        assertEquals(20, w.getBalance());
    }

    @Test
    void takeFromWarehousePartial() {
        Warehouse w = new Warehouse(50);
        w.addToWarehouse(30);
        double taken = w.takeFromWarehouse(10);
        assertEquals(10, taken);
        assertEquals(20, w.getBalance());
    }

    @Test
    void takeFromWarehouseMoreThanBalance() {
        Warehouse w = new Warehouse(50);
        w.addToWarehouse(25);
        double taken = w.takeFromWarehouse(40);
        assertEquals(25, taken); // should only get what’s available
        assertEquals(0, w.getBalance());
    }

    @Test
    void toStringShowsCorrectState() {
        Warehouse w = new Warehouse(100);
        w.addToWarehouse(64.5);
        String state = w.toString();
        assertTrue(state.contains("balance = 64.5"));
        assertTrue(state.contains("space left 35.5"));
    }
}