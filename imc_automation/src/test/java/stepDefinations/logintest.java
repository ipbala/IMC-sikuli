package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.sikuli.script.Screen;
import org.sikuli.script.Pattern;
import org.sikuli.script.FindFailed;

public class logintest {

     Screen screen = new Screen();
    @Given("I have opened Notepad")
public void I_have_opened_Notepad() {
    System.out.println("first Step");
   
}
@When("I type {string} into {string}")
public void i_type_into(String username, String imagepath) {
    System.out.println(username+ " " + imagepath);
   
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