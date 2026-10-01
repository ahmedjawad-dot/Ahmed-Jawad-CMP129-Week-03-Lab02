/*
 * Student Name: Jawad Ahmed
 * Course: CMP 129
 * Week: 3
 * Lab: 2
 * Assignment: Calculator Method Overloading
 * Date: 9/30/2026
 */
public class CalculatorTest {
    
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println("Sum of Two Integers : " + calc.add(2, 2));
        System.out.println("Sum of Two Doubles: " + calc.add(5.0,5.0));
        System.out.println("Sum of Three Integers: " + calc.add(2, 4, 6));
        System.out.print("Concatenated Strings: " + calc.add("calculator", "test"));
        






    }
}
