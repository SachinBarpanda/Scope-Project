package com.Sachin.ownPackage;

public class ScopeCheck {
    public int publicVar=0;
    private int varOne =1;//previously privateVar=1

    /**
     * Checking on how scope works!
     **/

    public ScopeCheck(){
        System.out.println("scope created public Variable:"+ publicVar+" ScopeChecked " +
                "private Variable "+ varOne);
    }
    public int getVarOne(){
        return varOne;
    }

    /**
     * Let's now check the scope of innerClass in the ScopeCheck class
     * */
    public void useInnerClass(){
        InnerClass innerC=new InnerClass();
        System.out.println("Value of the scope in the inner Class"+innerC.varThree);
    }


    /**
     * Let's now see the scope of the local variable in the methods
     * It can be change in the method
     * i is local to the loop it is running
     * */

    public void timesTwo(){
        int varTwo=2;//previously privateVar=1
        for(int i=0;i<10;i++){
            /**
             * this.privateVar is used for making the
             * variable call from the main declaration
             * */
            System.out.println(i + "times two is" + i* varTwo);
        }
    }
    /**
     * Let's see the scope of the inner class
     * the scope checks for inner class first then checks in the ScopeCheck class
     * */

    public class InnerClass{
        public int varThree =3;//previously privateVar=1
        public InnerClass(){
            System.out.println("InnerClass created,private Variable "+ varThree+" ScopeCheck class" +
                    "variable is "+varOne);
        }
        public void timesTwo(){

            for(int i=0;i<10;i++){
            System.out.println(i + "times two is" + i* varThree);
        }
    }
}}
