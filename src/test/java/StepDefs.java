
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs {
	
	private String today;
    private String actualAnswer;
    
    static String isItFriday(String today) {
        return "Nope";
    }
	
	@Given("today is Sunday")
	public void today_is_Sunday() {
	    // Write code here that turns the phrase above into concrete actions
	    today = "Sunday";
	}

	@When("I ask whether it's Friday yet")
	public void i_ask_whether_it_s_Friday_yet() {
	    // Write code here that turns the phrase above into concrete actions
		actualAnswer = isItFriday(today);
	}

	@Then("I should be told {string}")
	public void i_should_be_told(String expectedAnswer) {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(expectedAnswer, actualAnswer);
	}

}
