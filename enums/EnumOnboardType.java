package com.firstdata.enums;

public enum EnumOnboardType {
    PERSONAL_DATA("PED"),
    PAY_DATA("PAD"),
    COMMERCE_DATA("COD"),
    COMMERCE_ADDRESS("COA"),
    FISCAL_ADDRESS("FIA");

    private String text;

    EnumOnboardType(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static EnumOnboardType compareTo(String text) {
        for (EnumOnboardType b : EnumOnboardType.values()) {
            if (b.text.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}
