# Membership Management System

This project is a Java-based membership management system for an organization. It provides functionalities to manage different types of members, including Advanced, Junior, and Officer members. The system allows adding, removing, and sorting members based on various criteria.

## Features

- **Member Types**: The system supports different types of members, each with specific attributes and responsibilities:
  - **Advanced Member**: Members with expertise in programming languages or computer architecture.
  - **Junior Member**: Junior members assigned to an Officer.
  - **Officer Member**: Members holding officer positions within the organization, such as head of the club, publicity officer, etc.

- **Member Management**: The system provides functionalities to add, remove, and search for members based on their ID. It also supports sorting members based on different criteria, such as member type, subscription level, and ID.

- **Error Handling**: The system includes error handling mechanisms to handle cases such as invalid member IDs.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor with Java support

## Installation

1. Clone the repository to your local machine using:
   ```bash
   git clone https://github.com/yourusername/membership-management-system.git

    Navigate to the project directory:

    bash

    cd membership-management-system

    Open the project in your preferred Java IDE or text editor.

## File Structure

    Subscriber.java: Parent class for all member types, containing common attributes and methods.
    AdvancedMember.java: Class representing advanced members with expertise in specific areas.
    BeginnerMember.java: Class representing beginner members.
    JuniorMember.java: Class representing junior members assigned to an officer.
    OfficerMember.java: Class representing officer members holding specific responsibilities.
    MemberManager.java: Class responsible for managing members, including adding, removing, and sorting.
    Test.java: Class containing the main method to test functionalities of the system.

## Usage

    Open Test.java in your Java IDE.
    Run the Test.java file. This will execute the main method which demonstrates various functionalities of the membership management system.
```bash
java

public class Test {
    public static void main(String[] args) {
        // Add, remove, and sort members
        // Test error handling
    }
}

## Members Club

    This program can register members of a club with a set of attributes such as name, address, and the like.
    Each member of the club has a specific membership role, such as Manager, Junior, Beginner, Officer, etc.
    All members are related to each other somehow; hence a Subscriber class holds all attributes.
    Each subclass extends Subscriber.
    The program can sort the members alphabetically and show an ordered list of members who didn't pay.
    It also prints a report of all members given any of their attributes.
    The program is built on a stack data structure, specifically, a stack of arrays to contain strings, boolean, and integer values.

## Contributing

If you would like to contribute to the project, please fork the repository and create a pull request with your changes. Make sure to update the documentation as necessary.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.
