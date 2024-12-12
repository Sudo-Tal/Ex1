# Ex1 - Foundation of Functional Programming & Testing - Ariel University - Intro2CS

## Welcome to the Ex1 Assignment Repository!

Welcome to the official repository for the "Ex1 - Foundation of Functional Programming & Testing" assignment from The Ariel University's School of Computer Science.

In this project, I have designed a number formatting converter and calculator based on Java, whose purpose is to handle numerical computations represented as strings in different bases (covering binary to hexadecimal). The solution includes three classes, an **Ex1Main** for the main flow direction of the program, an **Ex1** for the methods programmed to convert any base in range to decimal and any decimal number to a different number in a specified base (formatted as a string) and validity checks for user input.

The Repository also contains **Ex1Tests**, a Class for JUnit testing various edge case scenarios in the program's methods. While not pertinent to the program's operations, it is included per the assignment instructions.

## Operation Description

The user must answer three prompts:

**The First** being the first number to input into the calculator, the number can be in any base from 2-16 so long as the user specifies as a string (Examples Below).

**The Second** is the second number to input into the calculator.
Between these two numbers a Sum and a Product will be calculated and produced.

**The Third** is the base which the answers will be formatted to, the base must be a decimal number from 2-16.

Notes:
**Decimal numbers are accepted with no base specified.
**In the results, the base will be represented by its corresponding Hexadecimal Letter.
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

## Results
The results will show the sum of the two numbers provided along with their product.
They will also show the largest number between the numbers inputted, the sum and the product.

## Examples
**Here are two examples of an interaction:**

Ex1 class solution: <br />
Enter a string as number#1 (or "quit" to end the program):<br />
15b7<br />
num1= 15b7 is number: true , value: 12<br />
Enter a string as number#2 (or "quit" to end the program):<br />
23b4<br />
num2= 23b4 is number: true , value: 11<br />
Enter a base for output: (a number [2,16]<br />
2<br />
15b7 + 23b4 = 10111b2<br />
15b7 * 23b4 = 10000100b2<br />
Max number over [15b7,23b4,10111b2,10000100b2] is: 10000100b2<br />

*Ex1 class solution:<br />
Enter a string as number#1 (or "quit" to end the program):<br />
1011011b2<br />
num1= 1011011b2 is number: true , value: 91<br />
Enter a string as number#2 (or "quit" to end the program):<br />
1011b2<br />
num2= 1011b2 is number: true , value: 11<br />
Enter a base for output: (a number [2,16]<br />
4<br />
1011011b2 + 1011b2 = 1212b4<br />
1011011b2 * 1011b2 = 33221b4<br />
Max number over [1011011b2,1011b2,1212b4,33221b4] is: 33221b4*<br />

## FlowChart

Below is a Flowchart of the program operations during an interaction:

![](https://mermaid.ink/img/pako:eNp9k1tz2jAQRv-KqmeTAQe7xDNtp-GSG0kgEDqN4UHYAjS1JSrLuRH-e9eLAJek5cma_fbs8RqtaKRiTgM6S9RTtGDakGFrLAn8vocDA-cJqVS-ktPwQgojWCJeORlETEquCZMxGTEt2DTh2WTTdYrx1mpMZZ7WyKcv5HcuzJiuN-VWUX67UW_kIexDgfS0mmuWTsrlnzx7I-2wueDRLwIY11bbyO5s2O47duf_7M6efRZCKV0aMlO6GFCzkTMccG4nixnWiMgII4_w6nFxnnJt0-e7eRfAE9KQttYAPIBeIPSs3IMSl7YJZ8TcMJFsl3iJLVcHlts1XGG1-5el-0_L7s7y-iPLLfS6bNndW97sLd0DyxtsuS1bnrKMkyk3T5xL4lZqvo3eYrS3wjqYouc3-916O8P-O0MhN680hUbL6pdNe3vTu7Cp5CPXdqPFnxOljQKK4XOut-J3SBiETZZEecIMJ1meYsNSqziPjM0NMDfccQ9SBTkzIDxHvZgoScyCl12HSLgPOwLaUvZsPw2ZwcpQ00FHp0A7HxjcY__IrgVDNrBJF0hYUL6dNyrv5gEPP8I2BPdXgTo05TplIoZbvyqSYwrWKR_TAB5jPmN5ApdqLNcQZblRgxcZ0cDonDtUq3y-oMGMJRmc8mUM22sJVrC3kSWTD0qluxCcabCizzQ49v0j3_e8WrXq-vUTr1p36AsNat7J0XHDr7le3fX8xrHrrR36iojq0UmjAenP1Wq97rv--g8kJ3Js?type=png)