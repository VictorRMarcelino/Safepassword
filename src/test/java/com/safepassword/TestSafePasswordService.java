package com.safepassword;

import com.safepassword.service.ServiceValidatePassword;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestSafePasswordService {

    @Test
    public void testValidPassword() {
        String password = "Ts1!Ts1!";
        ServiceValidatePassword oServiceValidatePassword = new ServiceValidatePassword();
        boolean isPasswordValid = oServiceValidatePassword.validatePasswordIsSafe(password);
        Assertions.assertTrue(isPasswordValid);
    }

    @Test
    public void testInvalidPassword() {
        String password = "Ts1Ts1g";
        ServiceValidatePassword oServiceValidatePassword = new ServiceValidatePassword();
        boolean isPasswordValid = oServiceValidatePassword.validatePasswordIsSafe(password);
        Assertions.assertFalse(isPasswordValid);
    }
}
