package com.example.humanresources.enums;

public enum PositionTypeEnum {

    BACKEND_DEVELOPER("200"),
    FRONTEND_DEVELOPER("200"),
    IOS_DEVELOPER("200"),
    ANDROID_DEVELOPER("200");
    private final String value;
    private PositionTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
