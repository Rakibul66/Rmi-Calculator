# Rmi-Calculator
Simple java rmi calculator with client server 
Compilation and Running Instructions:<br/>
Compiling the code:<br/>
Use javac to compile all 4 programs.<br/>
 > javac Calculator.java<br/>
 > javac CalculatorImpl.java<br/>
 > javac CalculatorServer.java<br/>
 > javac CalculatorClient.java
 <br/>
 Now use rmic to create the stub and skeleton class files.<br/>
 > rmic CalculatorImpl
 <br/>
Running the RMI System
<br/>
Start with the Registry. You must be in the directory that contains the classes you have written. From there, enter the following:
<br/>
 > rmiregistry
If all goes well, the registry will start running and you can switch to the next console.

In the second console start the server hosting the CalculatorService, and enter the following:
<br/>
 > java CalculatorServer
It will start, load the implementation into memory and wait for a client connection.

In the last console, start the client program.
<br/>
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
