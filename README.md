# Membership Management System

This project is a Java-based membership management system for an organization. It provides functionalities to manage different types of members, including Advanced, Junior, and Officer members. The system allows adding, removing, and sorting members based on various criteria.

## Features

- **Member Types**: The system supports different types of members, each with specific attributes and responsibilities:
  - **Advanced Member**: Members with expertise in programming languages or computer architecture.
  - **Junior Member**: Junior members assigned to an Officer.
  - **Officer Member**: Members holding officer positions within the organization, such as head of the club, publicity officer, etc.

- **Member Management**: The system provides functionalities to add, remove, and search for members based on their ID. It also supports sorting members based on different criteria, such as member type, subscription level, and ID.

- **Error Handling**: The system includes error handling mechanisms to handle cases such as invalid member IDs.

## File Structure

- **Subscriber.java**: Parent class for all member types, containing common attributes and methods.
- **AdvancedMember.java**: Class representing advanced members with expertise in specific areas.
- **BeginnerMember.java**: Class representing beginner members.
- **JuniorMember.java**: Class representing junior members assigned to an officer.
- **OfficerMember.java**: Class representing officer members holding specific responsibilities.
- **MemberManager.java**: Class responsible for managing members, including adding, removing, and sorting.
- **Test.java**: Class containing the main method to test functionalities of the system.

## Usage

To use the system, simply run the `Test.java` file, which demonstrates various functionalities of the membership management system.

```java
public class Test {
    public static void main(String[] args) {
        // Add, remove, and sort members
        // Test error handling
    }
}
