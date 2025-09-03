package com.imc.stepDefinitions;

import com.imc.pojo.SearchOrderPojo;

public class QuerySearch {

    String Ordernuber;

    public void querySearch() {
        SearchOrderPojo SearchOrderPojo = new SearchOrderPojo();
        Ordernuber = SearchOrderPojo.getOrderNumber();

    }

}
