import java.util.Scanner;
public class WrapperDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int letters = 0, digits = 0, special = 0;
        for(char ch : s.toCharArray()) {
            if(Character.isLetter(ch)) letters++;
            else if(Character.isDigit(ch)) digits++;
            else if(!Character.isWhitespace(ch)) special++;
        }
        System.out.println("Letters: "+letters+", Digits: "+digits+", Special: "+special);
    }
}
