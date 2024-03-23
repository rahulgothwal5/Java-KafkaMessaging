# Java-KafkaMessaging

![Java](https://img.shields.io/badge/Built%20with-Java-orange)
![Spring Boot](https://img.shields.io/badge/Framework-Spring%20Boot-green)
![Kafka](https://img.shields.io/badge/Messaging-Kafka-red)
![Microservices](https://img.shields.io/badge/Architecture-Microservices-blue)
![Docker](https://img.shields.io/badge/Containerization-Docker-blueviolet)

This repository contains a Java Spring Boot application that demonstrates Kafka Messaging integration, along with other related technologies.

## Main Topic: Kafka Messaging

Kafka is a distributed streaming platform that allows you to publish and subscribe to streams of records, similar to a message queue or enterprise messaging system. This project showcases how Kafka can be used for messaging in a Java Spring Boot application.

## Technologies Used

- **Java Spring Boot**: The project is built using the Spring Boot framework, providing a robust foundation for building microservices.
- **Kafka Messaging**: Kafka is used for asynchronous messaging between different components of the application.
- **Cron Job**: Cron jobs are scheduled tasks that run periodically. This project demonstrates the usage of cron jobs within a Spring Boot application.
- **REST API**: The application exposes RESTful APIs for interaction with external clients.
- **Microservices**: The architecture follows microservices principles, allowing for scalability, maintainability, and independent deployment of components.
- **Docker**: Docker is used for containerizing the application, enabling consistent deployment across different environments.

## Postman Collection

The following table displays the available endpoints in the Postman collection for this project:

| Endpoint Name          | Method | URL                             | Description                                       |
|------------------------|--------|---------------------------------|---------------------------------------------------|
| Fetch all books        | GET    | localhost:8181/books            | Retrieves all books from the database             |
| Fetch all authors      | GET    | localhost:8282/authors          | Retrieves all authors from the database           |
| Fetch all notifications| GET    | localhost:8383/notifications    | Retrieves all notifications from the database     |

You can import the Postman collection using the [Postman Collection URL](https://www.getpostman.com/collections/1e886855-ccff-4c37-86a4-c9d6d8f4c96d).

## Repository Structure

- `src/`: Contains the source code of the Java Spring Boot application.
- `docker/`: Includes Docker-related files for containerization.
- `docs/`: Documentation files, including this README.md.

## Usage

1. Clone the repository:

   ```bash
   git clone https://github.com/rahulgothwal5/Java-KafkaMessaging.git
   ```
2. Build the project:
    ```bash
   cd Java-KafkaMessaging
   mvn clean install
   ```
3. Run the application:
     ```bash
   java -jar target/Java-KafkaMessaging.jar
   ```

Contributing
Contributions are welcome! Feel free to open issues or submit pull requests to improve the project.

License
This project is licensed under the MIT License.

This markdown code adds a table displaying the endpoints from the Postman collection and includes a link to import the collection. You can copy and paste this into your README.md file in your GitHub repository. Let me know if you need further assistance!

