package com.Robert;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the quantity of wine (dl) available in the pub");
        int wineQuantity = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the quantity of soda (dl) available in the pub");
        int sodaQuantity = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the size of the desired drink (dl)");
        double drinkSize = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Please enter the quantity of soda (dl) in the desired drink");
        double soda = scanner.nextDouble();
        scanner.nextLine();

        double wine = drinkSize - soda;

        System.out.println("Please enter the age (in years) of the person ordering the drink");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the quantity of money the person ordering the drink has");
        double funds = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Please enter the quantity of alcohol the person ordering the drink has already drunk (ml)");
        double consumed = scanner.nextDouble();

        Pub pub = new Pub(wineQuantity, sodaQuantity);
        Drink drink = new Drink(drinkSize, soda);
        Person person = new Person(age, funds, consumed);

        try {
            pub.serveDrinkToPerson(person, drink);
            System.out.println("You have ordered: \n" +
                    drink.toString() + "\nCheers! Enjoy your stay !");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("*********************************************************************");

        File borkimeres = new File("borkimeres.txt");
        String[] variousDrinks = new String[2];
//        Drink[] ourDrinks = new Drink[7];
        List<Drink> availableDrinks = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(borkimeres))) {
            String st;
//            int count = 0;
            while ((st = br.readLine()) != null) {
                variousDrinks = st.split(",");
                double drink_Size = Double.parseDouble(variousDrinks[0]);
                double sodaInDrink = Double.parseDouble(variousDrinks[1]);
//                double wineInDrink = drink_Size - sodaInDrink;
                availableDrinks.add(new Drink(drink_Size, sodaInDrink));
//                ourDrinks[count] = new Drink(drink_Size, sodaInDrink);
//                count++;
            }
        } catch (IOException e) {
            System.out.println("reading file failed" + e.getMessage());
        }

        Drink[] ourDrinks = availableDrinks.toArray(new Drink[0]);

        System.out.println("Details of the drink with lowest alcohol content:\n" +
                Utils.getDrinkWithLowestAlcoholContent(ourDrinks).toString());

    }
}
