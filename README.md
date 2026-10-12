<div align="center">

# CSE272 Programming 2

### Object-Oriented Java Labs and Design-Pattern Projects

[![Java](https://img.shields.io/badge/Java-Object--Oriented%20Programming-ED8B00?logo=openjdk&logoColor=white)](https://www.java.com/)

</div>

## Overview

This repository archives laboratory work for CSE272, covering Java object-oriented programming, GUI applications, and software-design patterns. It includes a larger final game project alongside focused weekly labs.

## Contents

```text
.
├── Lab1 ... Lab9       # Java programming exercises and design-pattern labs
└── Final_Lab/          # Circus-style Java game project
    └── src/final_lab/  # Game, level, shape, observer, iterator, and factory classes
```

The final project includes game entities such as clowns, plates, cups, and bombs, with classes implementing patterns including factory, observer, iterator, and state-oriented level handling.

## Running a Lab

Projects were created with NetBeans. Open the desired lab folder as a NetBeans project, then run its configured main class.

For command-line work, compile from the relevant source directory. For example:

```bash
javac -d out src/final_lab/*.java
java -cp out final_lab.MainWindow
```

Some labs have external resources or IDE configuration files, so NetBeans is the most convenient way to open the complete project.

## Author

**Youssef Mohamed Attia**  
[GitHub](https://github.com/YoussefMohAttia) · [LinkedIn](https://www.linkedin.com/in/youssefmohattia/)
