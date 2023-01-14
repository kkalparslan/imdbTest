package com.imdb.stepDefs;

import com.imdb.pages.MenuPage;
import com.imdb.utilities.ConfigurationReader;
import com.imdb.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Menu_StepDefs {
    MenuPage menuPage=new MenuPage();

    @Given("The user should go imdb page and search films")
    public void the_user_should_go_imdb_page_and_search_films() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user should click menu and see {string}")
    public void the_user_should_click_menu_and_see(String expectedTitle) {
        menuPage.clickMenu_mtd();
        menuPage.getText_mtd(expectedTitle);

    }
    @When("The user should click Oscar button")
    public void the_user_should_click_button() {
        menuPage.clickOscar_mtd();
    }
    @When("The user should click {int} under the Event History title")
    public void the_user_should_choose_under_the_event_history_title(Integer int1) {
        menuPage.click1929_mtd();
        menuPage.charleyBtn_mtd();

    }

}
