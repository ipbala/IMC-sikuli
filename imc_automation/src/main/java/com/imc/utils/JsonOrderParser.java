package com.imc.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.imc.pojo.CreateOrderPojo;
import java.io.File;

public class JsonOrderParser {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            CreateOrderPojo order = mapper.readValue(
                new File("imc_automation\\src\\main\\resources\\testData\\CreateQuery.json"),
                CreateOrderPojo.class
            );
            System.out.println("Order Number: " + order.getOrderNumber());
            System.out.println("Driver Name: " + order.getDriverName());
            // Print other fields as needed
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
