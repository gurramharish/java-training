package com.hans;

/**
 * Hello world!
 *
 */
public class App 
{

    String name;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int age = 20;

        String firstName;

        int _rpm = 1000;
        int rpm = 100;

        int rotationPerMinute = 100;

        firstName = "20";
        double percentage = 10.2d;
        float average = 70.88f;
        firstName = "Jagadhish";

        System.out.println("Name :: " + firstName);
        checkName(firstName);


        byte verySmallNumber = 20;
        byte _smallNumber = (byte) 300;
        int number = 20;
        byte intToByte = (byte) number;
        System.out.println("Int to Byte :: " + intToByte);
        System.out.println("Small Number :: " + _smallNumber);

        char active = 'Y';

        String activeStatus = "Y";

        boolean isActive = active == 'Y';
        System.out.println("Is Active : " + isActive);
        long veryLargeNumber = 1212121212121212121L;
        Long minLong = Long.MIN_VALUE;
        Long maxLong = Long.MAX_VALUE;
        System.out.println("Min : " + minLong);
        System.out.println("Max : " + maxLong);

        String personName = "Harish Kumar";
        int myAge = 32;


    }

    public static String getName() {
        return "Harish Kumar";
    }

    public static void checkName(String name) {
        System.out.println("Check Name " + name);
    }
}
