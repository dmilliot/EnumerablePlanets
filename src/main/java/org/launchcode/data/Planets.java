package org.launchcode.data;

public enum Planets {
    MERCURY(88),
    VENUS(225),
    EARTH(365),
    MARS(687),
    JUPITER(4333),
    SATURN(10759),
    URANUS(30687),
    NEPTUNE(60200);

    private final String name;

    private final int yearLength;

    Planets(int yearLength) {
        this.name = name().toLowerCase();
        this.yearLength = yearLength;
    }



    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }
}
