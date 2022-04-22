package pl.pjatk.gui.entity;

import lombok.Data;

@Data
public class BasicContainer {
    private int id;
    private double netWeight;
    private double grossWeight;
    private double tare;
    private String sender;
    private double volume;
    private String color;
}
