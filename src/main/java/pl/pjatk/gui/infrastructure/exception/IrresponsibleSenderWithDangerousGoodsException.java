package pl.pjatk.gui.infrastructure.exception;

import java.time.LocalDate;

public class IrresponsibleSenderWithDangerousGoodsException extends RuntimeException {
    public IrresponsibleSenderWithDangerousGoodsException(LocalDate arrivalDate, LocalDate disposalDate, int id) {
        super("Container: " + id + " (arrival date: " + arrivalDate + ") was disposed on " + disposalDate);
    }
}
