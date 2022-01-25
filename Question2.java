import java.util.Scanner;

public class Question2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the module code: ");
        String module = scanner.next();

        switch (module) {
            case "CSC1010":
                System.out.println("Computer Networks");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            case "CSC1008":
                System.out.println("Data Structures and Algorithms");
                break;
            case "CSC1007":
                System.out.println("Operating System");
                break;
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;
        }
        scanner.close();


    }
}
