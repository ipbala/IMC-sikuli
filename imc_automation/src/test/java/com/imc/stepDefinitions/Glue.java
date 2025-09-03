package com.imc.stepDefinitions;

import org.sikuli.script.App;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

import com.imc.pojo.CreateOrderPojo;
import com.imc.pojo.SearchOrderPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Glue {

    String appName = com.imc.utils.ConfigReader.getProperty("app.name");
    Screen s = new Screen();
    CreateOrderPojo createOrder = new CreateOrderPojo();
    SearchOrderPojo SearchOrder = new SearchOrderPojo();

    @Given("I have completed all tests")
    public void i_have_completed_all_tests() {
        // Need to this about this, what to be added here

    }

    @Given("IMC App open in full screen mode")
    public void imc_app_open_in_full_screen_mode() throws InterruptedException {
        if (appName != null && !appName.isEmpty()) {
            App app = App.open("app.name");
            System.out.println("Open the app: " + appName);
            app.focus();
            app.waitForWindow(5);
            if (app.isRunning()) {

                System.out.println("App opened is : " + app.getTitle());
            }

            Region appWindow = app.window();
            if (appWindow != null) {
                System.out.println(appWindow.getX());
                Thread.sleep(5000);
                appWindow.setSize(1920, 1080);
                System.out.println("Application window maximized.");
            } else {
                System.out.println("Could not find the application window.");
            }

        } else {
            System.err.println("unable to open the app " + appName);
        }

    }

    @When("I close the application")
    public void i_close_the_application() {

        if (appName != null && !appName.isEmpty()) {
            App app = App.focus("app.name");
            System.out.println("closing the app: " + appName);
            app.close();
        } else {
            System.err.println("unable to close the app " + appName + " it was closed already");
        }

    }

    @Given("I'm at order search screen")
    public void i_m_at_order_search_screen() {

    }

    @When("I enter the order number to search")
    public void i_enter_the_order_number_to_search() {

    }

    @When("I click the search button")
    public void i_click_the_search_button() {

    }

    @Then("I should see the order details displayed")
    public void i_should_see_the_order_details_displayed() {

    }

    @Then("I validate the order details")
    public void i_validate_the_order_details() {

    }

    @Given("I'm at order creation screen")
    public void i_m_at_order_creation_screen() {

    }

    @When("Creation page is displayed")
    public void creation_page_is_displayed() {

    }

    @When("Enter the order creation details")
    public void enter_the_order_creation_details() {

    }

    @When("Enter the sumbit button to create the order")
    public void enter_the_sumbit_button_to_create_the_order() {

    }

    @Then("validate the order creation success message")
    public void validate_the_order_creation_success_message() {

    }

    @When("IMC app is launched")
    public void imc_app_is_launched() {

    }

    @Then("navigate to Create Query page in full screen mode")
    public void navigate_to_create_query_page_in_full_screen_mode() {

    }

    @Then("Validate the Page")
    public void validate_the_page() {

    }
}