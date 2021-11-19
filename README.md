# factory-pattern

## Table of content
- [Introduction](#introduction)
- [Out Of Scope](#out-of-scope)
- [Explanation Factory Pattern](#explanation-factory-pattern)
- [Explanation Other important Points](#explanation-other-important-points)
- [Technologies Used](#technologies-used)
- [Prerequisities](#prerequisities)
- [Commands](#commands)
- [Contribution](#contribution)
- [References](#references)
- [Contact Information](#contact-information)

## Introduction

The aim of this project is to show case how to create types of classes(which originate from an Interface/Abstract class) and create objects dynamically. Otherwise, without factory method pattern, we have to create objects at compile time which increases coupling but also code harder to extend for future requirements.

In simple words, Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.

The Factory Method separates object(also known as product in some books) construction code from the code that actually uses the object. Therefore it’s easier to extend the object construction code independently from the rest of the code.


## Out Of Scope

- To be defined.

## Explanation Factory Pattern

The definition from `Gang of Four` book is as follows:

`"Define an interface for creating an object, but you let the subclasses decide which class to instantiate. Factory method lets a class defer initiation to sub-classes."`

- To be expanded further.



The scenario used in this project is as follows:

- Describe scenario
We have different types of server(for now, let's consider two types: _MailServer_ and _FTPServer_). We have a troubleshooting application which takes server name as input from command line based on the name of the server, it will resolve the issue. 

- Insert architecture diagram

Please note that we do not know which type of server the user will input before the application starts running. It is in this scenario that factory method is well suited as we can create the appropriate server object at runtime using polymorphism.  


- Explain the solution

**Extensibility:**
- Explain how further server types can be handled in the future. 

## Explanation Other Important Points

- To be defined.

**Possible use cases in which factory method applies:**

- define use cases(Give 2-3 use cases)

## Technologies Used

- Java 11

## Prerequisities

None

## Commands

In order to run the project, open project in an IDE ---> Navigate to _com.umer.servermanagement.usage_ package ---> Right click on _ServerManagementTool.java_ ---> Run As ---> Java Application ---> Enter appropriate input.

## Contribution

Feature requests, issues, pull requests and questions are welcome.

## References

- [1](https://www.youtube.com/watch?v=mTzDf_EZ1aM): Understanding The Factory Design Pattern **(Youtube)** **[Primary Video resource for this project]**
- [2](https://www.youtube.com/watch?v=EcFVTgRHJLM): Factory Method Pattern – Design Patterns **(Youtube)**
- [3](https://www.youtube.com/watch?v=v-GiuMmsXj4): Abstract Factory Pattern – Design Patterns **(Youtube)** **[What this example is not!!!]**
- [4](https://github.com/RefactoringGuru/design-patterns-java/tree/master/src/refactoring_guru/factory_method/example):  RefactoringGuru /
design-patterns-java **(GitHub)**

## Contact Information

How to reach me? At [github specific gmail account](mailto:syedumerahmedcode@gmail.com?subject=%5BGitHub%5D%20Hello%20from%20Github). Additionally, you can reach me via [Linkedin](https://www.linkedin.com/in/syed-umer-ahmed-a346a746/) or at [Xing](https://www.xing.com/profile/SyedUmer_Ahmed/cv)

