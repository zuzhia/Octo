package pl.pjatk.gui.service;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import pl.pjatk.gui.entity.Ship;

import java.util.List;

@Data
public class Harbour {
    @Getter(AccessLevel.NONE)
    private static Harbour instance;

    private List<Ship> ships;

    private Harbour() {
    }

    public static Harbour getHarbour() {
        return instance == null ? new Harbour() : instance;
    }

    // TODO NADPISAĆ
    @Override
    public String toString() {
        return "Harbour{" +
                "ships=" + ships +
                '}';
    }
}
