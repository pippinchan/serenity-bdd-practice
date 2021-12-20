# BDD Test Automation Exercise Using Cucumber & Java

This project is built on top of the below skeleton
- https://github.com/serenity-bdd/serenity-cucumber-starter

## Tech stack
- BDD Framework:
    - Cucumber https://cucumber.io
    - Serenity BDD https://serenity-bdd.info
- Web Test Framework: Selenium WebDriver
- API Test Framework: RestAssured

## Installation

Steps below were tested on
- macOS Monterey 12.0.1 / Apple Silicon architecture
- Google Chrome 96.0.4664.110

1. Install Homebrew (if not already installed)
```
# replace _______ to your username
ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
echo 'eval "$(/opt/homebrew/bin/brew shellenv)"' >> /Users/_______/.zprofile
eval "$(/opt/homebrew/bin/brew shellenv)"
brew help
```

2. Install Java & Maven (if not already installed)
```
brew install java
sudo ln -sfn /opt/homebrew/opt/openjdk/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk.jdk
java --version
brew install mvn
mvn -v
```

3. Initialize dependencies & verify successful execution
```
# run from this directory
mvn dependency:resolve
mvn clean verify -Dcucumber.filter.tags="@Smoke and @Wikipedia"
open target/site/serenity/index.html
```

4. (Optional) IDE Setup
- Install IntelliJ IDEA Community Edition
- Install "Cucumber for Java" plugin
- Open class "CucumberTestSuite"
- Execute class

## Improvement bucket lists (TODO)
- Add API test solution
- Configurable URL for each test environments (mentioned in README.original.md)
- Testable on more than one browser locally or APIs like BrowserStack (mentioned in README.original.md)
- Cover more test cases
- Learn how ScreenPlay feature of Serenity framework works with multiple actors
- Learn other frameworks such as Cypress since it has video recording & compare
- Explore CI/CD integration
