package com.example.humanresources.enums;

public enum LevelTypeEnum {
    JUNIOR("220"),
    MID_LEVEL("223"),
    SENIOR("224");
    private final String value;
    private LevelTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
