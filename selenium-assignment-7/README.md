
<h1 align="center">Selenium Automation</h1>

<p align="center">
  Web Automation Testing using Java, Selenium WebDriver, TestNG and Maven
</p>

## Project Overview

Selenium Automation is a web automation testing project developed using Java, Selenium WebDriver, TestNG, and Maven.

The project focuses on automating common user workflows such as login testing, homepage validation, product navigation, and product detail verification.

This project was developed as part of Assignment No. 7 - Selenium Automation and follows the Page Object Model (POM) design pattern.

## Technologies Used

| Technology | Version | Purpose |
| :--- | :--- | :--- |
| Java | 17 | Programming language |
| Selenium WebDriver | 4.48.0 | Browser automation |
| TestNG | 7.11.0 | Test execution and assertions |
| Maven | 3.9+ | Dependency management |
| Google Chrome | Latest | Browser |
| Visual Studio Code | - | Development environment |

## Features

* Login failure testing
* Successful login testing
* Homepage validation
* Product navigation
* Product detail validation
* Product availability validation
* Reusable Selenium methods
* Explicit waits
* TestNG assertions
* Page Object Model
* Maven test execution

## Code Structure

| Component | Description |
| :--- | :--- |
| `BaseTest.java` | Handles WebDriver setup and browser cleanup. |
| `BasePage.java` | Contains reusable Selenium methods. |
| `LoginPage.java` | Contains login page locators and actions. |
| `ProductPage.java` | Contains product page locators and actions. |
| `LoginTest.java` | Contains login test cases. |
| `ProductTest.java` | Contains product navigation and validation tests. |
| `testng.xml` | Defines the TestNG test suite. |
| `pom.xml` | Contains Maven dependencies and project configuration. |

## Project Structure

```text
selenium-assignment-7/
│
├── pom.xml
├── testng.xml
│
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── base/
│   │       │   └── BaseTest.java
│   │       │
│   │       ├── pages/
│   │       │   ├── LoginPage.java
│   │       │   └── ProductPage.java
│   │       │
│   │       └── utils/
│   │           └── BasePage.java
│   │
│   └── test/
│       └── java/
│           └── tests/
│               ├── LoginTest.java
│               └── ProductTest.java
│
└── target/

```

## Page Object Model
```text
                    TestNG Tests
                         │
              ┌──────────┴──────────┐
              │                     │
         LoginTest             ProductTest
              │                     │
              ▼                     ▼
         LoginPage             ProductPage
              │                     │
              └──────────┬──────────┘
                         ▼
                     BasePage
                         │
                         ▼
                 Selenium WebDriver
                         │
                         ▼
                   Google Chrome

  ```

## Reusable Methods
Common Selenium operations are placed inside BasePage.java to avoid repeating the same code throughout the project.Examples include:
```
Javaclick(element);
enterText(element, text);
waitForElement(element);
isDisplayed(element);
```

For example:
```
Javaclick(loginButton);
enterText(usernameField, username);
enterText(passwordField, password);
```

## Login Test Flow
```
Browser
     │
     ▼
Open Application
     │
     ▼
Enter Username
     │
     ▼
Enter Password
     │
     ▼
Click Login
     │
     ▼
Validate Login Result
     │
     ▼
Close Browser
```

## Product Test Flow
```
Open Browser
     │
     ▼
Login
     │
     ▼
Open Products
     │
     ▼
Select Product
     │
     ▼
Validate Product Details
     │
     ▼
Check Product Availability
     │
     ▼
Close Browser
```

## Test Results
When all tests pass, Maven displays:
```
run: 3
Failures: 0
Errors: 0
Skipped: 0

BUILD SUCCESS
```