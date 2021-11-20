# factory-pattern

## Table of content
- [Introduction](#introduction)
- [Out Of Scope](#out-of-scope)
- [Explanation Factory Pattern](#explanation-factory-pattern)
- [Explanation Other Important Points](#explanation-other-important-points)
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

Since the main idea is to implement factory method pattern in code, tests are out of scope of this project. However, there can be scenarios in which test classes can also used different types of objects at runtime using factory method pattern. 

## Explanation Factory Pattern

The definition from `Gang of Four` book is as follows:

`"Define an interface for creating an object, but you let the subclasses decide which class to instantiate. Factory method lets a class defer initiation to sub-classes."`

Basically, this means that we have an interface and classes implement that interface. Eventually, there is a class which takes care of initialization of the appropriate instance of the class but instead of delivering a concrete object, it delivers an object of type: Interface(as we have done in the project).

**Reasons for using factory method pattern:**

- We know that when to create an object of required functionality(s) but type of object will remain undecided or it will be decided on dynamic parameters being passed. or more simply put: 
- Class cannot anticipate the class of objects it must create.



The **scenario used in this project** is as follows:

- Describe scenario
We have different types of server(for now, let's consider two types: _MailServer_ and _FTPServer_). We have a troubleshooting application which takes server name as input from command line based on the name of the server, it will resolve the issue. 

- Insert architecture diagram

Please note that we do not know which type of server the user will input before the application starts running. It is in this scenario that factory method is well suited as we can create the appropriate server object at runtime using polymorphism.  

**Solution:**

First, we create an interface _IServer_ which contains the `resolve()` method:

```java 
public interface IServer {

	/**
	 * Resolves any network related issues for a specific server
	 */
	public void resolve();
}

```

Next, we created _MailServer_ and _FTPServer_ classes which implement _IServer_ interface. For example, MailServer class is shown below:

```java

public class MailServer implements IServer{

	@Override
	public void resolve() {
		System.out.println("Performing some complex Mail server resolution algolrithm.");
		System.out.println("Mail Server is fixed.");
	}

}

```

 Now, in the _servermanagement_ package, we created _ServerFactory_ class which contains `getServer()` method. The main idea to understand is that this method return _IServer_ object instead any concrete object. Due to this nature, when it takes server name as input, it goes through a switch-case statement and generate an instance of the appropriate Server class but since all server classes are also instance of IServer interface(via implementation), we can return IServer object as retur value. The code looks as follows:
 
```java
/**
 * This class will pump out different types of server objects.
 * 
 * @author umer
 *
 */
public class ServerFactory {

	public static IServer getServer(String serverType) throws Exception {
		// This contains the logic of which server object to invoke.
		switch (serverType) {
		case "mail":
			return new MailServer();
		case "ftp":
			return new FTPServer();
		/**
		 * In case we have additional servers in the future such as APP Server or Test
		 * Server, We can simply add another case here with a class that implements the
		 * IServer interface.
		 * 
		 * 
		 */
		default:
			throw new Exception("Invalid server type");
		}
	}
}
```

Inside the _usage_ package, main() method simulates taking user input and fixing the relevant server type.  

```java


public class ServerManagementTool {

	public static void main(String[] args) throws Exception {
		/**
		 * This user input takes place of a GUI drop down, so that we can keep the
		 * implementation simple and focus on the implementation and usage of Factory
		 * pattern
		 * 
		 * Helps us in determining what type of server does the user wants to resolve?
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Which server do you want to resolve?");
		String serverName = input.nextLine();
		
		/**
		 * We do not specify explicitly i the code which server to initialize. This is taken care of by the factory itself.
		 */
		IServer server=ServerFactory.getServer(serverName);
		server.resolve();
	}
}

```

**Extensibility:**

So, in future, if new servers are to be added(for example, test server), it can simply implement the _IServer_ interface, have a case in the _SereverManagementTool_ class which can be invoked by passing the parameter from the main method.

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
- [4](https://github.com/RefactoringGuru/design-patterns-java/tree/master/src/refactoring_guru/factory_method/example):  RefactoringGuru/design-patterns-java **(GitHub)**
- [5](https://stackoverflow.com/questions/69849/factory-pattern-when-to-use-factory-methods): Factory Pattern. When to use factory methods? **(Stack Overflow)**

## Contact Information

How to reach me? At [github specific gmail account](mailto:syedumerahmedcode@gmail.com?subject=%5BGitHub%5D%20Hello%20from%20Github). Additionally, you can reach me via [Linkedin](https://www.linkedin.com/in/syed-umer-ahmed-a346a746/) or at [Xing](https://www.xing.com/profile/SyedUmer_Ahmed/cv)

