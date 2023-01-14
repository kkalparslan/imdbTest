
  Feature: Imdb E2E Test

    @wip
    Scenario: The user should go to url and search menu
      Given The user should go imdb page and search films
      When The user should click menu and see "Awards & Events"
      And The user should click Oscar button
      And The user should click 1929 under the Event History title

