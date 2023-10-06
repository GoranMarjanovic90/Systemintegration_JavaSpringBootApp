# Java Spring Boot Temperature Monitoring Application

![IMG_1518](https://github.com/GoranMarjanovic90/Systemintegration_JavaSpringBootApp/assets/113011527/804e43a5-660c-4b73-a0fe-45e1337736d4)


This is a Java Spring Boot application for monitoring and recording temperature data from an Arduino device. The application reads temperature data from a serial port, stores it in a MySQL database, and provides a web interface for viewing temperature records.

## Features

- Reads temperature data from an Arduino device via a serial port.
- Stores temperature records in a MySQL database using Spring Data JPA.
- Provides a web-based user interface for viewing temperature data.
- Supports real-time temperature monitoring and historical data retrieval.

## Getting Started

### Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed.
- MySQL database server set up with the appropriate schema.
- An Arduino device connected to the serial port (e.g., COM3).

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/GoranMarjanovic90/Systemintegration_JavaSpringBootApp.git

2. Configure the application properties in src/main/resources/application.properties
- spring.datasource.driver-class-name=com.mysql.jdbc.Driver
- spring.datasource.url=jdbc:mysql://localhost:3306/temperatur
- spring.datasource.username=dbUser1
- spring.datasource.password=password
- spring.jpa.hibernate.ddl-auto=update
- spring.jpa.show-sql=true


3. Build and run the application:

- ./mvnw spring-boot:run

The application will start, and you can access it at http://localhost:8080.

## Usage

Connect your Arduino device to the specified serial port (e.g., COM3).
Access the web interface at http://localhost:8080/temperatures to view temperature records.

## Contact
If you have any questions or need assistance, please feel free to contact https://www.linkedin.com/in/goran-marjanovic-40a27b24b/.












