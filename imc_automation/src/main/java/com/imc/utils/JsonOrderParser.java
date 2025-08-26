package com.imc.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.imc.pojo.CreateOrderPojo;
import com.imc.pojo.SearchOrderPojo;
import java.io.File;

public class JsonOrderParser {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            // Parse CreateOrder
            CreateOrderPojo createOrder = mapper.readTree(new File("imc_automation/src/main/resources/testData/CreateQuery.json"))
                .get("CreateOrder").traverse(mapper)
                .readValueAs(CreateOrderPojo.class);
            System.out.println("[CreateOrder] Order Number: " + createOrder.getOrderNumber());
            System.out.println("[CreateOrder] Driver Name: " + createOrder.getDriverName());

            // Parse SearchOrder
            SearchOrderPojo searchOrder = mapper.readTree(new File("imc_automation/src/main/resources/testData/searchQuery.json"))
                .get("SearchOrder").traverse(mapper)
                .readValueAs(SearchOrderPojo.class);
            System.out.println("[SearchOrder] Order Number: " + searchOrder.getOrderNumber());
            System.out.println("[SearchOrder] Order Type: " + searchOrder.getOrderType());
            System.out.println("[SearchOrder] Order Ref: " + searchOrder.getOrderRef());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
