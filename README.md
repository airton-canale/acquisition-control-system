<p align="center">
<img margin-left= "300px" src="./image.jpeg" alt="Banner">
</p>  
<h1 align="center"><strong></strong></h1>
<h1 align="center"><strong>Acquisition Control System</strong></h1>
<br>
<p align="center">
  <a href="#-project">Project</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#installation">Installation</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-technologies">Technologies</a>
  &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;

## 💻 Project

This project is a simple acquisition control system for a company. The system allows employees to register purchase orders and administrators to view those orders. It simulates a work environment with multiple departments and purchase limits.

The application is developed in Java, without using any external frameworks or libraries. All data is stored in memory during runtime.

Features
User switching: The system allows switching between registered users.
Purchase order registration: Only employees can register new orders for their associated department.
Order listing: All registered orders can be viewed, displaying details such as the employee’s name and the requesting department.
Order limit control: Purchase orders are verified against the department's maximum allowed limits.
Predefined data initialization: The system starts with a set of predefined users, departments, and order limits for easier testing.
Project Structure
The system is divided into the following main classes:

App: The main class that starts the system and calls the SistemaAquisicoes class.
SistemaAquisicoes: Manages the main system logic, such as user switching, registering, and listing orders.
Usuario: Represents a system user (either employee or administrator).
Departamento: Defines departments and their purchase limits.
Item: Represents an item within a purchase order.
Pedido: Manages the orders made by an employee, containing a list of items.
Requirements
Java 8 or higher.
IDE/Compiler: Any IDE supporting Java can be used to run the project, such as IntelliJ IDEA, Eclipse, or NetBeans.
How to Run
Clone the repository or download the project files.
Compile the code using your IDE or terminal (if using the terminal, navigate to the root folder and use the command javac *.java).
Run the App class to start the system.
Step-by-Step Usage:
The system starts with predefined user and department data.
The first step is to select a user to perform operations.
After that, the user can:
Register a new purchase order (only employees can register orders).
List all registered orders.
Switch users.
Exit the system.
During the order registration process, the system will ask for the description, unit price, and quantity of the items. The total will be calculated and checked against the department's maximum allowed value. If accepted, the order will be registered.
Example Usage
Main Menu:
sql
Copiar código
--- Acquisition System ---
Current user: João Silva
1. Select user
2. Register order
3. List orders
0. Exit
   Choose an option:
   Registering an Order:
   sql
   Copiar código
   Register new order for user João Silva
   Item description: Computer
   Unit price of the item: 3500
   Quantity: 2
   Add more items? (y/n): n
   Order successfully registered.
   Listing Orders:
   sql
   Copiar código
   --- Registered Orders ---
   Order from João Silva for the Finance department
   Predefined Data
   Users:

João Silva (Admin)
Maria Souza (Employee)
Carlos Santos (Employee)
Ana Lima (Admin)
Paulo Henrique (Employee)
Departments and limits:

Finance: $10,000
HR: $8,000
Engineering: $15,000
Maintenance: $5,000
Sales: $7,000
File Structure
bash
Copiar código
/src
├── App.java
├── SistemaAquisicoes.java
├── Usuario.java
├── Departamento.java
├── Item.java
└── Pedido.java
Contributions
Contributions are welcome! Feel free to open issues or submit pull requests.

License
This project is public domain and does not have a specific license.


## Installation

- Important: You must have installed the Java and Git

bash
# clone it
$ git clone git@github.com:airton-canale/acquisition-control-system.git

$ cd acquisition-control-system

# Running scripts
$ java App.java

## 🚀 Technologies

This project was developed using the following technologies:

- <img height="30" src="https://raw.githubusercontent.com/github/explore/80688e429a7d4ef2fca1e82350fe8e3517d3494d/topics/java/java.png"> *Java*