import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // задача 1
        System.out.println("задача 1");

        int amountPayments = 0;
        int[] arr = generateRandomArray();

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(i + " " + arr[i]);
            amountPayments += arr[i];
        }
        System.out.println("Сумма всех выплат за месяц: " + amountPayments);
        // задача 2
        System.out.println("задача 2");
        int maxPayment = 99999;
        for( final int current : arr)
        {
            if (current > maxPayment) {
                maxPayment = current;
            }
        }

        int minPayment = 200001;
        for( final int current : arr)
        {
            if (current < minPayment) {
                minPayment = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPayment + " рублей. " + "Максимальная сумма трат за день составила " + maxPayment + " рублей");
        // задача 3
        System.out.println("задача 3");
        double averagePayment = amountPayments / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagePayment + " рублей");

        // задача 4
        System.out.println("задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i >= 0; i = i-1) {
            System.out.print(reverseFullName[i]);

        }
    }

    public static int[] generateRandomArray() {

        Random random = new Random();
        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}