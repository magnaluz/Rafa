package com.firstdata.enums;

public enum EnumUserSource {

    WEB("WEB"), BATCH("BATCH"), MIGRATION("MIGRATION"), CALLCENTER("CALLCENTER"), ASYNC("ASYNC");

    private String desc;

    EnumUserSource(String desc) {
	this.desc = desc;
    }

    public String getDesc() {
	return desc;
    }

}
