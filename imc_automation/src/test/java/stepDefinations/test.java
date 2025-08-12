package stepDefinations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.sikuli.script.Screen;
import org.sikuli.script.Pattern;
import org.sikuli.script.FindFailed;

public class test {

    Screen screen = new Screen();

    @Given("I have opened Notepad")
    public void i_have_opened_notepad() throws FindFailed {
        // Assuming you have a "notepad_icon.png" image
        screen.click("notepad_icon.png"); 
        // Add a delay or wait for the window to appear if needed
        screen.wait("notepad_window.png", 10); // Wait for the Notepad window to appear
    }

    @When("I type {string} into Notepad")
    public void i_type_into_notepad(String text) throws FindFailed {
        // Assuming you have an image of the Notepad's text area or a reliable location
        screen.type("notepad_text_area.png", text); 
    }

    @Then("Notepad should contain {string}")
    public void notepad_should_contain(String expectedText) throws FindFailed {
        // Verify the text by checking for an image containing the expected text
        screen.find(new Pattern(expectedText + ".png").exact()); // Look for an image with the expected text
        // Alternatively, use OCR if available and integrated with Sikuli or another library
    }
}