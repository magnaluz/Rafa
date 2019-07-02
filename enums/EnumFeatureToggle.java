package com.firstdata.enums;

public enum EnumFeatureToggle {

    FEATURE_ELECTRONIC_SETTLEMENT_QUERY("FEATURE_QUERY_ELECTRONIC_SETTLEMENT"),

    FEATURE_SCHEDULE_AVAILABLE("FEATURE_SCHEDULE_AVAILABLE");

    private String text;

    EnumFeatureToggle(String text) {
	this.text = text;
    }

    public String getText() {
	return this.text;
    }

    public static EnumFeatureToggle compareTo(String text) {
	for (EnumFeatureToggle b : EnumFeatureToggle.values()) {
	    if (b.text.equalsIgnoreCase(text)) {
		return b;
	    }
	}
	return null;
    }

}
