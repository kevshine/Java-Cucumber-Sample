/**
 * 
 */
package io.cucumber.sample;

/**
 * @author user
 *
 */
public class FeedCookieMonster {

	private int cookiesEaten;
	private int bellyCapacity;
	private String monsterSays;

	FeedCookieMonster(int bellyCapacity, int cookiesEaten) {
		this.cookiesEaten = cookiesEaten;
		this.bellyCapacity = bellyCapacity;
	}

	public String eatCookies(int cookeiesToEat) {
		this.cookiesEaten = this.cookiesEaten + cookeiesToEat;
		if (cookiesEaten >= bellyCapacity) {
			this.monsterSays = "Stop feeding cookie monster!";
		} else {
			this.monsterSays = "Yum Yum give me more cookies!";
		}
		return monsterSays;
	}

	public String getCookieMonsterSays() {
		return this.monsterSays;
	}

}
