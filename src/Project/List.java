package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class List {

    public static void que(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Index Between 0-5: ");
        int index = scanner.nextInt();

        ArrayList <String> Question = new ArrayList<String>();
        Question.add("1. Which of the following is not a programing Language?");
        Question.add("2. What does SQL stand for: ");
        Question.add("3. Who is the Father of Computer?");
        Question.add("4. What was the former Name JAVA was Called Before it was renamed?");
        Question.add("5. HTTP stands for: ");
        Question.add("6. What does HTML Stand for?");
        System.out.println(Question.get(index));


        ArrayList <String> Option_A= new ArrayList<String>();
        Option_A.add("1. JAVA");
        Option_A.add("2. Standard Query Language");
        Option_A.add("3. Who is the Father of Computer?");
        Option_A.add("4. What was the former Name JAVA was Called Before it was renamed?");
        Option_A.add("5. HTTP stands for: ");
        Option_A.add("6. What does HTML Stand for?");
        System.out.println(Option_A.get(index));

        ArrayList <String> Option_B= new ArrayList<String>();
        Option_B.add("1. Which of the following is not a programing Language?");
        Option_B.add("2. What does SQL stand for: ");
        Option_B.add("3. Who is the Father of Computer?");
        Option_B.add("4. What was the former Name JAVA was Called Before it was renamed?");
        Option_B.add("5. HTTP stands for: ");
        Option_B.add("6. What does HTML Stand for?");
        System.out.println(Option_B.get(index));

        ArrayList <String> Option_C= new ArrayList<String>();
        Option_C.add("1. Which of the following is not a programing Language?");
        Option_C.add("2. What does SQL stand for: ");
        Option_C.add("3. Who is the Father of Computer?");
        Option_C.add("4. What was the former Name JAVA was Called Before it was renamed?");
        Option_C.add("5. HTTP stands for: ");
        Option_C.add("6. What does HTML Stand for?");
        System.out.println(Option_C.get(index));

        ArrayList <String> Option_D= new ArrayList<String>();
        Option_D.add("1. Which of the following is not a programing Language?");
        Option_D.add("2. What does SQL stand for: ");
        Option_D.add("3. Who is the Father of Computer?");
        Option_D.add("4. What was the former Name JAVA was Called Before it was renamed?");
        Option_D.add("5. HTTP stands for: ");
        Option_D.add("6. What does HTML Stand for?");
        System.out.println(Option_D.get(index));
    }
    public static void main(String[] args) {
       que();
        // String questions[][] = {
        //         {"Q1","Q2","Q3","Q4","Q5"}, {"O1","O2","O3","O4","O5"}
        // };


//        System.out.println(questions[0][1]);


//        ArrayList <String> Question = new ArrayList<String>();
//        Question.add("1. Which of the following is not a programing Language?");
//        Question.get(0);
//        System.out.println(Question.get(0));
    }
}
