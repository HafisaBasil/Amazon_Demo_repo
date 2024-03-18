# Amazon Testcases

Amazon Testcases is a Maven project designed for automated testing of Amazon's web application using Selenium WebDriver, TestNG, and Extent Reports.

## Description

This project contains test cases to automate the testing of various features and functionalities of Amazon's web application. It utilizes Selenium WebDriver for browser automation, TestNG for test execution and reporting, and Extent Reports for generating detailed test reports.

## Installation

To set up and run this project, follow these steps:

1. Clone the repository to your local machine:

    ```bash
    git clone https://github.com/your-username/amazon-testcases.git
    ```

2. Import the project into your preferred IDE (e.g., Eclipse, IntelliJ IDEA).

3. Ensure you have Java installed on your machine.

4. Update the project dependencies using Maven. You can do this by running the following command in the project directory:

    ```bash
    mvn clean install
    ```

## Usage

To run the test cases:

1. Navigate to the test classes or test suites.

2. Run the tests using TestNG.

3. View the generated Extent Reports for detailed test execution results.

## Dependencies

- [Selenium WebDriver](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java) - Selenium automates browsers.
- [WebDriverManager](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager) - WebDriverManager helps to automate the management of the WebDriver binaries.
- [TestNG](https://mvnrepository.com/artifact/org.testng/testng) - TestNG is a testing framework for the Java programming language.
- [Extent Reports](https://mvnrepository.com/artifact/com.aventstack/extentreports) - Extent Reports is a reporting library for creating interactive and detailed test reports.

## Building from Source

If you want to build the project from source, you can use the following Maven command:

```bash
mvn clean package
Contributing
Contributions to this project are welcome. Feel free to submit bug reports, feature requests, or pull requests.

License
This project is licensed under the MIT License.
