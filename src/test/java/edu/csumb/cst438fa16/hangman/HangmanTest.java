package edu.csumb.cst438fa16.hangman;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * User story:
 *
 *   As a user I want to make sure that a letter only gets added if the letter I picked is correct or not
 *   so that I can know if my guess was right or not.
 * 
 */

public class HangmanTest {
	// Create a new instance of the Firefox driver
    // Notice that the remainder of the code relies on the interface, 
    // not the implementation.
    WebDriver driver = new ChromeDriver();
    
	@Before
	public void setUp(){

        // And now use this to visit Google
        driver.get("http://localhost:8080/hangman.html");
	}
	
	/**
     * Acceptance test:
     *
     *   Given that I am on the hangman page
     *   When I enter "z"
     *   I want to make sure that the letter is not added because its wrong
     */
	@Test
	public void testWrongCharacter() {
		//start hangman app with the word cat
		Hangman hangman = new Hangman("cat");

        // Find the text input element by its id
        WebElement element = driver.findElement(By.id("newGuesses"));

        WebElement submitButton = driver.findElement(By.id("submit"));
        // Enter something to search for
        element.sendKeys("z");
        

        // Now submit the form. WebDriver will find the form for us from the element
        submitButton.click();
        WebElement pattern = driver.findElement(By.id("pattern"));
		assertThat(pattern.getText(), equalTo("..."));
		driver.quit();
	}   
}
