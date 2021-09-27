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



### Keyword Notes

- WebMvcConfigurer
  - Defines callback methods to customize the Java-based configuration for Spring MVC
- AddCorsMapping
  - Configure "global" cross origin request processing. The configured CORS mappings apply to annotated controllers, functional endpoints, and static resources
- Authentication Manager
  - Attempts to authenticate the passed Authentication object, returning a fully populated Authentication object (including granted authorities) if successful
- Password Encoder
  - Service interface for encoding passwords. The preferred implementation is BCryptPasswordEncoder
- @Valid
  - Annotation for method level validation. Moreover, we also use it to mark a member attribute for validation. DOESN'T SUPPORT GROUP VALIDATION, INSTEAD USE @Validated
- @CrossOrigin
  - Annotation for allowing requests across origins
- @ResponseStatus
  - Used to specify the response status of a controller method
- @ManyToMany
  - Used within an embeddable class contained within an entity class to specify a relationship to a collection of entities
- @EnableGlobalMethodSecurity
  - Enables Spring Security global method security
- @Bean
  -  Tells that a method produces a bean to be managed by the Spring container. It is a method-level annotation
- @Autowired
  - Provides more fine-grained control over where and how autowiring should be accomplished
- @Component
  - Allows Spring to automatically detect our custom beans; aka Spring scans our application for classes annotated with this instantiate them, and inject any specified dependencies into them
- @JsonIgnore
  - Used to ignore the logical property used in serialization and deserialization
- @Service
  - Used with classes that provide some business functionalities
- @Entity
  - Specifies that the class is an entity and is mapped to a database table
- @Table
  - Specifies the name of the database table to be used for mapping