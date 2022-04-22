package pl.pjatk.gui.service;

public class Harbour {
    private static Harbour instance;

    private Harbour() {
    }

    public static Harbour getHarbour() {
        return instance == null ? new Harbour() : instance;
    }
}
