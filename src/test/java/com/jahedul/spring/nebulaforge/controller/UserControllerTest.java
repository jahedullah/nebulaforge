package com.jahedul.spring.nebulaforge.controller;


import com.jahedul.spring.nebulaforge.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserControllerTest {

    @Mock
    UserService userService;
    @InjectMocks
    UserController userController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testTestMethod() {
        String result = userController.testMethod();
        assertEquals("test clear", result);
    }

}
