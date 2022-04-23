package pl.pjatk.gui.entity;

import lombok.Data;

import java.util.List;
import java.util.Objects;

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

    private List<BasicContainer> containers;

    // TODO NADPISAĆ

    @Override
    public String toString() {
        return "Ship{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", homePort='" + homePort + '\'' +
                ", cargoSource='" + cargoSource + '\'' +
                ", cargoDestination='" + cargoDestination + '\'' +
                ", maxToxicOrExplosiveContainerCount=" + maxToxicOrExplosiveContainerCount +
                ", maxHeavyContainerCount=" + maxHeavyContainerCount +
                ", maxCoolerContainerCount=" + maxCoolerContainerCount +
                ", maxContainerCount=" + maxContainerCount +
                ", maxWeightLoad=" + maxWeightLoad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return maxToxicOrExplosiveContainerCount == ship.maxToxicOrExplosiveContainerCount && maxHeavyContainerCount == ship.maxHeavyContainerCount && maxCoolerContainerCount == ship.maxCoolerContainerCount && maxContainerCount == ship.maxContainerCount && Double.compare(ship.maxWeightLoad, maxWeightLoad) == 0 && name.equals(ship.name) && homePort.equals(ship.homePort) && cargoSource.equals(ship.cargoSource) && cargoDestination.equals(ship.cargoDestination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, homePort, cargoSource, cargoDestination, maxToxicOrExplosiveContainerCount, maxHeavyContainerCount, maxCoolerContainerCount, maxContainerCount, maxWeightLoad);
    }
}
