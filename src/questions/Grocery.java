package questions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Grocery {


 /*
   Thinking that you are writing a market software, prepare a program that enters with the menu below,
   directs you to the relevant section, makes shopping, calculates the cart amount and keeps it in memory,
   and prints a receipt when you go to the cashier.

       ==================== GROCERY CASE PROGRAM ============================ ===========
    When you enter the first program, you will be greeted with a menu.
    options,
       1 Deli
       2 Meat & Seafood
       3 Beverages
       4 Dairy & eggs
       5 Fresh Produce
       6 receipt
       7 exit the system
    Let's set the Variables
    productName, productPrice, productQuantity, productCode, basket, total
  */



        static Scanner scanner = new Scanner(System.in);

        static String productName;

        static double productPrice;
        static double productQuantity;
        static int productCode;
        static String basket= "";
        static double total;
        static boolean additionalProduct = false;

        public static void main(String[] args) {
            loginscreen();
            {

            }

        }

        public static void loginscreen() {
            System.out.println("================= XYZ GROCERY =================");
            System.out.println("=================   WELCOME   =================");
            System.out.println("=================    MENU     =================");
            System.out.println("== Please select the aisles you want to shop ==");
            System.out.println(" 1- Deli\n 2- Meat & Seafood\n 3- Beverages\n 4- Dairy & eggs\n 5- Fresh Produce\n 6- Receipt\n 7- Exit The System");


            int choice = scanner.nextInt();
            if (choice < 1 || choice >8){
                System.out.println("Warning! You pressed an invalid key. Enter Again");
                loginscreen();
            }else {
                switch (choice){
                    case 1:
                        deli();
                        break;
                    case 2:
                        meatAndSeafood();
                        break;
                    case 3:
                        beverages();
                        break;
                    case 4:
                        dairyAndEggs();
                        break;
                    case 5:
                        freshProduce();
                        break;
                    case 6:
                        receipt();
                        break;
                    case 7:
                        exitTheSystem();
                        break;
                    default:
                }
            }

        }



        public static void deli() {
            System.out.println("Welcome to the Deli aisle.");
            System.out.println("Please enter the item code you want to buy.\n11- Sliced Cheese 7.62$\n12- Salami 8.77$\n13- Pepperoni 2.58$\n14- Sliced Meat 10.72$\n15- Bologna 2.76$");
            while (!additionalProduct){
                productCode = scanner.nextInt();
                if (productCode >= 11 && productCode <=15 ){
                    System.out.println("How many kg will you get?");
                    productQuantity =scanner.nextInt();
                    switch (productCode){
                        case 11:
                            productName ="Sliced Cheese";
                            productPrice =7.62;
                            break;
                        case 12:
                            productName ="Salami";
                            productPrice =8.77;
                            break;
                        case 13:
                            productName ="Pepperoni";
                            productPrice =2.58;
                            break;
                        case 14:
                            productName ="Sliced Meat";
                            productPrice =10.72;
                            break;
                        case 15:
                            productName ="Bologna";
                            productPrice =2.76;
                            break;
                    }
                    System.out.println(productQuantity + " kg " + productName + ":" + (productPrice*productQuantity) + "$");
                    productPrice=productQuantity*productPrice;
                    total+=productPrice;
                    System.out.println("Basket Amount: " + total+"$");
                    basket+=productName + " :" + productPrice +"$\n";
                    System.out.println("If you want to add another product, enter the product code.\nPress 0 to return to the Main Menu.");
                } else if (productCode == 0) {
                    loginscreen();
                }
            }
        }

        public static void meatAndSeafood() {
            System.out.println("Welcome to the Meat and Seafood aisle.");
            System.out.println("Please enter the item code you want to buy.\n21- Fat Ground Beef 6.97$ \n22- Fresh Beef 26.46$\n23- Salmon 21.03$\n24- Shrimp 5.84$\n25- Chicken 15.18$");
            while (!additionalProduct){
                productCode = scanner.nextInt();
                if (productCode >= 21 && productCode <= 25){
                    System.out.println("How many kg will you get?");
                    productQuantity =scanner.nextInt();
                    switch (productCode){
                        case 21:
                            productName="Fat Ground Beef";
                            productPrice= 6.97;
                            break;
                        case 22:
                            productName="Fresh Beef";
                            productPrice= 26.46;
                            break;
                        case 23:
                            productName="Salmon";
                            productPrice= 21.03;
                            break;
                        case 24:
                            productName="Shrimp";
                            productPrice= 5.84;
                            break;
                        case 25:
                            productName="Chicken";
                            productPrice= 15.18;
                            break;
                    }
                    System.out.println(productQuantity + " kg " + productName + ":" + (productPrice*productQuantity) + "$");
                    productPrice=productQuantity*productPrice;
                    total+=productPrice;
                    System.out.println("Basket Amount: " + total+"$");
                    basket+=productName + " :" + productPrice +"$\n";
                    System.out.println("If you want to add another product, enter the product code.\nPress 0 to return to the Main Menu.");
                } else if (productCode == 0) {
                    loginscreen();

                }

            }

        }

        public static void beverages() {
            System.out.println("Welcome to the Beverages aisle.");
            System.out.println("Please enter the item code you want to buy.\n31- Water 2.98$\n32- Orange Juice 2.73$ \n33- Apple Juice 2.63$\n34- Energy Drink 10.48$\n35- Sports Drink 6.48$");
            while (!additionalProduct){
                productCode = scanner.nextInt();
                if (productCode >= 31 && productCode <= 35){
                    System.out.println("How many kg will you get?");
                    productQuantity =scanner.nextInt();
                    switch (productCode){
                        case 31:
                            productName="Water";
                            productPrice= 2.98;
                            break;
                        case 32:
                            productName="Orange Juice";
                            productPrice= 2.73;
                            break;
                        case 33:
                            productName="Apple Juice";
                            productPrice= 2.63;
                            break;
                        case 34:
                            productName="Energy Drink";
                            productPrice= 10.48;
                            break;
                        case 35:
                            productName="Sports Drink";
                            productPrice= 6.48;
                            break;
                    }
                    System.out.println(productQuantity + " kg " + productName + ":" + (productPrice*productQuantity) + "$");
                    productPrice=productQuantity*productPrice;
                    total+=productPrice;
                    System.out.println("Basket Amount: " + total+"$");
                    basket+=productName + " :" + productPrice +"$\n";
                    System.out.println("If you want to add another product, enter the product code.\nPress 0 to return to the Main Menu.");
                } else if (productCode == 0) {
                    loginscreen();

                }
            }
        }

        public static void dairyAndEggs() {
            System.out.println("Welcome to the Dairy and Eggs aisle.");
            System.out.println("Please enter the item code you want to buy.\n41- Almond Milk 3.13$\n42- Whole Milk 3.13$ \n43- Vanilla Yogurt 1.58$\n44- Coffee Creamer 4.26$\n45- Organic Eggs 3.93$");
            while (!additionalProduct) {
                productCode = scanner.nextInt();
                if (productCode >= 41 && productCode <= 45) {
                    System.out.println("How many kg will you get?");
                    productQuantity = scanner.nextInt();
                    switch (productCode) {
                        case 41:
                            productName = "Almond Milk";
                            productPrice = 3.13;
                            break;
                        case 42:
                            productName = "Whole Milk";
                            productPrice = 3.13;
                            break;
                        case 43:
                            productName = "Vanilla Yogurt";
                            productPrice = 1.58;
                            break;
                        case 44:
                            productName = "Coffee Creamer";
                            productPrice = 4.26;
                            break;
                        case 45:
                            productName = "Organic Eggs";
                            productPrice = 3.93;
                            break;
                    }
                    System.out.println(productQuantity + " lb " + productName + ":" + (productPrice * productQuantity) + "$");
                    productPrice = productQuantity * productPrice;
                    total += productPrice;
                    System.out.println("Basket Amount: " + total+"$");
                    basket += productName + " :" + productPrice + "$\n";
                    System.out.println("If you want to add another product, enter the product code.\nPress 0 to return to the Main Menu.");
                } else if (productCode == 0) {
                    loginscreen();


                }
            }
        }
        public static void freshProduce() {
            System.out.println("Welcome to the Fresh Produce.");
            System.out.println("Please enter the item code you want to buy.\n51- Tomato 0.98$\n52- Peas 2.57$ \n53- Avocados 2.97$\n54- Grapes 3.57$\n55- Apple 1.57$");
            while (!additionalProduct){
                productCode = scanner.nextInt();
                if (productCode>=51 && productCode <=55){
                    System.out.println("How many kg will you get?");
                    productQuantity = scanner.nextInt();
                    switch (productCode){
                        case 51:
                            productName = "Tomato";
                            productPrice = 0.98;
                            break;
                        case 52:
                            productName = "Peas";
                            productPrice = 2.57;
                            break;
                        case 53:
                            productName = "Avocados";
                            productPrice = 2.97;
                            break;
                        case 54:
                            productName = "Grapes";
                            productPrice = 3.57;
                            break;
                        case 55:
                            productName = "Apple";
                            productPrice = 1.57;
                            break;
                    }
                    System.out.println(productQuantity + " kg " + productName + ": " + (productPrice * productQuantity) + "$");
                    productPrice = productQuantity * productPrice;
                    total += productPrice;
                    System.out.println("Basket Amount: " + total+"$");
                    basket += productName + " :" + productPrice + "$\n";
                    System.out.println("If you want to add another product, enter the product code.\nPress 0 to return to the Main Menu.");
                }else if (productCode == 0) {
                    loginscreen();

                }
            }
        }


        public static void receipt() {
            System.out.println("================= XYZ GROCERY =================");
            System.out.println("=========  Thank you for choosing us  =========");
            System.out.println("---------  Your Shopping Information  ---------");
            System.out.println(" \n \n");
            System.out.println("Your Shopping List\n"+basket);
            System.out.println(" ");
            System.out.println("Total amount: "+total);
            System.out.println(" \n \n");
            System.out.println("----------  We wish you a nice day  ----------");
            LocalDateTime currentTime=LocalDateTime.now();
            DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy HH.mm.ss");
            String newFormatDateTime=currentTime.format(formatter);
            System.out.println("New Time Format: "+ newFormatDateTime);
            System.out.println("Press 0 to return to the main menu. Press 7 to exit");
            if (productCode == 0){
                loginscreen();
            } else if (productCode == 7) {
                exitTheSystem();

            }
        }

        public static void exitTheSystem() {
            System.exit(0);

        }

    }





