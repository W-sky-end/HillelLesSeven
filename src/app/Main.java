package app;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static int[] number;
    static int negativeNumbers;
    static int even;
    static int unEven;
    static int smaller;
    static int biggest;
    static int smallerIndex;
    static int biggestIndex;
    static double averagesNumber;
    static int count;
    static boolean firstNegativeNumber;
    static int sumNumbers;

    public static void main(String[] args) {
        number = new int[20];
        Random random = new Random();

        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(-100, 101);
        }
        System.out.println("1) Random arrays is : " + Arrays.toString(number));
        // сумма негативных чисел
        negativeNumbers = 0;
        for (int i : number) {
            if (i < 0) {
                negativeNumbers += i;
            }
        }
        System.out.println("2) Sum of negative numbers in the array is : " + negativeNumbers);
        // четные и нечетные числа
        even = 0;
        unEven = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                even++;
            } else {
                unEven++;
            }
        }
        System.out.println("3) Even numbers in the array is : " + even +
                "\n   Uneven numbers in the array is : " + unEven);
        //наибольший и наименьший элемент
        smaller = 0;
        biggest = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < smaller) {
                smaller = number[i];
                smallerIndex = i;
            }
            if (number[i] > biggest) {
                biggest = number[i];
                biggestIndex = i;
            }
        }
        System.out.println("4) The lowest element is : " + smaller +
                " and its index is : " + smallerIndex + "\n   The biggest element is : " +
                biggest + "and its index is : " + biggestIndex);
        //после первого отрицательного числа
        sumNumbers = 0;
        count = 0;
        firstNegativeNumber = false;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < 0) {
                firstNegativeNumber = true;
            } else if (firstNegativeNumber) {
                sumNumbers += number[i];
                count++;
            }
            }
if (count > 0){
    averagesNumber = sumNumbers / count;
    System.out.printf("5) Average number is : %.2f%n",averagesNumber);
} else {
    System.out.println(" Sorry but first negative number is not found");
    // Cкажу не кривя душой получил удовольствие от ТЗ , кроме последнего она меня очень запутала
    // старался сделать хоть чуток красиво надеюсь у меня получилось
}

        }
    }