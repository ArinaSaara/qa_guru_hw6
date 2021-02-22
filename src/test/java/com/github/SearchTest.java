package com.github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTest {

    String url = "https://www.google.com/",
            searchText = "Selenide",
            resultSearch = "selenide.org";
    @Test
    void searchSelenideWithGoogleTest() {
        open(url);
        $("[name = q]").setValue(searchText).pressEnter();
        $("#search").shouldHave(text(resultSearch));
    }
}