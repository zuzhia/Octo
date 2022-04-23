package pl.pjatk.gui.service;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import pl.pjatk.gui.entity.BasicContainer;

import java.util.List;

@Data
public class FreightCar {
    @Getter(AccessLevel.NONE)
    private static FreightCar instance;

    private List<BasicContainer> containers;

    private FreightCar() {
    }

    public static FreightCar getFreightCar() {
        return instance == null ? new FreightCar() : instance;
    }
}
