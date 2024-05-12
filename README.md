# Adapter Practice

This repository contains an example implementation of the Adapter design pattern in Java. The Adapter pattern allows incompatible interfaces to work together, making it possible to integrate components with different interfaces seamlessly.

## Introduction

The Adapter design pattern is a structural pattern used to reconcile differences between interfaces of different classes. It is particularly useful when integrating legacy or third-party code into a system without modifying existing code. 

In this example, we demonstrate how to adapt square and hexagon pegs to fit into a round hole by using adapter classes. The adapters translate the interface of the square and hexagon pegs into one that the client code expects, allowing them to be used interchangeably with round pegs.

## Contents

- `RoundHole.java`: Represents a round hole with a certain radius.
- `RoundPeg.java`: Defines an interface for round pegs.
- `SquarePegAdapter.java`: Adapts the SquarePeg class to fit the RoundPeg interface.
- `HexagonPegAdapter.java`: Adapts the HexagonPeg class to fit the RoundPeg interface.
- `HexagonPeg.java`: Represents a hexagon peg with a certain side length.
- `Main.java`: Contains the main method to demonstrate the functionality of the adapter classes.

## Usage

To run the example, simply compile and execute the `Main.java` file. It will demonstrate how square and hexagon pegs can be adapted to fit into a round hole using adapter classes.

```bash
javac Main.java
java Main
```

## Development

If you'd like to contribute to this project, feel free to fork the repository and submit a pull request with your changes. Make sure to follow the existing coding style and conventions.

```
