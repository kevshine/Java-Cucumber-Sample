package io.cucumber.sample;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.sample.FeedCookieMonster;

public class Stepdefs {

	FeedCookieMonster cookieMonster = null;
	String cookieMonsterMessage = "";

	@Given("cookie monster can eat {int} cookies and he has {int} cookies in his belly")
	public void cookie_monster_can_eat_cookies_and_he_has_cookies_in_his_belly(Integer int1, Integer int2) {
		cookieMonster = new FeedCookieMonster(int1, int2);
	}

	@When("cookie monster eats {int} cookie")
	public void cookie_monster_eats_cookie(Integer int1) {
		cookieMonsterMessage = cookieMonster.eatCookies(int1);
	}

	@Then("cookie monster says {string}")
	public void cookie_monster_says(String string) {
		assertEquals(string,cookieMonsterMessage);
	}

}
