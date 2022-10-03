import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu){
        System.out.println("Hello Customer. Would you like to place an order? (Y or N");
        Scanner input = new Scanner(System.in);
        String placeOrder = input.nextLine();

        ArrayList<Object> order = new ArrayList<Object>();

        if (placeOrder.equalsIgnoreCase("Y")){
                order.add(LocalDate.now());
                order.add(LocalTime.now());

            System.out.println("Here is the menu:");
            System.out.println("CUPCAKES:");

            int itemNumber = 0;

            for(int i = 0; i < cupcakeMenu.size(); i++){
                itemNumber += 1;
                System.out.println(itemNumber);
                cupcakeMenu.get(i).type();
                System.out.println("PRICE: " + cupcakeMenu.get(i).getPrice());
            }
            for (int i = 0; i < drinkMenu.size(); i++) {
                System.out.println("DRINKS ");
                itemNumber += 1;
                System.out.println(itemNumber);
                drinkMenu.get(i).type();
                System.out.println("Price is " + drinkMenu.get(i).getPrice());

            }
        } else {
            System.out.println("Have a nice day then.");
        }
        boolean ordering = true;

        while(ordering == true){
            System.out.println("What would you like to order? Please use the number with each item to order");
            int orderChoice = input.nextInt();
            input.nextLine();

            if (orderChoice == 1){
                order.add(cupcakeMenu.get(0));
                System.out.println("item added to order");
            } else if (orderChoice == 2){
                order.add(cupcakeMenu.get(1));
                System.out.println("Item added to order");
            } else if (orderChoice == 3){
                order.add(cupcakeMenu.get(2));
            } else if (orderChoice == 4){
                order.add(drinkMenu.get(0));
            } else if (orderChoice == 5){
                order.add(drinkMenu.get(1));
            } else if (orderChoice == 6){
                order.add(drinkMenu.get(2));
            } else {
                System.out.println("Sorry that item number does not exist");
            }
            System.out.println("Would you like to continue ordering?");

            String continueOrder = input.nextLine();

            if (!continueOrder.equals("y")){
                ordering = false;
            }
        }
        System.out.println(order.get(0));
        System.out.println(order.get(1));

        double subTotal = 0.0;

        for(int i = 2; i < order.size(); i++){
            if(order.get(i) == cupcakeMenu.get(0)){
                cupcakeMenu.get(0).type();
                System.out.println(cupcakeMenu.get(0).getPrice());
                subTotal += cupcakeMenu.get(0).getPrice();

            } else if (order.get(i) == cupcakeMenu.get(1)){
                cupcakeMenu.get(1).type();
                System.out.println(cupcakeMenu.get(1).getPrice());
                subTotal += cupcakeMenu.get(1).getPrice();
            } else if (order.get(i) == cupcakeMenu.get(2)){
                cupcakeMenu.get(2).type();
                System.out.println(cupcakeMenu.get(2).getPrice());
                subTotal += cupcakeMenu.get(2).getPrice();
            } else if (order.get(i) == drinkMenu.get(0)){
                drinkMenu.get(0).type();
                System.out.println(drinkMenu.get(0).getPrice());
                subTotal += drinkMenu.get(0).getPrice();
            } else if (order.get(i) == drinkMenu.get(1)) {
                drinkMenu.get(1).type();
                System.out.println(drinkMenu.get(1).getPrice());
                subTotal += drinkMenu.get(1).getPrice();
            } else if (order.get(i) == drinkMenu.get(1)) {
                drinkMenu.get(1).type();
                System.out.println(drinkMenu.get(1).getPrice());
                subTotal += drinkMenu.get(1).getPrice();
            } else if (order.get(i) == drinkMenu.get(2)) {
                drinkMenu.get(2).type();
                System.out.println(drinkMenu.get(2).getPrice());
                subTotal += drinkMenu.get(2).getPrice();
            }}
        System.out.println(subTotal);
        }
    }




