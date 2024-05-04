## Problem Scenario

The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other SOLID principles.

Make sure you have a TestProgram that will validate the proposed refactored codes.

## Class Diagram
![UML SOLID Principles](https://github.com/AeronRedCelajes/SOLIDwithDesignPattern/assets/142370807/c78ad724-8106-41d9-9c06-6fce41f1c849)
![UML SOLID Principles_upscayl_4x_ultramix_balanced](https://github.com/AeronRedCelajes/SOLIDwithDesignPattern/assets/142370807/cd245722-6e06-45bb-a872-95dc74aa055c)
