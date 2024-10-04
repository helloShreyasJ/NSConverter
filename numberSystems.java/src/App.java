import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println();

        //Setting up the scanner class
        Scanner sc = new Scanner(System.in);

        //initializing variables: input1: convert from & input2: convert to
        String cont = "";
        String from = "";
        String to = "";
        String input = "";

        //creating a while loop to repeat the code.
        while(true){
            //asking the user if they want to continue
            System.out.println("Welcome to the number system converter! Would you like to continue? y/n");
            cont = sc.nextLine();
            if(cont.equals("y")){
                System.out.println("Ok lets begin!");
                System.out.println();
            } else if(cont.equals("n")){
                System.out.println("\nBye bye!");
                break;
            }
            System.out.println("Convert from?");
            System.out.println("Enter d for decimal, b for binary, o for octal, h for hexadecimal. Enter e to end");
            from = sc.nextLine();
            if(!(from.equals("d")||from.equals("b")||from.equals("o")||from.equals("h"))){
                System.out.println("You've entered '" + from + "' please enter either d or b or o or h");
                from = sc.nextLine();
            }
            //creating a way to end the loop
            if(from.equals("e")){
                break;
            }

            System.out.println();

            System.out.println("Convert to?");
            System.out.println("Enter d for decimal, b for binary, o for octal, h for hexadecimal");
            to = sc.nextLine();
            if(!(to.equals("d")||to.equals("b")||to.equals("o")||to.equals("h"))){
                System.out.println("You've entered '" + to + "' please enter either d or b or o or h");
                to = sc.nextLine();
            }

            System.out.println();

            System.out.print("Input your value: ");
            input = sc.nextLine();

            
            //setting up all possible outcomes of conversion
            
            //If the user wants to TRY converting between the same number systems
            if((from.equals("d")&&to.equals("d"))||(from.equals("b")&&to.equals("b"))||(from.equals("o")&&to.equals("o"))||(from.equals("h")&&to.equals("h"))){
                System.out.print(".");
                //I've used the sleep method from thread class to add some humor
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
                System.out.print(" .");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
                System.out.print(" .");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }

                System.out.print(" You ");
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
                System.out.print( "REALLY");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
                System.out.print(" want to convert between");
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
                System.out.print(" the same number system?");
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
                System.out.println();
                System.out.println();
                System.out.println("The answer is " + input + "\n");

            
            //All other conversion outcomes    
            }
            if(from.equals("d") && to.equals("b")){
                int decimal = Integer.valueOf(input);
                dtob(decimal);
                System.out.println();
            }
            if(from.equals("d") && to.equals("o")){
                int decimal = Integer.valueOf(input);
                dtoo(decimal);
                System.out.println();
            }
            if(from.equals("d") && to.equals("h")){
                int decimal = Integer.valueOf(input);
                dtoh(decimal);
                System.out.println();
            }
            if(from.equals("b") && to.equals("d")){
                int binary = Integer.valueOf(input);
                btod(binary);
                System.out.println();
            }
            if(from.equals("b") && to.equals("o")){
                int binary = Integer.valueOf(input);
                btoo(binary);
                System.out.println();
            }
            if(from.equals("b") && to.equals("h")){
                int binary = Integer.valueOf(input);
                btoh(binary);
                System.out.println();
            }
            if(from.equals("o") && to.equals("d")){
                int octal = Integer.valueOf(input);
                otod(octal);
                System.out.println();
            }
            if(from.equals("o") && to.equals("b")){
                int octal = Integer.valueOf(input);
                otob(octal);
                System.out.println();
            }
            if(from.equals("o") && to.equals("h")){
                int octal = Integer.valueOf(input);
                otoh(octal);
                System.out.println();
            }
            if(from.equals("h") && to.equals("d")){
                String hexadecimal = input;
                htod(hexadecimal);
                System.out.println();
            }
            if(from.equals("h") && to.equals("b")){
                String hexadecimal = input;
                htob(hexadecimal);
                System.out.println();
            }
            if(from.equals("h") && to.equals("o")){
                String hexadecimal = input;
                htoo(hexadecimal);
                System.out.println();
            }


        }
        sc.close();
    }

    public static void dtob(int decimal){
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            //append means to add something to the end of the string
            //in this case we are adding the remainder of the decimal when its divided by 2
            binary.append(decimal%2);
            //here we implement the functionality of decimal = decimal / 2 to get the remainder of 
            //the number when the decimal gets divided by 2, we repeat this until the decimal is greater than 0

            decimal/=2;
        }
        System.out.println("Conversion of given decimal to binary is " + binary.reverse());        
    }

    //now similarly we can implement different methods like this

    public static void dtoo(int decimal){
        StringBuilder octal = new StringBuilder();
        while(decimal>0){
            
            octal.append(decimal%8);
            decimal /= 8;
        }
        System.out.println("Conversion of given decimal to octal is " + octal.reverse()); 
    }
    
    public static void dtoh(int decimal){
        StringBuilder hexadecimal = new StringBuilder();
        while(decimal>0){
            int remainder = decimal%16;
            if(remainder<10){
                hexadecimal.append(remainder);
            } else if(remainder == 10){
                hexadecimal.append("A");
            } else if(remainder == 11){
                hexadecimal.append("B");
            } else if(remainder == 12){
                hexadecimal.append("C");
            } else if(remainder == 13){
                hexadecimal.append("D");
            } else if(remainder == 14){
                hexadecimal.append("E");
            } else if(remainder == 15){
                hexadecimal.append("F");
            }
                decimal /=16;
            }
        System.out.println("Conversion of given decimal to hexadecimal is " + hexadecimal.reverse()); 
    }

    public static void btod(int binary){
        int decimal = 0;
        int exponent = 0;
        while(binary>0){
            //here, in order to find the last digit we find the remainder of the binary when we divide it by 10
            //further in the code the binary gets divided by 10. we're cycling through all the digits here until binary
            //is just greater than 0. We shift the binary to the right by one digit going from least significant digit
            // to most significant digit
            int lastDigit = binary%10;
            decimal += lastDigit * Math.pow(2,exponent);
            binary /= 10;
            exponent++;
        }
        System.out.println("Conversion of given binary to decimal is " + decimal);
    }

    public static void btoo(int binary){
        StringBuilder octal = new StringBuilder();

        int decimal = 0;
        int exponent = 0;
        while(binary>0){
            int lastDigit = binary%10;
            decimal += lastDigit * Math.pow(2,exponent);
            binary /= 10;
            exponent++;

            
        }
        while(decimal>0){
                octal.append(decimal%8);
                decimal /=8;
        }
        System.out.println("Conversion of given binary to octal is " + octal.reverse()); 
    }

    public static void btoh(int binary){
        StringBuilder hexadecimal = new StringBuilder();
        int decimal = 0;
        int exponent = 0;

        while(binary>0){
            int lastDigit = binary%10;
            decimal += lastDigit * Math.pow(2,exponent);
            binary /= 10;
            exponent++;
        }

        while(decimal>0){
            int remainder = decimal%16;
            if(remainder<10){
                hexadecimal.append(remainder);
            } else if(remainder == 10){
                hexadecimal.append("A");
            } else if(remainder == 11){
                hexadecimal.append("B");
            } else if(remainder == 12){
                hexadecimal.append("C");
            } else if(remainder == 13){
                hexadecimal.append("D");
            } else if(remainder == 14){
                hexadecimal.append("E");
            } else if(remainder == 15){
                hexadecimal.append("F");
            }
            decimal /=16;
        }
        System.out.println("Conversion of given binary to hexadecimal is " + hexadecimal.reverse()); 
    }

    public static void otod(int octal){
        int decimal = 0;
        int exponent = 0;
            
        while(octal>0){
            
            int lastDigit = octal % 10;
            decimal += lastDigit * Math.pow(8,exponent);
            octal /= 10;
            exponent++;
        }
        System.out.println("Conversion of given octal to decimal is " + decimal);
    }

    public static void otob(int octal){
        StringBuilder binary = new StringBuilder();
        int decimal = 0;
        int exponent = 0;

        while(octal > 0){
            int lastDigit = octal%10;
            decimal += lastDigit*Math.pow(8,exponent);
            octal /= 10;
            exponent++;

        }

        while(decimal>0){
            binary.append(decimal%2);
            decimal /= 2;
        }

        System.out.println("Conversion of given octal to binary is " + binary.reverse());
    }

    public static void otoh(int octal){
        StringBuilder hexadecimal = new StringBuilder();
        int decimal = 0;
        int exponent = 0;

        while(octal > 0){
            int lastDigit = octal%10;
            decimal += lastDigit*Math.pow(8,exponent);
            octal /= 10;
            exponent++;

        }
        while(decimal>0){
            int remainder = decimal%16;
            if(remainder<10){
                hexadecimal.append(remainder);
            } else if(remainder == 10){
                hexadecimal.append("A");
            } else if(remainder == 11){
                hexadecimal.append("B");
            } else if(remainder == 12){
                hexadecimal.append("C");
            } else if(remainder == 13){
                hexadecimal.append("D");
            } else if(remainder == 14){
                hexadecimal.append("E");
            } else if(remainder == 15){
                hexadecimal.append("F");
            }
            decimal /=16;
        } System.out.println("Conversion of given octal to hexadecimal is: " + hexadecimal.reverse());
    }

    public static void htod(String hexadecimal) {
        //Thank you Micheal!! I've got the code working because of the parseInt method that you mentioned In class
        int decimal = Integer.parseInt(hexadecimal, 16);
        System.out.println("Conversion of given hexadecimal to decimal is " + decimal);
    }

    public static void htob(String hexadecimal) {
        int decimal = Integer.parseInt(hexadecimal,16);
        
        StringBuilder binary = new StringBuilder();
        while(decimal>0){
            binary.append(decimal%2);
            decimal /= 2;
        }
        System.out.println("The conversion of hexadecimal to binary is " + binary.reverse());
    }

    public static void htoo(String hexadecimal){
        int decimal = Integer.parseInt(hexadecimal,16);

        StringBuilder octal = new StringBuilder();
        while(decimal>0){
            octal.append(decimal%8);
            decimal /= 8;
        }
        System.out.println("The conversion of hexadecimal to octal is " + octal.reverse());
    }
}
