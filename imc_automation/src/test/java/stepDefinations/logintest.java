package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.lang.Thread;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class logintest {

    String windowImage = "windows.png";
    String appImage = "app.png";
     Screen s = new Screen();
     
    @Given("IMC App open using the batfile")
    public void I_have_oIMC_App_open_using_the_batfile() throws FindFailed, InterruptedException {
    
    try {
        s.find(windowImage);
        s.highlight(windowImage);
        Thread.sleep(100);
        s.doubleClick();
        System.out.println(s.getPrimaryScreen() + " " + s.getBounds());
        s.find(appImage);
        s.highlight(appImage);
        Region r = new Region(10,20,100,100);
        r.highlight(2);
        r.exists(null);
        String extract_text = s.text();
        System.out.println("Extracted Text: " + extract_text);
        System.out.println("first Step");
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