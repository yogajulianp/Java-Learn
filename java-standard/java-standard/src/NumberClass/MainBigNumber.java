package NumberClass;

import java.math.BigDecimal;

public class MainBigNumber {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("12000000000.00");
        System.out.println("number 1 :"+ number1);
        BigDecimal number2 = new BigDecimal("14000000000.00");
        System.out.println("number 2 :"+ number2);
        BigDecimal number3 = number1.add(number2);
        System.out.println("add :"+ number3);
        System.out.println("Multiple : " + number1.multiply(new BigDecimal(3)));
        System.out.println("Substract : " + number2.subtract(number1));
        System.out.println("divide : " + number2.divide(new BigDecimal(5)));

        Double doubleValue = number1.doubleValue();
        System.out.println("\nDouble value " + doubleValue);
    }
}
