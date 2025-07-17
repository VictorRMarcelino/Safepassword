package com.safepassword.service;

public class ServiceValidatePassword {

    /**
     * Validate if the password is safe
     * @param password The password to be verified
     * @return boolean
     */
    public boolean validatePasswordIsSafe(String password) {
        String passwordPattern= "^[a-zA-Z0-9\\W]{8,}$";
        return this.validatePasswordPattern(password, passwordPattern);
    }

    /**
     * Validate if the password matches with the given pattern
     * @param password the password to be verified
     * @param pattern the pattern to be compared with the password
     * @return boolean
     */
    private boolean validatePasswordPattern(String password, String pattern) {
        return password.matches(pattern);
    }
}
