import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        read.close();
        System.out.println("Hello "+name+"!");

        int myFirstNumber = 9;
        int mySecondNumber = 6;
        int myThirdNumber = 7;
        int result = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = result - 2000;
        System.out.println("My Last One: "+myLastOne);
        int veryLastOne = 2000 - result;
        System.out.println(veryLastOne);
    }
}
