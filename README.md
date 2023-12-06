# Email OAuth Backend

This Spring Boot project provides a backend service for sending emails on behalf of users using OAuth 2.0 authentication with multiple email providers. It allows authenticated users to send emails on behalf of their accounts.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [Configuration](#configuration)
  - [Build and Run](#build-and-run)
- [Endpoints](#endpoints)
- [Authentication](#authentication)
- [Contributing](#contributing)
- [License](#license)

## Features

- OAuth 2.0 authentication with multiple email providers.
- Sending emails on behalf of authenticated users.
- Secure endpoints with Spring Security.
- Customizable and extensible structure.

## Prerequisites

- Java 20 or later
- Maven

## Getting Started

### Configuration

Configure OAuth 2.0 properties in the `application.properties` or `application.yml` file. Customize the configurations for each email provider.

```yaml
# Microsoft (Outlook) OAuth 2.0 properties
spring.security.oauth2.client.registration.outlook.client-id=your-outlook-client-id
spring.security.oauth2.client.registration.outlook.client-secret=your-outlook-client-secret
# ... (other Outlook properties)

# Google OAuth 2.0 properties
spring.security.oauth2.client.registration.google.client-id=your-google-client-id
spring.security.oauth2.client.registration.google.client-secret=your-google-client-secret
# ... (other Google properties)
```

### Build and Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/email-oauth-backend.git
   cd email-oauth-backend
   ```

2. Build the project:

   ```bash
   mvn clean install
   ```

3. Run the application:

   ```bash
   mvn spring-boot:run
   ```

The application will be accessible at `http://localhost:8080`.

## Endpoints

- `/send-email`: POST endpoint to send emails. Requires OAuth 2.0 authentication.

## Authentication

Authenticate users with OAuth 2.0 using the configured email providers. Secure your endpoints by including the appropriate authorities.

## Contributing

Contributions are welcome! See [CONTRIBUTING.md](CONTRIBUTING.md) for more information.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.