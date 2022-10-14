public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }

    public static int[] array = generateRandomArray();

    public static void main(String[] args) {
        // Задача 1.
        System.out.println();
        System.out.println("Задача 1");
        int summa = 0;
        for (int i = 0; i < array.length; i++) {

            summa += array[i];
        }

        System.out.println("Сумма трат за месяц составила " + summa + " рублей ");
        System.out.println();

        // Задача 2.
        System.out.println("Задача 2.");


        double maxExpenses = -1;
        double minExpenses = 250_000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxExpenses) {
                maxExpenses = array[i];

                if (array[i] < minExpenses) {
                    minExpenses = array[i];
                }

            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей. Максимальная сумма трат за день составила " + maxExpenses + " рублей");
        System.out.println();

        //Задача 3.
        System.out.println("Задача 3");
        double averageCostPerDay = 0;
        for (int i = 0; i < array.length; i++) {
            averageCostPerDay = summa / 30;

        }
        System.out.println("Средняя сумма трат за месяц составила " + averageCostPerDay + " рублей");
        System.out.println();
        //Задача 4.
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] name = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = name.length - 1; i >= 0; i--) {

            System.out.print(name[i]);
        }


    }

}