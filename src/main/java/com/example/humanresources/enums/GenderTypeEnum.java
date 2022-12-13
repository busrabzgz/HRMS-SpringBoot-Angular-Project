package com.example.humanresources.enums;

public enum GenderTypeEnum {
    WOMEN("200"),

    MAN("200"),

    OTHER("200");
    private final String value;
    private GenderTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
