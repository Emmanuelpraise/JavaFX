package Test;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        String name = "My name is Isaiah";
        name.contentEquals("Isaiah");
        name.contains("Isaiah");
//        System.out.println(name.contentEquals("Isaiah"));
//        System.out.println(name.contains("Isaiah"));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Replacement: ");
       String replace = scanner.next();

        boolean target = name.contains("Isaiah");
//        name.

//        if (target){
//            name.replace(target);
//            System.out.println(name);

        name.replace('I','o');
        System.out.println(name.replace('I','o'));
        name.replace('O', 'I');
        System.out.println(name.replace('I', 's'));
        name.replaceAll("Isaiah","Praise");
        System.out.println(name.replaceAll("Isaiah",replace));
        System.out.println(name.replaceAll(String.valueOf(target),replace));

//        System.out.println(name.replaceAll(target,replace));
//        }
    }
}
