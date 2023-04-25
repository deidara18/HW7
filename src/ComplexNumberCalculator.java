import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ComplexNumberCalculator {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите два комплексных числа в формате (a + b):");

        ComplexNumber firstNumber = new ComplexNumber(input.next());
        ComplexNumber secondNumber = new ComplexNumber(input.next());

        ComplexNumber sum = firstNumber.add(secondNumber);
        ComplexNumber difference = firstNumber.subtract(secondNumber);


        System.out.println("Сумма: " + sum.toString());
        System.out.println("Разность: " + difference.toString());


        FileWriter writer = new FileWriter("complex_calculator.txt");
        writer.write("Первое число: " + firstNumber + "\n");
        writer.write("Второе число: " + secondNumber + "\n");
        writer.write("Сумма: " + sum + "\n");
        writer.write("Разность: " + difference + "\n");
        writer.close();
    }
}