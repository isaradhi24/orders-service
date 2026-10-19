package com.example.orders_service;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class OrdersControllerTests {

    @Test
    void ordersEndpointReturnsExpectedResponse() throws Exception {
        MockMvc mockMvc = MockMvcBuilders
                .standaloneSetup(new OrdersController())
                .build();

        mockMvc.perform(get("/orders"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.service").value("orders-service"))
                .andExpect(jsonPath("$.version").value("v1"))
                .andExpect(jsonPath("$.message").value("Orders API is running"));
    }
}
