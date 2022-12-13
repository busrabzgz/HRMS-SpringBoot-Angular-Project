package com.example.humanresources.enums;

public enum LevelTypeEnum {
    JUNIOR("200"),
    MID_LEVEL("200"),
    SENIOR("200");
    private final String value;
    private LevelTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
