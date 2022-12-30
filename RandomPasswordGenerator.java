import java.util.Random;
import java.util.Scanner;
public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE PASSWORD: ");
        int passLen = sc.nextInt();

        String lowerChar = "abcdefghijklmnopqrstuvwxyz";
        String upperChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialChar = "<>.[]/!@#$%^&*)(";
        String num = "0123456789";

        String combination = lowerChar + upperChar + specialChar + num;
        char[] password = new char[passLen];
        Random r = new Random();

        for(int i=0; i<passLen; i++) {
            password[i] = combination.charAt(r.nextInt(combination.length()));
        }
        
        System.out.println(password);

    }
}