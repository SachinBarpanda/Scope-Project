package com.Sachin.ownPackage;

public class Main {

    public static void main(String[] args) {
        String privateVar ="THis private is in main()";

        ScopeCheck scope=new ScopeCheck();
        System.out.println("In class ScopeCheck the private variable "+scope.getVarOne());
        scope.useInnerClass();
        /**
         * Java knows which private variable belongs to whom
         * So the line below this will print privateVar of the main method
         * */

        System.out.println(privateVar);
        scope.timesTwo();

        System.out.println("**********************************");
        ScopeCheck.InnerClass innerscope=scope.new InnerClass();
        innerscope.timesTwo();
    }
}
