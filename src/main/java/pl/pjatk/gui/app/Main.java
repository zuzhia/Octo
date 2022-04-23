package pl.pjatk.gui.app;

import pl.pjatk.gui.service.Harbour;
import pl.pjatk.gui.service.Warehouse;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Harbour harbour = Harbour.getHarbour();
        Warehouse warehouse = Warehouse.getWarehouse();

        // wczytanie pliku z opcjami
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        String optionsFileName = "menuOptions.txt";
        List<String> options;
        try (InputStream is = classLoader.getResourceAsStream(optionsFileName)) {
            if (is == null) throw new RuntimeException("Cannot get file from resources.");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            options = reader.lines().collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Cannot read menu from file: " + e.getMessage());
            System.exit(1);
        }

        // nieskończona pętla
        while (true) {
            // wyświetlenie listy poleceń (options)
            //
        }
    }
}
