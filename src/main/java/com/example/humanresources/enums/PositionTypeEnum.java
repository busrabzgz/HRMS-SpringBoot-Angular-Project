package com.example.humanresources.enums;

public enum PositionTypeEnum {

    BACKEND_DEVELOPER("215"),
    FRONTEND_DEVELOPER("216"),
    IOS_DEVELOPER("217"),
    ANDROID_DEVELOPER("218");
    private final String value;
    private PositionTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
