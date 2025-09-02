class universitydiscount
{
    public static void main(String[] args) 
    {
        int fee=125000;
        double discountPercent=10;
        double discountedFee=fee-(fee*discountPercent/100);
        System.out.println("The discount amount is INR " + (fee - discountedFee) + " and final discounted fee is INR " + discountedFee);
    }
    }

