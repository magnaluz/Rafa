package com.firstdata.enums;

public enum EnumOwner {

    OWNER_COMMERCE(0), OWNER_CUIT(1);

    private final Integer owner;

    private EnumOwner(Integer owner) {
	this.owner = owner;
    }

    public static EnumOwner getEnum(Integer owner) {
	for (EnumOwner enu : EnumOwner.values()) {
	    if (enu.compare(owner)) {
		return enu;
	    }
	}
	return null;
    }

    public boolean compare(Integer owner) {
	return this.owner == owner;
    }

    public int getAsInt() {
	return owner;
    }
}
