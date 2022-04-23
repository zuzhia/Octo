package pl.pjatk.gui.service;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import pl.pjatk.gui.entity.BasicContainer;

import java.util.List;

@Data
public class Warehouse {
    @Getter(AccessLevel.NONE)
    private static Warehouse instance;

    private List<BasicContainer> containers;

    private Warehouse() {
    }

    public static Warehouse getWarehouse() {
        return instance == null ? new Warehouse() : instance;
    }

    // TODO NADPISAĆ
    @Override
    public String toString() {
        return "Warehouse{" +
                "containers=" + containers +
                '}';
    }
}
