package pl.pjatk.gui.entity;

import java.util.Random;

public class BasicContainer extends HeavyContainer {

    Random losowy = new Random();
    int id = losowy.nextInt(1000);
    int waga_netto;
    int waga_brutto;
    String nadawca;
    int pojemnosc;
    String kolor;



}
