package com.example.humanresources.enums.ExpenseReceiptEnum;

public enum CategoryEnum {
    WORKING_EXPENSES("101"),
    BILL_EXPENSES("102"),
    EDUCATION_AND_COURSES("103"),
    FOOD_AND_DRINK("104"),
    TRAVEL_AND_TRANSPORTATION("105"),
    OTHER("106");






    private final String value;
    private CategoryEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
