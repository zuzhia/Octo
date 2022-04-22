package pl.pjatk.gui.service;

public class Warehouse {
    private static Warehouse instance;

    private Warehouse() {
    }

    public static Warehouse getWarehouse() {
        return instance == null ? new Warehouse() : instance;
    }
}
