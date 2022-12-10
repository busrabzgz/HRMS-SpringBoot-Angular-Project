package com.example.humanresources.enums;


public enum LeaveTypeEnum {
     PATERNITY_LEAVE("200"),
     MATERNITY_LEAVE("201"),
     PREGNANT_LEAVE("202"),
     ANNUAL_LEAVE("203"),
     MILITARY_LEAVE("204"),
     MARRIAGE_lEAVE("205"),
     MEDICAL_LEAVE("206"),
     LOOKING_FOR_A_JOB_LEAVE("207"),
     COMPASSIONATE_LEAVE("208"),
     UNPAID_LEAVE("209"),
     ROAD_LEAVE("210");


     private final String value;
     private LeaveTypeEnum(String value) {
          this.value = value;
     }

     public String getValue() {
          return value;
     }


}
