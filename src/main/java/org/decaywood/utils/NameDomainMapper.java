package org.decaywood.utils;

/**
 * Created by decaywood on 2015/5/24.
 */
public enum NameDomainMapper {

    USER_ID,
    USER_LOGIN_NAME("userName"),
    USER_PASSWORD("password"),
    USER_NAME,
    USER_ROLE,
    USER_LAST_LOGIN_TIME,
    USER_STATUS,
    USER_LOGO,
    VALIDATE_CODE,
    SESSION_USER_LOGIN_NAME,

    SESSION_SECURITY_CODE,
    SYSTEM_NAME,
    REQUEST_DATAS,

    ERROR_INFO("errorInfo"),
    ERROR_INFO1("validate code does not match!"),
    ERROR_INFO2("password or userName is fault!"),
    ERROR_PAGE("error"),
    LOGIN_PAGE("login"),
    MAIN_PAGE("mainPage");

    private String enumName;

    NameDomainMapper() {
    }

    NameDomainMapper(String enumName) {
        this.enumName = enumName;
    }

    public String getName() {
        return enumName == null ? name() : enumName;
    }

}
