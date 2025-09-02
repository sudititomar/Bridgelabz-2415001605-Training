public class SpringSeason {
    public static void main(String[] args) {

        int month = Integer.parseInt(args[0]);  
        int day = Integer.parseInt(args[1]);


        boolean isSpring = false;


        for (int m = 3; m <= 6; m++) {
            if (m == month) {
   
                if (m == 3 && day >= 20 && day <= 31) {
                    isSpring = true;
                }

                else if (m == 4 && day >= 1 && day <= 30) {
                    isSpring = true;
                }
 
                else if (m == 5 && day >= 1 && day <= 31) {
                    isSpring = true;
                }
   
                else if (m == 6 && day >= 1 && day <= 20) {
                    isSpring = true;
                }
            }
        }

        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
