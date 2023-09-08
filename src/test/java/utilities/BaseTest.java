package utilities;

//import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
//import net.thucydides.core.environment.SystemEnvironmentVariables;
//import net.thucydides.core.util.EnvironmentVariables;

import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

import java.io.IOException;

public class BaseTest {
    private static String VALID_USER;
    private static String VALID_PASSWORD;
    private static String INVALID_USER;
    private static String INVALID_PASSWORD;

    private static final EnvironmentVariables env = SystemEnvironmentVariables.createEnvironmentVariables();
    private static final String BASE_URL = EnvironmentSpecificConfiguration.from(env).getProperty("webdriver.base.url");

    public static String getBaseUrl() {
        return BASE_URL;
    }

    public void initializeProperties() throws IOException {
        loadProperties();
    }

    private void loadProperties() throws IOException {
        PropertiesReader propertiesReader = new PropertiesReader();

        VALID_USER = propertiesReader.getProperty("orange.hrm.live.valid.user");
        VALID_PASSWORD = propertiesReader.getProperty("orange.hrm.live.valid.password");
        INVALID_USER = propertiesReader.getProperty("orange.hrm.live.invalid.user");
        INVALID_PASSWORD = propertiesReader.getProperty("orange.hrm.live.invalid.password");


    }

    public static String getValidUser() {
        return VALID_USER;
    }

    public static String getValidPassword() {
        return VALID_PASSWORD;
    }

    public static String getInValidUser(){
        return INVALID_USER;
    }

    public static String getInValidPassword(){
        return INVALID_PASSWORD;
    }
}
