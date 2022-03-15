package com.harman.project1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Addition addobj=new Addition(); //obj creation
        Subtraction subobj=new Subtraction();
        Multiplication mulobj=new Multiplication();
        Division divobj =new Division();
        Modulo modobj=new Modulo();

        Integer x,y,addResult,subResult,mulResult,divResult,modResult;

        Scanner sc = new Scanner(System.in); //read input from the user
        System.out.println("Enter 1st number");
        x = sc.nextInt();
        System.out.print("Enter the 2nd number");
        y = sc.nextInt();

        addResult=addobj.Add2numbers(x,y);
        System.out.println("Addition"+addResult);

        subResult=subobj.Subtract2numbers(x,y);
        System.out.println("Subtraction"+subResult);

        mulResult=mulobj.Multiply2numbers(x,y);
        System.out.println("Multiplication"+mulResult);

        divResult=divobj.Div2numbers(x,y);
        System.out.println("Division"+divResult);

        modResult=modobj.Modulo2numbers(x,y);
        System.out.println("Modulo"+modResult);

    }
}
