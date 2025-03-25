# QA Engineer Challenge

## Technologies Used

- **Java**: The primary programming language used in this project.
- **Maven**: A build automation tool used for managing project dependencies and build lifecycle.
- **Cucumber**: A testing framework that supports Behavior Driven Development (BDD).
  - `cucumber-java`
  - `cucumber-junit`
  - `cucumber-core`
  - `gherkin`
- **Appium**: A tool for automating mobile applications.
- **JUnit 5**: A testing framework for Java.
- **SLF4J**: A simple logging facade for Java.

## Project Setup

### Prerequisites

- **Java Development Kit (JDK) 21**: Ensure you have JDK 21 installed.
- **Maven**: Ensure you have Maven installed.
- **IntelliJ IDEA**: Recommended IDE for this project.

### Steps to Setup

1. **Clone the Repository**:
    ```sh
    git clone <repository-url>
    cd <repository-directory>
    ```

2. **Open the Project in IntelliJ IDEA**:
    - Open IntelliJ IDEA.
    - Select `File` > `Open` and navigate to the cloned repository directory.

3. **Build the Project**:
    - Open the terminal in IntelliJ IDEA.
    - Run the following command to build the project:
      ```sh
      mvn clean install
      ```

4. **Run Tests**:
    - To run the tests, use the following command:
      ```sh
      mvn test
      ```

5. **Generate Reports**:
    - To generate the Cluecumber report, use the following command:
      ```sh
      mvn cluecumber-report:reporting
      ```

### Directory Structure

- `src/main/java`: Contains the main application code.
- `src/test/java`: Contains the test code.
- `src/test/resources`: Contains the feature files and other test resources.

### Additional Configuration

- **Maven Wrapper**: The project includes a Maven wrapper, so you can use `./mvnw` instead of `mvn` if Maven is not installed globally.
- **.gitignore**: The `.gitignore` file is configured to exclude build directories, IDE-specific files, and other unnecessary files.

## Notes

- Ensure that the `JAVA_HOME` environment variable is set to the JDK 21 installation path.
- The project uses JUnit 5 for testing, so make sure your IDE is configured to use JUnit 5.