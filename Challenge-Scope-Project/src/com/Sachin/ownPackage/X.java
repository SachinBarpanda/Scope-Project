package com.Sachin.ownPackage;

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner x){
        System.out.println("Enter your number");
        this.x=x.nextInt();
    }
    public void x(){
        for(int x=0;x<12;x++){
            System.out.println("Times at the zone "+x+" is : "+2*x+"a.m");
        }
    }

}
