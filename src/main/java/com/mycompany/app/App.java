/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

public class App {
    public static void main(String[] args) {

       
        double balance = 0;           
        boolean exit = false;        
        int transactionStep = 1;      
        double depositAmount = 500;  
        double withdrawAmount = 200;  

        System.out.println("Welcome to Smart Bank!");

        
        do {
            System.out.println("\n===== Banking Menu =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = transactionStep; 
            System.out.println("Auto-selected choice: " + choice);

            
            switch (choice) {
                case 1:
                    System.out.println("Auto-depositing: $" + depositAmount);
                    if (depositAmount <= 0) {
                        System.out.println("Invalid deposit amount. Skipping...");
                        continue; 
                    }
                    balance += depositAmount;
                    System.out.println("Deposited: $" + depositAmount);
                    transactionStep = 2; 
                    break;

                case 2: 
                    System.out.println("Auto-withdrawing: $" + withdrawAmount);
                    if (withdrawAmount <= 0) {
                        System.out.println("Invalid withdrawal amount. Skipping...");
                        continue;
                    }
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds. Skipping...");
                        continue;
                    }
                    balance -= withdrawAmount; 
                    System.out.println("Withdrawn: $" + withdrawAmount);
                    transactionStep = 3; 
                    break;

                case 3: 
                    System.out.println("Current Balance: $" + balance);
                    transactionStep = 4; 
                    break;

                case 4:
                    System.out.println("Thank you for using Smart Bank. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Unexpected error.");
            }

        } while (!exit);
    }
}

