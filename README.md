# Rmi-Calculator
Simple java rmi calculator with client server 
Compilation and Running Instructions
Compiling the code
Use javac to compile all 4 programs.
 > javac Calculator.java
 > javac CalculatorImpl.java
 > javac CalculatorServer.java
 > javac CalculatorClient.java
 
 Now use rmic to create the stub and skeleton class files.
 > rmic CalculatorImpl
Running the RMI System

Start with the Registry. You must be in the directory that contains the classes you have written. From there, enter the following:

 > rmiregistry
If all goes well, the registry will start running and you can switch to the next console.

In the second console start the server hosting the CalculatorService, and enter the following:

 > java CalculatorServer
It will start, load the implementation into memory and wait for a client connection.

In the last console, start the client program.

 > java CalculatorClient
If all goes well you will see the following output:

# Figure 1

<img width="884" alt="complile" src="https://github.com/Rakibul66/Rmi-Calculator/blob/main/output/Capture1.PNG">


# Figure 2

<img width="884" alt="Question 1" src="https://github.com/Rakibul66/Rmi-Calculator/blob/main/output/Capture2.PNG">

# Figure 3

<img width="884" alt="Question 1" src="https://github.com/Rakibul66/Rmi-Calculator/blob/main/output/Capture3.PNG">
# Figure 4

<img width="884" alt="Question 1" src="https://github.com/Rakibul66/Rmi-Calculator/blob/main/output/Capture4.PNG">

<img width="884" alt="Question 1" src="https://github.com/Rakibul66/Rmi-Calculator/blob/main/output/Capture5.PNG">

<img width="884" alt="Question 1" src="https://github.com/Rakibul66/Rmi-Calculator/blob/main/output/Capture6.PNG">
