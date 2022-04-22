package pl.pjatk.gui.entity;

import lombok.Data;

@Data
public class BasicContainer {

    private int id;
    private int weightNetto;
    private int weightBrutto;
    private int volume;
    private String sender;
    private String color;
}
