import org.testng.annotations.Test;

public class ArmstrongNumber {

    @Test
    public static void testArmstrongNumber()
    {
        checkArmstrongNumber(153);

        checkArmstrongNumber(371);

        checkArmstrongNumber(9474);

        checkArmstrongNumber(54748);

        checkArmstrongNumber(407);

        checkArmstrongNumber(1674);
    }

    private static void checkArmstrongNumber(int i) {

        String tmpNumber = String.valueOf(i);

        int pow = tmpNumber.length();
        System.out.println("Number: "+ i + " Pow: "+pow);
        double sum = 0;
        StringBuilder builder = new StringBuilder();
        for (int pos = 0; pos < pow; pos++) {
            int value = Integer.parseInt( String.valueOf(tmpNumber.charAt(pos)));
            builder.append(value+"^"+pow);
            if(pos!= pow -1){
                builder.append(" + ");
            }
            sum = sum+ Math.pow(value, pow);
        }
        builder.append(" = "+(int)sum);
        System.out.println(builder);
        if(i == sum){
            System.out.println("Armstrong value");
        }else{
            System.out.println("Not armstrong value");
        }


    }
}
