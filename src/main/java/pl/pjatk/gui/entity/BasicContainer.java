package pl.pjatk.gui.entity;

import lombok.Data;

@Data
public class BasicContainer {

    private int id;
    private double weightNetto;
    private double weightBrutto;
    private double weightTara;
    private int volume;
    private String sender;
    private String color;

}
