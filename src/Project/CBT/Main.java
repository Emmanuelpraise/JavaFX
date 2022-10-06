package Project.CBT;

import java.util.Scanner;

public class Main {

    public static void  test(){
        char option;
        int que;
        int score=0;
        Scanner scanner = new Scanner(System.in);
        do {
//            System.out.println("Available Question number is 1-6, and 7 to exit");
//            System.out.print("Select Question number: ");
//            que = scanner.nextInt();

            que = 1;
            System.out.println("Quick Test!");

            if(que == 1){

                System.out.println("1. Which of the following is not a programing Language?");
                System.out.println("a. JAVA");
                System.out.println("b. Python");
                System.out.println("c. Boolean");
                System.out.println("d. C++");

                System.out.print("Enter your Answer: ");
                option= scanner.next().charAt(0);
                System.out.println();

                switch (option) {
                    case 'a' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Wrong\n");

                        if (option == 'a'){
                            que++;
                        }
                    }
                    case 'b' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Wrong\n");
                        if (option == 'b'){
                            que++;
                        }
                    }
                    case 'c' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Correct\n");
                        if (option == 'c'){
                            score++;
                            que++;
                        }
                    }
                    case 'd' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Wrong\n");
                        if (option == 'd'){
                            que++;
                        }
                    }default -> System.out.println("Choose a correct option to proceed");
                }

            }if(que == 2){
                System.out.println("2. What does SQL stand for: ");
                System.out.println("a. Structured Query Language");
                System.out.println("b. Sent Query Language");
                System.out.println("c. Sterilized Question Language");
                System.out.println("d. Squeezed Query Language");

                System.out.print("Enter your Answer: ");
                option= scanner.next().charAt(0);
                System.out.println();


                switch (option) {
                    case 'a' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Correct\n");
                        if (option == 'a'){
                            score++;
                            que++;
                        }
                    }
                    case 'b' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Wrong\n");
                        if (option == 'b'){
                            que++;
                        }
                    }
                    case 'c' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Wrong\n");
                        if (option == 'c'){
                            que++;
                        }
                    }
                    case 'd' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Wrong\n");
                        if (option == 'd'){
                            que++;
                        }
                    }default -> System.out.println("Choose a correct option to proceed");
                }

            }if(que == 3){
                System.out.println("3. Who is the Father of Computer?");
                System.out.println("a. Edie Murphy");
                System.out.println("b. Dwayne Johnson");
                System.out.println("c. Charles Murphy");
                System.out.println("d. Charles Babbage");

                System.out.print("Enter your Answer: ");
                option= scanner.next().charAt(0);
                System.out.println();


                switch (option) {
                    case 'a' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Wrong\n");
                        if (option == 'a'){
                            que++;
                        }
                    }
                    case 'b' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Wrong\n");
                        if (option == 'b'){
                            que++;
                        }
                    }
                    case 'c' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Wrong\n");
                        if (option == 'c'){
                            que++;
                        }
                    }
                    case 'd' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Correct\n");
                        if (option == 'd'){
                            score++;
                            que++;
                        }
                    }default -> System.out.println("Choose a correct option to proceed");
                }

            }if(que == 4){
                System.out.println("4. What was the former Name JAVA was Called Before it was renamed?");
                System.out.println("a. Python");
                System.out.println("b. Polygon");
                System.out.println("c. Oak");
                System.out.println("d. JAVA");

                System.out.print("Enter your Answer: ");
                option= scanner.next().charAt(0);
                System.out.println();


                switch (option) {
                    case 'a' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Correct\n");
                        if (option == 'a'){
                            que++;
                        }
                    }
                    case 'b' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Wrong\n");
                        if (option == 'b'){
                            que++;
                        }
                    }
                    case 'c' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Wrong\n");
                        if (option == 'c'){
                            score++;
                            que++;
                        }
                    }
                    case 'd' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Wrong\n");
                        if (option == 'd'){
                            que++;
                        }
                    }default -> System.out.println("Choose a correct option to proceed");
                }

            }if(que == 5){
                System.out.println("5. HTTP stands for: ");
                System.out.println("a. Hello Telephone Typewriter Printer");
                System.out.println("b. Hyper Text Transfer Protocol");
                System.out.println("c. Hat Telephone Typewriter Print");
                System.out.println("d. Hen Television Type Postman");

                System.out.print("Enter your Answer: ");
                option= scanner.next().charAt(0);
                System.out.println();


                switch (option) {
                    case 'a' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Correct\n");
                        if (option == 'a'){
                            que++;
                        }
                    }
                    case 'b' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Wrong\n");
                        if (option == 'b'){
                            score++;
                            que++;
                        }
                    }
                    case 'c' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Wrong\n");
                        if (option == 'c'){
                            que++;
                        }
                    }
                    case 'd' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Wrong\n");
                        if (option == 'd'){
                            que++;
                        }
                    }default -> System.out.println("Choose a correct option to proceed");
                }

            }if(que == 6){
                System.out.println("6. What does HTML Stand for?");
                System.out.println("a. Hyper Text Markup Language");
                System.out.println("b. Hyper Text Mark Language");
                System.out.println("c. Hyper Text Makeup Language");
                System.out.println("d. Hyper Text Markup Luggage");

                System.out.print("Enter your Answer: ");
                option= scanner.next().charAt(0);
                System.out.println();


                switch (option) {
                    case 'a' -> {
                        System.out.print("Remark: ");
                        System.out.println("Correct\n");
                        if (option == 'a'){
                            score++;
                            if(score<=3){
                                System.out.println("Your score is: "+score+" This is poor");
                            }else  if(score>3|| score ==6){
                                System.out.println("Your score is: "+score+" This is Excellent");
                            }
                            que++;
                        }
                    }
                    case 'b' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Wrong\n");
                        if (option == 'b'){
                            if(score<=3){
                                System.out.println("Your score is: "+score+" This is poor");
                            }else  if(score>3|| score ==6){
                                System.out.println("Your score is: "+score+" This is Excellent");
                            }
                            que++;
                        }
                    }
                    case 'c' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Wrong\n");
                        if (option == 'c'){
                            if(score<=3){
                                System.out.println("Your score is: "+score+" This is poor");
                            }else  if(score>3|| score ==6){
                                System.out.println("Your score is: "+score+" This is Excellent");
                            }
                            que++;
                        }
                    }
                    case 'd' -> {
//                        System.out.print("Remark: ");
//                        System.out.println("Wrong\n");
                        if (option == 'd'){
                            if(score<=3){
                                System.out.println("Your score is: "+score+" This is poor");
                            }else  if(score>3|| score ==6){
                                System.out.println("Your score is: "+score+" This is Excellent");
                            }
                            que++;
                        }
                    }default -> System.out.println("Choose a correct option to proceed");
                }

            }if(que == 7){
                System.out.println("End");
            }

        }while (que != 7);

    }

    public static void main(String[] args) {
        test();
    }
}
