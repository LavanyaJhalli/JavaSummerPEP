package day1;

import java.util.Scanner;

public class TableOfNum{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        
        System.out.println("Multiplication table of "+num);
        
        for(int i=1;i<=10;i++){
            
            System.out.println(num +" X "+ i + " = "+ (num*i));
        }
    }
}
