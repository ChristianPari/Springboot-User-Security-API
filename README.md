# Springboot User Security API
[Insomnia Documentation](https://christianpari.github.io/Springboot-User-Security-API)

This API project was mainly used to learn about adding a type security and levels of access to my applications using JWTs and Spring Security. Users can make accounts with standard access, where as say an employer can have moderators and admins with each a specific level of access, and these accounts are stored within a locally hosted MySQL database. when the local server is running, users can access endpoints that require certain levels of access and are otherwise forbidden and prompted so. A simple breakdown, topmost clearance -> lowest level clearance: Admin, Moderator, User, Public. Multiple Controllers; User handling, Authentication upon login and signup, and a Testing handler which was used to test the clearance levels and access capabilities. 


## Technologies Used
- Spring
  - Springboot
  - Web
  - JPA
  - Security
  - Validaiton
  - Devtools
- Json Web Token
- Dotenv
- Javax Validation
- MySQL Connector


## Things I Learned
- Learned how to incorporate JWT into requests for Users
  - JWT validation with error handling and logging
  - Parsing and extracting data from the JWT
  - Building a JWT
- Working with Web Security and Configuration
  - Password encrypting
  - Authentication managing
- Cors Configuring for Request Mapping


## In The End
This project was A LOT for me, theres so much to break down and understand and I know I am nowhere near knowing everything possible but getting the practice and time spent on these backend processes.
