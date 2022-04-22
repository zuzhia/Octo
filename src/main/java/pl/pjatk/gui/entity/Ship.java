package pl.pjatk.gui.entity;

import lombok.Data;

@Data
public class Ship {
    private int id;
    private String name;
    private String homePort;
    private String cargoSource;
    private String cargoDestination;

    private int maxToxicOrExplosiveContainerCount;
    private int maxHeavyContainerCount;
    private int maxCoolerContainerCount;
    private int maxContainerCount;
    private double maxWeightLoad;
}
