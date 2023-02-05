package com.ehcache.example.demo.controller;

import com.ehcache.example.demo.service.NumberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class NumberControllerTest {

    @Autowired
    NumberService numberService;
    @Autowired
    NumberController numberController;
    @Test
    public void contextLoads(){
        Assertions.assertNotNull(numberController);
    }

    @Test
    public void numberTest() throws Exception {
        Mockito.when(numberService.square(1L)).thenReturn(new BigDecimal("10"));






    }
}