import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        System.out.println("We are in the middle of updating our menu. We currently  have 3 cupcakes but need to decide pricing");
        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description");

        cupcake.type();

        System.out.println("How much would you like to charge for the cupcake? Input a numerical number take to 2 decimal places");

        String priceText = input.nextLine();

        double price = Double.parseDouble(priceText);

        cupcake.setPrice(price);

        System.out.println("We are deiciding on the price of the red velvet cupcake. Here is the description");

        redVelvet.type();

        System.out.println("How much would you like to charge for the cupcake? Input a numerical number take to 2 decimal places");

        String priceText2 = input.nextLine();

        double price2 = Double.parseDouble(priceText2);

        redVelvet.setPrice(price2);

        System.out.println("We are deciding on the price of the chocolate cupcake. Here is the description");

        chocolate.type();

        System.out.println("How much would you like to charge?");

        String priceText3 = input.nextLine();

        double price3 = Double.parseDouble(priceText3);

        chocolate.setPrice(price3);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        System.out.println(cupcakeMenu);

        ArrayList<Drink> drinkMenu= new ArrayList<Drink>();
        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("How much do you want to charge for water?");

        String waterPrice = input.nextLine();

        double waterPriceDbl = Double.parseDouble(waterPrice);

        water.setPrice(waterPriceDbl);

        System.out.println("How much do you want to charge for soda?");

        String sodaPrice = input.nextLine();

        double sodaPriceDbl = Double.parseDouble(sodaPrice);

        soda.setPrice(sodaPriceDbl);

        System.out.println("How much do you want to charge for milk?");

        String milkPrice = input.nextLine();

        double milkPriceDbl = Double.parseDouble(milkPrice);

        milk.setPrice(milkPriceDbl);

        drinkMenu.add(soda);

        drinkMenu.add(milk);

        drinkMenu.add(water);

        new Order(cupcakeMenu, drinkMenu);

        new CreateFile();

        new WriteToFile(order);
    }
    }