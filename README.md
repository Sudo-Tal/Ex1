# Ex1 - Foundation of Functional Programming & Testing - Ariel University Intro2CS -- Solution

## Welcome to my Ex1 Assignment Solution Repository!

Welcome to the official repository for the "Ex1 - Foundation of Functional Programming & Testing" assignment from The Ariel University's School of Computer Science.

In this project, I have designed a number formatting converter and calculator based on Java, whose purpose is to handle numerical computations represented as strings in different bases (covering binary to hexadecimal). The solution includes three classes, an **Ex1Main** for the main flow direction of the program, an **Ex1** for the methods programmed to convert any base in range to decimal and any decimal number to a different number in a specified base (formatted as a string) and validity checks for user input.

The Repository also contains **Ex1Tests**, a Class for JUnit testing various edge case scenarios in the program's methods. While not pertinent to the program's operations, it is included per the assignment instructions.

## How to Use

1. **Enter First Number**:  
   Referred to as *"num1"* should be in the format of:

*Number+b+Base*

`Example: "135b10", "100111b2"`

Note: Make sure your inputted number is legal for the specified base, or it will be marked as an illegal entry.

2. **Enter Second Number**:  
   Same as Step 1, Referred to as *"num2"*

3. **Enter Base**:  
   Should be a decimal number ranging between 2-16.

**Exit the program**:  
If at any point you wish to quit the program, Type `quit` when prompted for a number and the Program will exit.


## Examples
**Here are two examples of an interaction:**

*Ex1 class solution:\
Enter a string as number#1 (or "quit" to end the program):\
15b7\
num1= 15b7 is number: true , value: 12\
Enter a string as number#2 (or "quit" to end the program):\
23b4\
num2= 23b4 is number: true , value: 11\
Enter a base for output: (a number [2,16]\
2\
15b7 + 23b4 = 10111b2\
15b7 * 23b4 = 10000100b2\
Max number over [15b7,23b4,10111b2,10000100b2] is: 10000100b2*

*Ex1 class solution:\
Enter a string as number#1 (or "quit" to end the program):\
1011011b2\
num1= 1011011b2 is number: true , value: 91\
Enter a string as number#2 (or "quit" to end the program):\
1011b2\
num2= 1011b2 is number: true , value: 11\
Enter a base for output: (a number [2,16]\
4\
1011011b2 + 1011b2 = 1212b4\
1011011b2 * 1011b2 = 33221b4\
Max number over [1011011b2,1011b2,1212b4,33221b4] is: 33221b4*