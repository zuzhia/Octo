package pl.pjatk.gui.app;

import pl.pjatk.gui.service.Harbour;
import pl.pjatk.gui.service.Warehouse;

public class Main {
    public static void main(String[] args) {
        Harbour harbour = Harbour.getHarbour();
        Warehouse warehouse = Warehouse.getWarehouse();
    }
}
