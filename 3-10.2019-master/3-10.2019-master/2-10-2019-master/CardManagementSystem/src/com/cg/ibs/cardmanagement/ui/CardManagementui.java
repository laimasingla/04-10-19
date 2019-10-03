
  
package com.cg.ibs.cardmanagement.ui;

import java.util.*;

import com.cg.ibs.cardmanagement.service.CustomerServiceImpl;
import com.sun.xml.internal.ws.api.pipe.NextAction;

import java.io.*;
import java.math.BigInteger;

enum CardMenu{

 APPLY,UPGRADE,RESET,QUIT

}

public class CardManagementui

{

    

    

    

    public static void main(String args []){
    	Scanner scan=new Scanner(System.in);
        CardManagementui obj = new CardManagementui();
       
        BigInteger accountNumber;
       

         CustomerServiceImpl  customService=new CustomerServiceImpl();
         System.out.println("hfhgh");
         accountNumber= scan.nextBigInteger();
         customService.applyNewDebitCard(accountNumber);
    

       }}
        

        

      


