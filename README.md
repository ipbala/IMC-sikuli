# IMC Sikuli Automation Project

## Project Overview
This project automates end-to-end test cases for the IMC application using Java, Cucumber, TestNG, and Sikuli for UI automation. It includes JSON-based test data and image-based automation for desktop applications.

---

## Project Structure
```
IMC-sikuli/
│
├── imc_automation/
│   ├── pom.xml                # Maven build file with dependencies
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/imc/
│   │   │   │       ├── Main.java
│   │   │   │       ├── TestRunner.java
│   │   │   │       ├── pojo/
│   │   │   │       │   └── CreateOrderPojo.java
│   │   │   │       └── utils/
│   │   │   │           └── JsonOrderParser.java
│   │   │   └── resources/
│   │   │       ├── images/   # Image files for Sikuli
│   │   │       └── testData/ # JSON test data files
│   │   └── test/
│   │       ├── features/     # Cucumber feature files
│   │       ├── java/
│   │       │   └── testng.xml
│   │       └── stepDefinations/
│   │           └── logintest.java
│   └── target/               # Build output, reports, and generated files
│
├── README.md                 # Project documentation
└── ...
```

---

## Setup Instructions

1. **Prerequisites:**
	- Java JDK 8 or above
	- Maven 3.x
	- (Optional) SikuliX setup for image-based automation

2. **Clone the repository:**
	```sh
	git clone <your-repo-url>
	cd IMC-sikuli/imc_automation
	```

3. **Install dependencies:**
	```sh
	mvn clean install
	```

---

## Running the Tests

### 1. Using Maven (Recommended)
Run all tests (including Cucumber and TestNG):
```sh
mvn test
```

### 2. Using TestNG
You can run specific TestNG suites:
```sh
mvn -DsuiteXmlFile=src/test/java/testng.xml test
```

### 3. Running Main Classes
To run a specific Java class (e.g., JSON parser):
```sh
mvn exec:java -Dexec.mainClass="com.imc.utils.JsonOrderParser"
```

---

## Reports
- Test reports are generated in `imc_automation/target/surefire-reports/` and `imc_automation/target/cucumber-reports.html`.

---

## Notes
- Place your test images in `src/main/resources/images/`.
- Place your test data JSON files in `src/main/resources/testData/`.
- Update feature files and step definitions as your test scenarios evolve.

---

## Troubleshooting
- Ensure all dependencies are installed via Maven.
- For SikuliX, make sure the required native libraries are available if running image-based tests.
- Check the `target/surefire-reports/` directory for detailed error logs if tests fail.

---

## Contribution
Feel free to fork and submit pull requests for improvements or bug fixes.
