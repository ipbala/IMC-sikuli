package com.imc.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.lang.Thread;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import com.imc.pojo.SearchOrderPojo;

public class QuerySearch {

    String Ordernuber;

    public void querySearch() {
        SearchOrderPojo SearchOrderPojo = new SearchOrderPojo();
        Ordernuber = SearchOrderPojo.getOrderNumber();

    }

}
