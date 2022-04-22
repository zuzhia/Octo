package pl.pjatk.gui.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;
import java.util.function.Function;

import static java.lang.Integer.parseInt;

@Data
public class Sender {
    private String firstName;
    private String lastName;
    @Getter(AccessLevel.NONE)
    private String pesel;
    private String address;
    private Function<Integer, Boolean> isEven = (number) -> number % 2 == 0;

    public LocalDate getBirthDate() {
        try {
            int day = getDay(pesel.substring(0, 2));
            int month = getMonth(pesel.substring(0, 2));
            int year = getYear(pesel.substring(0, 2), pesel.substring(2, 3));
            return LocalDate.of(year, month, day);
        } catch (Exception e) {
            System.out.println("Cannot read date from PESEL number." + e.getMessage());
            return null;
        }
    }

    private int getDay(String dayString) {
        return parseInt(dayString);
    }

    private int getMonth(String monthString) {
        String firstChar = monthString.substring(0, 1);
        String secondChar = monthString.substring(1, 2);
        if (isEven.apply(parseInt(firstChar))) {
            return parseInt(secondChar);
        } else {
            String month = "1" + secondChar;
            return parseInt(month);
        }
    }

    private int getYear(String yearString, String thirdChar) {
        int year = parseInt(yearString);
        switch (parseInt(thirdChar)) {
            case 0, 1 -> {
                return year + 1900;
            }
            case 2, 3 -> {
                return year + 2000;
            }
            case 4, 5 -> {
                return year + 2100;
            }
            case 6, 7 -> {
                return year + 2200;
            }
            case 8, 9 -> {
                return year + 1800;
            }
            default -> throw new IllegalArgumentException("Cannot read year from input.");
        }
    }
}
