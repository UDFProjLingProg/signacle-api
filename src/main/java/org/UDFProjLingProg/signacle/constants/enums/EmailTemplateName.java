package org.UDFProjLingProg.signacle.constants.enums;

import lombok.Getter;

@Getter
public enum EmailTemplateName {

    CREATE_ACCOUNT("create_account")
    ;


    private final String name;
    EmailTemplateName(String name) {
        this.name = name;
    }
}