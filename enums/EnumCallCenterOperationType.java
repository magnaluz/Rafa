package com.firstdata.enums;

public enum EnumCallCenterOperationType {

    SEND_RECOVERY_PASSWORD_MAIL(1), SEND_REGISTER_MAIL(2), REGISTRATION_USER(3), UNLOCK_COMMERCE(4), ADD_ALL_COMMERCES(5);

    private final Integer operationType;

    private EnumCallCenterOperationType(Integer operationType) {
	this.operationType = operationType;
    }

    public static EnumCallCenterOperationType getEnum(Integer operationType) {
	for (EnumCallCenterOperationType enu : EnumCallCenterOperationType.values()) {
	    if (enu.compare(operationType)) {
		return enu;
	    }
	}
	return null;
    }

    public boolean compare(Integer operationType) {
	return this.operationType == operationType;
    }

    public int getAsInt() {
	return operationType;
    }

}
