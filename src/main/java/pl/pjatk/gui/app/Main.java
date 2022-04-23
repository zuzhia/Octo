package pl.pjatk.gui.app;

import pl.pjatk.gui.service.FreightCar;
import pl.pjatk.gui.service.Harbour;
import pl.pjatk.gui.service.Warehouse;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Harbour harbour = Harbour.getHarbour();
        Warehouse warehouse = Warehouse.getWarehouse();
        FreightCar freightCar = FreightCar.getFreightCar();

        // wczytanie pliku z opcjami
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        String optionsFileName = "menuOptions.txt";
        List<String> options = new ArrayList<>();
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
            if (options.isEmpty()) throw new RuntimeException("No options to display");
            options.forEach(System.out::println);
            // pobranie inputu z konsoli
            Scanner scanner = new Scanner(System.in);
            int selectedOption = scanner.nextInt();

            // TODO zładowanie kontenera ze statku na wagon kolejowy do magazynu:
            //  2. wywołanie odpowiedniej metody z FreightCar lub Warehouse (trzeba je dodać)
            // 3. załadowanie na statek kontenera - wywołanie metody z ship (trzeba je dodać)
            // 4. nadpisanie toString() w ship
            // 5. nadpisanie toString() w Warehouse
            // 6. dodanie metody w Warehouse
            // 7. jak niżej (w switch)
            // 8. analogicznie do pkt 7
            // 9. nadpisanie toString() w Harbour


            switch (selectedOption) {
                case 0 -> {
                    // TODO coś tam, np:
                    System.exit(0);
                }
                case 1 -> {
                    // TODO coś tam, np: dodanie statku
                    // wczytanie każdego parametru
                    // String name = scanner.nextLine() itd
                    // Ship s = new Ship(parametry)
                    // sprawdzamy czy dany statek jest już w liście
                    // harbour.getShips().contains(s)
                    // jak jest to trzeba napisać że jest i kontynuować
                    // jak nie jest to przypisujamy id
                    // s.setId(harbour.getShips().size())
                    // i dodajemy
                    // harbour.getShips().add(s))
                    // kontenery podobnie jak statki
                }
                case 2 -> {
                    // TODO coś tam
                }
                case 3 -> {
                    // TODO coś tam
                }
                case 4 -> {
                    // TODO coś tam
                }
                case 5 -> {
                    // TODO coś tam
                }
                case 6 -> {
                    // TODO coś tam
                }
                default -> throw new UnsupportedOperationException("Wrong option was selected.");
            }
        }
    }
}
