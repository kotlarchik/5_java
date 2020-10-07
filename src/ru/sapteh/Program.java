package ru.sapteh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");
        String input = buffer.readLine();

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char m = input.charAt(i);
            sum = Character.getNumericValue(input.charAt(i))+sum;
        }
        System.out.println("Сумма всех чисел введенного числа равна "+ sum);
    }
}
