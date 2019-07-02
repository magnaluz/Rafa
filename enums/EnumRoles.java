package com.firstdata.enums;

public enum EnumRoles {

    ROLE_EDIT_PROFILE("ROLE_EDIT_PROFILE"), ROLE_SALES_CHARGEBACK("ROLE_SALES_CHARGEBACK"), ROLE_SETTLEMENTS("ROLE_SETTLEMENTS"), ROLE_REPORTS("ROLE_REPORTS"), ROLE_CHARGED_SERVICES("ROLE_CHARGED_SERVICES"), ROLE_ELASTIC(
	    "ROLE_ELASTIC"), ROLE_AUTOMATIC_SETTLEMENT("ROLE_AUTOMATIC_SETTLEMENT"), ROLE_CONCILIATOR("ROLE_CONCILIATOR"), ROLE_ANTICIPATION("ROLE_ANTICIPATION");

    private String text;

    EnumRoles(String text) {
	this.text = text;
    }

    public String getText() {
	return this.text;
    }

    public static EnumRoles compareTo(String text) {
	for (EnumRoles b : EnumRoles.values()) {
	    if (b.text.equalsIgnoreCase(text)) {
		return b;
	    }
	}
	return null;
    }

    public boolean compareRoleName(String name) {

	return this.text.equals(name);
    }

}
