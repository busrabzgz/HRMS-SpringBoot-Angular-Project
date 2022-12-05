package com.example.humanresources.enums;

import lombok.Data;


public enum LeaveEnum {
     PATERNITY_LEAVE("200"),
     MATERNITY_LEAVE("201"),
     PREGNANT_LEAVE("202"),
     ANNUAL_LEAVE("203");

     private final String value;
     private LeaveEnum(String value) {
          this.value = value;
     }

     public String getValue() {
          return value;
     }


}
