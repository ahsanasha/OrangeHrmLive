package models;

import utilities.BaseTest;

public enum SymphoniaUser {
    VALID_ACCOUNT(BaseTest.getValidUser(), BaseTest.getValidPassword());

    public final String username;
    public final String password;

    SymphoniaUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
