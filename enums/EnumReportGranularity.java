package com.firstdata.enums;

public enum EnumReportGranularity {
    DAILY_GRANULARITY("D"), MONTHLY_GRANULARITY("M"), YEARLY_GRANULARITY("Y");

    private final String value;

    EnumReportGranularity(String value) {
	this.value = value;
    }

    @Override
    public String toString() {
	return value;
    }

    public static EnumReportGranularity getEnum(String granularity) {
	for (EnumReportGranularity enu : EnumReportGranularity.values()) {
	    if (enu.compare(granularity)) {
		return enu;
	    }
	}
	return null;
    }

    public boolean compare(String granularity) {
	return this.value.equals(granularity);
    }
}
