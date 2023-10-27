# First-Maven-MVC-Project

Introduction


This project is a simple web-based calculator application that allows users to add and subtract two numbers provided via a web browser. The application is built using the Spring Framework in a Model-View-Controller (MVC) architecture, with JSP (JavaServer Pages) for the view layer. This README provides an overview of the project, its key features, and how it's configured.

Project Features


1. User Input
Users can input two numbers through a web form accessed via their browser. The form allows them to enter numeric values for addition and subtraction operations.

2. Addition and Subtraction
The application provides two basic mathematical operations:
Addition: It takes two user-provided numbers and computes their sum.
Subtraction: It takes two user-provided numbers and computes the result of subtracting the second number from the first.

3. Service Layer
The project follows a well-structured architecture, including a service layer. The service layer is responsible for performing the actual addition and subtraction operations and returning the result.

4. HTML Form Response
The calculated result is displayed to the user in an HTML format. The user-friendly result is shown on the web page after they submit the form. This result is generated dynamically, enhancing the user experience.

5. Spring Framework MVC
The project leverages the Spring Framework's MVC architecture, which separates concerns and follows best practices for developing web applications. The controller handles user requests, delegates the processing to the service layer, and forwards the result to the JSP view.

Configuration


The project's configuration is a critical aspect of its functionality. It is configured to work seamlessly with the Spring Framework:

•	Spring MVC Configuration: The project includes configuration for Spring MVC, defining controllers, views, and view resolvers.
•	JSP Views: The user interface is created using JSP, which enables the dynamic generation of HTML content.
•	Controller: A Spring controller handles user requests and interacts with the service layer for computation.
•	Service Layer: The service layer encapsulates the logic for addition and subtraction operations.
•	HTML Response: The calculated result is formatted as HTML and presented to the user.


How to Run the Project


To run this project on your local machine, follow these steps:

1.	Clone this repository to your local environment.
2.	Ensure you have Java and a compatible web server (e.g., Apache Tomcat) installed on your machine.
3.	Build and deploy the project on your web server.
4.	Access the web application in your browser by navigating to the appropriate URL.
5.	Enter two numbers and click the "Calculate" button to perform addition or subtraction.
6.	The result will be displayed on the web page.

Conclusion


This simple web-based calculator project demonstrates the use of the Spring Framework in a Model-View-Controller (MVC) architecture to create a user-friendly web application for performing basic mathematical operations. By providing a clear structure and separating concerns, it serves as an excellent starting point for understanding web development with Spring and JSP.
