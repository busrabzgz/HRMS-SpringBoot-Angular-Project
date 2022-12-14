package com.example.humanresources.enums;

public enum GenderTypeEnum {
    WOMEN("230"),

    MAN("232"),

    OTHER("235");
    private final String value;
    private GenderTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
