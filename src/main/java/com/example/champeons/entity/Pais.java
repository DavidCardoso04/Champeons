package com.example.champeons.entity;

public enum Pais {
    ENGLAND,
    SPAIN,
    ITALY,
    GERMANY,
    FRANCE,
    PORTUGAL,
    NETHERLANDS,
    BELGIUM,
    SWITZERLAND,
    TURKEY,
    AUSTRIA,
    SCOTLAND,
    DENMARK,
    SWEDEN,
    NORWAY,
    GREECE,
    CROATIA,
    SERBIA,
    UKRAINE,
    RUSSIA,
    HUNGARY,
    ISRAEL,
    POLAND,
    CZECH_REPUBLIC,
    ROMANIA,
    BULGARIA,
    SLOVAKIA,
    CYPRUS,
    BELARUS,
    LITHUANIA,
    GEORGIA,
    KAZAKHSTAN,
    AZERBAIJAN,
    ARMENIA,
    LUXEMBOURG,
    SLOVENIA,
    BOSNIA_AND_HERZEGOVINA,
    ALBANIA,
    MOLDOVA,
    MACEDONIA,
    MONTENEGRO,
    LATVIA,
    ESTONIA,
    ICELAND,
    FAROE_ISLANDS,
    GIBRALTAR,
    SAN_MARINO,
    MALTA,
    ANDORRA;

    @Override
    public String toString() {
        String name = name().toLowerCase();
        if (name.length() > 1) {
            return name.substring(0, 1).toUpperCase() + name.substring(1);
        }
        return name.toLowerCase();
    }
}
