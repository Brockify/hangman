package feature;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.csumb.cst438fa16.hangman.Hangman;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
 
public class HangmanGuessSteps {
	Hangman hangman;
	String result;
	@Given("I have a hangman app with the word '(.+)'")
	public void createNewHangmanGame(final String hangmanGameName)
	{
		hangman = new Hangman(hangmanGameName);
	}
	
	@When("^the user enters '(.+)' to guess as a letter$")
	public void guessLetter(String letter)
	{
		result = hangman.match(letter);
	}	
	
	@Then("The word should still look like '(.+)'$")
	public void checkAndTest(String word)
	{
		assertThat(word, equalTo(result));
	}

	
}
