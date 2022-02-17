package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myFirstLastName = new String("Collin Wilkins");
        String lowerFirstLastName = new String("collin wilkins");
        String myFirstName = new String("Collin");
        String teammateFirstName = new String("Ehab");


        System.out.println(myFirstLastName.equals(lowerFirstLastName));
        System.out.println(myFirstLastName.equalsIgnoreCase(lowerFirstLastName));
        System.out.println(myFirstLastName.length());
        System.out.println(lowerFirstLastName.length());
        System.out.println(myFirstLastName.concat(lowerFirstLastName));
        System.out.println(myFirstLastName.charAt(3));
        System.out.println(myFirstName.compareTo(teammateFirstName)); //compares the distance between letters -2
        System.out.println(myFirstLastName.replace("i","z"));
        System.out.println(myFirstName.substring(4));
    }
}
