/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.java_2022_hw_2;

/**
 *
 * @author ereng
 */
public class Java_2022_Hw_2 {

    public static void main(String[] args) {
        jl_23();
    }
    
//Java Lesson #no = jl_1
    
    public static void jl_5() {
        System.out.println("Hello World!");
        System.out.println("Hello Java");
        System.out.println("Hello Java 2");
    }
    
    public static void jl_6(){
        int studentCount = 11;
        String message = "Student Counter : ";
        
        System.out.println(message + studentCount);
    }
    
    public static void jl_7(){
        boolean isTrue = true;
        
        byte no_1 = 120;
        
        short no_2 = 32700;
        
        int no_3 = 2147483647;
        
        double no_4 = 2.2; 
        
        char ch = 'A';
        
        if(isTrue == true)
        {
            System.out.println(no_1 + "\n" + no_2 + "\n" + no_3 + "\n" + no_4 + "\n" + ch);
        }
    }
    
    public static void jl_8(){
        int number = 20;
        
        if(number < 20)
        {
            System.out.println("Number is smaller than 20");
        }
        else if(number == 20)
        {
            System.out.println("Number is 20");
        }
        else
        {
            System.out.println("Number is greater than 20");
        }
    }
    
    public static void jl_9(){
        int no_1, no_2, no_3;
        
        no_1 = 20;
        no_2 = 25;
        no_3 = 2;
        
        if(no_1 > no_2 && no_1 > no_3)
        {
            System.out.println(no_1 + " is the biggest number");
        }
        else if(no_2 > no_1 && no_2 > no_3)
        {
            System.out.println(no_2 + " is the biggest number");
        }
        else
        {
            System.out.println(no_3 + " is the biggest number");
        }
    }
    
    public static void jl_10(){
        char grade = 'A';
        
        switch(grade)
        {
            case 'A':
                System.out.println("Perfect : You Passed!");
                break;
            case 'B':
                System.out.println("Very Good : You Passed!");
                break;
            case 'C':
                System.out.println("Good : You Passed!");
                break;
            case 'D':
                System.out.println("Not Bad : You Passed!");
                break;
            case 'F':
                System.out.println("Unfortunately : You Failed!");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
    
    public static void jl_11(){
        for(int i = 1 ; i <= 10 ; i++)
        {
            System.out.println(i);
        }
        System.out.println("Loop is over\n\n\n");
        
        for(int i = 1 ; i <= 10 ; i+=2)
        {
            System.out.println(i);
        }
        System.out.println("Loop is over\n\n\n");
        
        for(int i = 0 ; i <= 10 ; i+=2)
        {
            System.out.println(i);
        }
        System.out.println("Loop is over");
    }
    
    public static void jl_12(){
        int i = 0;
        
        while(i <= 10)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("While loop is over");
    }
    
    public static void jl_13(){
        int i = 20;
        
        do
        {
            System.out.println(i);
            i += 2;
        }while(i <= 10);
        System.out.println("Do-While loop is over");
    }
    
    public static void jl_14(){
        String[]students = new String[3];
        students[0] = "Engin";
        students[1] = "Derin";
        students[2] = "Salih";
        
        for(int i = 0 ; i < students.length ; i++)
        {
            System.out.println(students[i]);
        }
    }
    
    public static void jl_15(){
        double[] myList = {1.2, 1.3, 1.4, 4.3, 5.6};
        double total = 0;
        double max = myList[0];
       
        for(double number : myList)
        {
            total = total + number;
            System.out.println(number);
            
            if(max < number)
            {
                max = number;
            }
        }
        System.out.println("Total =  " + total);
        System.out.println("Maximum = " + max);
    }
    
    public static void jl_16(){
        String[][] cities = new String[3][3];
        
        cities[0][0] = "İstanbul";
        cities[0][1] = "Bursa";
        cities[0][2] = "Bilecik";
        cities[1][0] = "Ankara";
        cities[1][1] = "Konya";
        cities[1][2] = "Kayseri";
        cities[2][0] = "Diyarbakır";
        cities[2][1] = "Şanlıurfa";
        cities[2][2] = "Gaziantep";
        
        for(int i = 0 ; i <= 2 ; i++)
        {
            System.out.println("----------------------");
            
            for(int j = 0 ; j <= 2 ; j++)
            {
                System.out.println(cities[i][j]);
            }
        }
    }
    
    public static void jl_17(){
        String message = "The weather is great today.";
        System.out.println(message);
        
        System.out.println("Element count : " + message.length());
        System.out.println("5th element : " + message.charAt(4));
        System.out.println(message.concat(" Yaaaay!"));
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("."));
        
        char[] characters = new char[5];
        
        message.getChars(0, 5, characters, 0);
        
        System.out.println(characters);
        System.out.println(message.indexOf("ea"));
        System.out.println(message.lastIndexOf("a"));
    }
    
    public static void jl_18(){
        String message = "The weather is great today.";
        System.out.println(message);
        
        String newMessage = message.replace(' ', '-');
        System.out.println(newMessage);
        System.out.println(message.substring(0, 2));
        
        for(String word : message.split(" "))
        {
            System.out.println(word);
        }
        
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
    
    public static void jl_19(){
        int number = 22;
        int remainder = number % 2;
        System.out.println(remainder);
        boolean isPrime = true;
        
        if(number == 1)
        {
            System.out.println("The number is not a prime number.");
            return;
        }
        
        if(number < 1)
        {
            System.out.println("Invalid input");
        }
        
        for(int i = 2 ; i < number ; i++)
        {
            if(number % i == 0)
            {
                isPrime = false;
            }
        }
        
        if(isPrime)
        {
           System.out.println("The number is a prime number.");
        }
        else
        {
            System.out.println("The number is not a prime number.");
        }
    }
    
    public static void jl_20(){
        char letter = 'A';
        
        switch(letter)
        {
            case 'Z':
            case 'B':
            case 'T':
            case 'G':
            case 'H':
                System.out.println("Consonant");
                break;
            default:
                System.out.println("Vowel");
        }
    }
    
    public static void jl_21(){
        int number = 28;
        int total = 0;
        
        for(int i = 1 ; i < number ; i++)
        {
            if(number % i == 0)
            {
                total = total + i;
            }
        }
        
        if(total == number)
        {
            System.out.println("Perfect number");
        }
        else
        {
            System.out.println("Not a perfect number");
        }
    }
    
    public static void jl_22(){
        int no_1 = 220;
        int no_2 = 284;
        int sum_1 = 0;
        int sum_2 = 0;
        
        for(int i = 1 ; i < no_1 ; i++)
        {
            if(no_1 % i == 0)
            {
                sum_1 = sum_1 + i;
            }
        }
        
        for(int i = 1 ; i < no_2 ; i++)
        {
            if(no_2 % i == 0)
            {
                sum_2 = sum_2 + i;
            }
        }
        
        if(no_1 == sum_2 && no_2 == sum_1)
        {
            System.out.println("Two numbers are friend numbers");
        }
        else
        {
            System.out.println("Two numbers are not friend numbers");
        }
    }
    
    public static void jl_23(){
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int search = 5;
        boolean isThere = false;
        
        for(int number : numbers)
        {
            if(number == search)
            {
                isThere = true;
                break;
            }
        }
        
        if(isThere)
        {
            System.out.println("Number found");
        }
        else
        {
            System.out.println("Number not found");
        }
    }
}
