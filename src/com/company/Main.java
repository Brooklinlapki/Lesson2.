package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        a();
        a();
        a();
        a();
        a();
    }
    public static void a(){
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        System.out.println(applyAgeAndTemperature(generateRandomAge(),temperature));
        System.out.println("Температура на улице: " + temperature);
    }

    public static String applyAgeAndTemperature (int age, int temp){
        if (age > 20 && age < 45 && temp > -20 && temp < 30){
            return "Можно идти гулять";
        }else if (age < 20 && temp > 0 && temp < 28){
            return "Можно идти гулять";
        }else if (age > 45 && temp > -10 && temp < 25){
            return "Можно идти гулять";
        }else {
        return "Stay at home";
        }
    }
    public static int generateRandomAge(){
        Random random = new Random();
        int ageRandom = random.nextInt(100);
        System.out.println("Random age of person: " + ageRandom);
        return ageRandom;
    }
}
