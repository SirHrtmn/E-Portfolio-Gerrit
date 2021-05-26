/*
 * Main.java
 *
 * created at 2021-05-21 by n.hartmann n.hartmann@seeburger.de
 * 
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package main;


public class Main
{

    public static void main(String[] args)
    {
        System.out.println(getExampleString());
    }

    public static String getExampleString()
    { // This is an obsolete commend
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.append("!");
        return sb.toString();
    }

}



