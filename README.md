# swaglabs

This demo framework is build on Spring boot implementing page object model using cucumber, selenium and TestNG. 

  - main
    - java
      - com.swaglabs.qademo
        - browser
          - BrowserDriver      => manage creation of web driver (Chrome/Firefox and web driver wait)
        - config
          - Faker              => manage the demo data
        - page
          - *page              => all page objects are defined
        - utility
          - ScenarisoSession   => manage the data to be used within the steps
          - ScreenShotService  => manage the screenshot 
          - WebDriverHelper    => wrapper for selenium web driver
          - Workflow           => methods to support workflow of test
    - resources
      - application.properties => framework properties are defined
  - test
    - java
      - com.swaglabs.qademo
        - bdd
          - CucumberHooks      => cucumber hooks
          - *Steps             => step definitions
        - CucumberRunner       => runner class
    - resources
      - features 
        - *.features           => all features are defined
        
**Parameterised feature**     
  - price/name can be passed as parameter to sort the list of product by price or name
  - descending/ascending can be passed as a parameter to change the sorting order for name or price
  - list of poducts can be passed as comma seperated string. Eg "cheapest, costliest, 2nd cheapest, 5th costiest" 
 
**Run the test with command line**
  - Prerequisite: JDK 1.8, Maven
  - Clone the repository
  - Goto the project directory with pom.xml 
  - Run with Chrome _mvn clean install -Dbrowser=chrome_
  - Run with Firefox _mvn clean install -Dbrowser=firefox_
  
**Run in IntelliJ**
  - Prerequisite: JDK 1.8, Maven, IntelliJ, IntelliJ Plugin (Cucumber for Java)
  - Open the pom.xml as project
  - Click Run -> Edit Configuration
  - Add new Cucumber java configuration
  - Main Class: _io.cucumber.core.cli.Main_
  - Feature or folder path: _WORKSPACE/qa-demo/src/test/resources/features/_
  - Click Save
  - Run
  
