<h1 align="center"> 
Coffee Machine Simulator </h1>
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java-Java%20OOPs-darkblue?labelColor=yellow&style=flat" />
</a>


This is a Java console application that simulates a coffee machine. The program allows you to manage the coffee machine by performing various actions such as buying coffee, filling ingredients, taking money, and viewing the status and analytics of the machine.

---



## Features

The Coffee Machine Simulator provides the following features:

- **buyCoffee**: Allows the user to purchase different types of coffee (Espresso, Latte, Cappuccino) with their respective prices. Coffee will be dispensed only if there are enough ingredients in the machine.

- **Espresso**: price - $4/cup, water needed – 250 ml/cup, milk needed – 0 ml/cup, beans needed - 16/cup

- **Latte**: price - $7/cup, water needed – 350 ml/cup, milk needed – 75 ml/cup, beans needed - 20/cup

- **Cappuccino**: price - $6/cup, water needed – 200 ml/cup milk needed – 100 ml/cup beans needed - 12/cup.

- **fillIngredients**: Enables the user to add more ingredients (water, milk, beans) to the coffee machine.
- **takeMoney**: Allows the maintainer to collect the money accumulated in the money box.
- **showIngredients**: Displays the current status of the coffee machine, including the amount of water, milk, beans, and money available.
- **showAnalytics**: Shows the count of each type of coffee sold, the total earnings, and the total amount of ingredients consumed.

## Getting Started

To run the Coffee Machine Simulator, follow these steps:

1. Ensure you have Java installed on your system.
2. Download the source code files or clone the repository.
3. Compile the Java source files using the following command:

```
javac CoffeeMachineSimulator.java
```

4. Run the application with the following command:

```
java CoffeeMachineSimulator
```

5. Follow the on-screen instructions to interact with the Coffee Machine Simulator.

## Usage

Once the application is running, you will be presented with a menu of actions to choose from. Enter the corresponding number for the action you want to perform:

1. **Buy coffee**: Select the type of coffee you wish to buy.
2. **Fill ingredients**: Add more ingredients to the coffee machine.
3. **Take money**: Collect the money from the money box.
4. **Show ingredients**: View the current status of the coffee machine.
5. **Analytics**: Display the sales statistics and ingredient consumption.
0. **Exit**: Quit the simulator.

Follow the prompts and enter the required information as requested by each action.

## OOPS Concepts Used

In the Coffee Machine Simulator code provided, several Object-Oriented Programming (OOP) concepts have been utilized. Here are the OOP concepts used in the implementation:

1. Classes and Objects:
    - The `CoffeeMachine` class represents the coffee machine and encapsulates its state and behavior.
    - The `Main` class contains the main method and serves as the entry point of the program.

2. Encapsulation:
    - The `CoffeeMachine` class encapsulates the internal state of the coffee machine, such as the amounts of water, milk, coffee beans, and money.

3. Abstraction:
    - The `CoffeeMachine` class provides an abstraction of a coffee machine by exposing methods to interact with its functionality, such as buying coffee, filling ingredients, taking money, and showing information.

4. Method Overloading:
    - The `buy` method in the `CoffeeMachine` class is overloaded to handle different types of coffee based on the input.

5. Data Hiding:
    - The instance variables in the `CoffeeMachine` class are private, preventing direct access from outside the class. Access to these variables is controlled through public methods, such as getters and setters.

6. Modularity:
    - The code is divided into separate classes (`CoffeeMachine` and `Main`) to separate concerns and promote modularity.

7. Single Responsibility Principle:
    - Each class has a single responsibility. The `CoffeeMachine` class is responsible for managing the coffee machine's state and behavior, while the `Main` class is responsible for handling user input and controlling the simulation.

These are the main OOP concepts used in the provided Coffee Machine Simulator code.

## Buying Coffee


## Adding ingredients

## Buying Coffee and Seeing Remaining Ingredients and Money Collected So far

## See analytics and Collect Money from Machine





## Author
👤 **Pooja Gurnule**
* GitHub: [Pooja Gurnule](https://github.com/poojagurnule)

---

## 🤝 Contributing

- Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page]("url").
---

## Show your support
Give a ⭐️ if this project helped you!

---