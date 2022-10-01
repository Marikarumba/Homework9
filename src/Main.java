public class Main {
    public static void main(String[] args) {


        // Практика на уроке 1.6. Массивы ч.2
        System.out.println("Практика на уроке. 1.6. Массивы ч.2");
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int[] weightscopy = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightscopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightscopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Массивы одинаковые");
        } else {
            System.out.println("Массивы разные");
        }
        for (int i = 0; i < weightscopy.length; i++) {
            System.out.println(weightscopy[i]);
        }

        int maxWeight = -1;
        for (int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println(maxWeight);
        for (int i = 0; i < weights.length - 1 && weights[i + 1] != 0; i++) {
            //if (weights[i+1] != 0) {
            System.out.println(weights[i + 1] - weights[i]);
        }

        //Задача 1.
        System.out.println("Задача 1.");
        //Каждый день месяца, включая выходные, компания тратит средства — некую сумму,
        // причем в бухгалтерской книге хранится сумма затрат по дням (а не каждая сумма отдельно).
        // То есть вкниге 30 записей разных сумм. Эти суммы разнятся от 100 000 до 200 000
        //Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //в формате: «Сумма трат за месяц составила … рублей».

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("Сумма трат за месяц составила"+sum+"рублей»");

        //Задача 2.
        System.out.println("Задача 2.");
        //Следующая задача — найти минимальную и максимальную трату за день.
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //в формате: «Минимальная сумма трат за день составила … рублей.
        // Максимальная сумма трат за день составила … рублей».
        int max= 100_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] > max) {
                max= arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила "+max+" рублей.");

        int min= 200_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] < min) {
                max= arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+max+" рублей.");

        //Задача 3.
        //Нужно написать программу, которая посчитает среднее значение трат за месяц
        // (то есть сумму всех трат за месяц поделить на количество дней),
        // и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        int middle = sum/30;

        System.out.println("Средняя сумма трат за месяц составила "+middle+" рублей");

        //Задача 4.
        System.out.println("Задача 4.");
        //Данные с именами сотрудников хранятся в виде массива символов (char[]).
        //Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
        // В качестве данных для массива используйте:
        //В результате в консоль должно быть выведено "Ivanov Ivan".
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println(" ");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    }

