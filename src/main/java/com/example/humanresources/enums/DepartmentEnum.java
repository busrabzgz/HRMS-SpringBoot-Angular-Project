package com.example.humanresources.enums;

public enum DepartmentEnum {
    MANAGEMENT_DEPARTMENT("200"),
    FINANCE_DEPARTMENT("201"),
    HUMAN_RESOURCES_DEPARTMENT("202"),
    INFORMATION_TECHNOLOGIES_DEPARTMENT("203");



    private final String value;
    private DepartmentEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
