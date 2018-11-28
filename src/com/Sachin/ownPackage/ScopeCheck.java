package com.Sachin.ownPackage;

public class ScopeCheck {
    public int publicVar=0;
    private int privateVar=1;

    /**
     * Checking on how scope works!
     **/

    public ScopeCheck(){
        System.out.println("scope created public Variable:"+ publicVar+" ScopeChecked " +
                "private Variable "+ privateVar);
    }
    public int getPrivateVar(){
        return privateVar;
    }

    /**
     * Let's now see the scope of the local variable in the methods
     * It can be change in the method
     * i is local to the loop it is running
     * */

    public void timesTwo(){
        int privateVar=2;
        for(int i=0;i<10;i++){
            /**
             * this.privateVar is used for making the
             * variable call from the main declaration
             * */
            System.out.println(i + "times two is" + i* privateVar);
        }
    }
    /**
     * Let's see the scope of the inner class
     * the scope checks for inner class first then checks in the ScopeCheck class
     * */

    public class InnerClass{
        public int privateVar=3;
        public InnerClass(){
            System.out.println("InnerClass created,private Variable"+ privateVar);
        }
        public void timesTwo(){

            for(int i=0;i<10;i++){
            System.out.println(i + "times two is" + i* privateVar);
        }
    }
}}
