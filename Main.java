import java.util.Scanner;

class Main{
    public static void main(String[] args){
        System.out.println("Hello, I am Lim Kei Yiang");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the module code: ");  
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

        for(int i = 102; i > 66; i--){
            if(i%2 == 1){
                System.out.println("Value of x : " + i);
            }
        }
    }
}