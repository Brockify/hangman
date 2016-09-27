package edu.csumb.cst438fa16.hangman.rest;

import javax.ws.rs.core.Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import javax.ws.rs.ApplicationPath;

/**
 * See:
 * https://jersey.java.net/documentation/latest/deployment.html
 * http://buraktas.com/resteasy-example-without-using-a-web-xml/
 * http://stackoverflow.com/a/26721737
 */
@ApplicationPath("rest")
public class HangmanApplication extends Application {
	 public static void main(String[] args) {
	    }
}
