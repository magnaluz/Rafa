package com.firstdata.enums;

public enum EnumTokenAction {

    ACTIVE(1), RECOVERY(2), ADD_CUIT(3);

    private final Integer idAction;

    private EnumTokenAction(Integer idAction) {
	this.idAction = idAction;
    }

    public static EnumTokenAction getEnum(Integer idAction) {
	for (EnumTokenAction enu : EnumTokenAction.values()) {
	    if (enu.compare(idAction)) {
		return enu;
	    }
	}
	return null;
    }

    public boolean compare(Integer idAction) {
	return this.idAction == idAction;
    }

    public int getAsInt() {
	return idAction;
    }
}
