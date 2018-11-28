package com.Sachin.ownPackage;

public class ScopeCheck {
    public int publicVar=0;
    private int privateVar=1;

    /***
     * Checking on how scope works!
     * *****/
    
    public ScopeCheck(){
        System.out.println("scope created public Variable:"+ publicVar+" ScopeChecked " +
                "private Variable "+ privateVar);
    }
    public int getPrivateVar(){
        return privateVar;
    }

}
