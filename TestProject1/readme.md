Design and implement a CRUD application for managing a medical register with the following features:

1. Backend using Spring Boot 3
2. Frontend using XHTML (JSF)
3. LDAP integration via Auth0
4. Optional logging and audit features
5. Automated testing suite
6. CI/CD pipeline

### Assumptions

The following assumptions are made to complete the design:

- **Authentication**: We assume the use of Auth0 as an identity provider, integrated with Spring Security for authentication. LDAP compatibility is achieved through Auth0's LDAP connector.
- **Frontend**: XHTML-based frontend will be implemented using JSF (Jakarta Server Faces) which works well with XHTML templates.
- **Database**: MySQL.
- **User Roles**: Basic access control will be assumed with administrative access for all CRUD operations.
- **Deployment**: GitHub Actions will be used for CI/CD.
- **Logging and Audit**: Optional audit logging will be implemented using Spring AOP or service-level logging.
- **Testing**: Unit tests will be created using JUnit and Mockito. Integration tests will use Spring Boot Test.
