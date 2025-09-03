package com.imc.stepDefinitions;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.imc.pojo.CreateOrderPojo;
import com.imc.pojo.SearchOrderPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logintest {

    String windowImage = "windows.png";
    String appImage = "app.png";
    Screen s = new Screen();
    CreateOrderPojo createOrder = new CreateOrderPojo();
    SearchOrderPojo SearchOrder = new SearchOrderPojo();

    @Given("IMC App open using the batfile")
    public void I_have_oIMC_App_open_using_the_batfile() throws FindFailed, InterruptedException {
        int count = 5;
        try {

            Pattern btn = new Pattern("Query.png").similar(0.85);

            // s.find("Query.png");
            Thread.sleep(100);
            for (int i = 1; i < count; i++) {
                s.hover(btn);

                Thread.sleep(100);
            }
            System.out.println("first Step");
            System.out.println(createOrder.getShipper());

        } catch (FindFailed e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @When("I type {string} into {string}")
    public void i_type_into(String username, String imagepath) {
        System.out.println(username + " " + imagepath);

    }

    @When("I click {string}")
    public void i_click(String login) {
        System.out.println("Clicking on " + login);
    }

    @Then("I should see {string}")
    public void i_should_see(String string) {
        System.out.println("Verifying " + string);
    }
}