# mobiquity_assignment
## Environment Setup

1. Global Dependencies
    * [Install Maven](https://maven.apache.org/install.html)
    * Or Install Maven with [Homebrew](http://brew.sh/)
    ```
    $ brew install maven
    ```
2. Clonning the Project
    * Clone the project as new Project from version control
    * Wait until the project is indexing and run 
       ```
       mvn clean install
      
3. Project Dependencies
	* Above command will download all the project dependencies that need to run the project
 
4. Run feature files
	* Depending on the IDE you are using you may need to download relavant cucumber plugin to run the feature file
	* Run in the command line
	   * All tests
	```
	mvn test 
	```
	
	  * To run specific tests
	```
	mvn test -Dcucumber.options="--tags @SmokeTest
	```
  
5. For other documentation please refer the main/resources folder
