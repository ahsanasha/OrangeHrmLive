package utilities;

import java.util.Random;

public class DataGenerator {
    public static String getSaltString() {
        String SALTCHARS = "abcdefghijklmnopqrstuvwxyz_1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 12) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

}
