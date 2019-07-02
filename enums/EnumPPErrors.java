package com.firstdata.enums;

public enum EnumPPErrors {

    TRANSACCION_MM_OK("00000", "Transacción  correcta"), TRANSACCION_PP_OK("PP000", "Transacción  correcta"), ACTIVE_CONTRACT("PP001", "Faltan campos obligatorios"), ENTITY_ERROR("PP003",
	    "Error al recuperar entidad"), GENERAL_ERROR("PP004", "Error general"), VALITION_ERROR("PP011", "Error de validación");

    private final String idError;
    private final String errorKey;

    EnumPPErrors(String idError, String errorKey) {
	this.idError = idError;
	this.errorKey = errorKey;

    }

    public String getIdError() {
	return idError;
    }

    public String getErrorKey() {
	return errorKey;
    }
    
    public static EnumPPErrors buscarVariable(String idError) {
	for (EnumPPErrors ppE : EnumPPErrors.values()) {
	    if (ppE.idError.equalsIgnoreCase(idError)) {
		return ppE;
	    }
	}
	return null;
    } 
}
