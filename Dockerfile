FROM eclipse-temurin:17-jdk
EXPOSE 2008
ADD target/FlightServices-0.0.1-SNAPSHOT.jar FlightServices-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/FlightServices-0.0.1-SNAPSHOT.jar"]