package pl.pjatk.gui.entity;

import java.util.Random;

public class BasicContainer extends HeavyContainer {

    Random random = new Random();
    int id = random.nextInt(1000);
    int WeightNetto;
    int WeightBrutto;
    String Sender;
    int Volume;
    String Color;



}
