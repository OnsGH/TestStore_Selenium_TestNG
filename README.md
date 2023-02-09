# E-Commerce Website Test Automation With Selenium (Java ) and TestNG
## Description
 Write general test cases for eCommerce website:
```` 
1- Homepage Test Cases :
 - Links click on, test if is it taking the customer to the right page ?
 
2- Products Page Test:
 - Select the product, test if is it taking the customer to the right page ? 
 
3-  Products overview  Page Test:
  - Select Size
  - Increase/decrease qte
  - Add to cart 
  
4- Product shopping panel
  - Continue shopping / Proceed to checkout 

5- proceed to checkout test case
  - Remove Item test
  - Proceed to checkout test
  
6- Payment test
   - Checking the different payment options.
   ```` 
## Getting Started
### Drivers
   Install chromedriver (google chrome), msedgedriver (Internet Explorer), geckodriver (firefox) 
### Dependencies
 - org.seleniumhq.selenium
 - commons-io
### Plugins
- Integrate Surefire plugins with the testing frameworks TestNG  
```` 
          <configuration>
          	<suiteXmlFiles>
          		<suiteXmlFile>testng.xml</suiteXmlFile>
          	</suiteXmlFiles>
          </configuration>
 ```` 
## Project Steps
 - Create a new maven project
 - Configure the POM.xml file
 - Create the .properties file
 - Configure the POM.xml file
 - Create a basePage Class
 - Create Page Objects Classes
 - Create Test cases Classes
 - Generate the testng.xml file / Update testNG.xml
 - Take a screenshot on Test Failure 





   

   
