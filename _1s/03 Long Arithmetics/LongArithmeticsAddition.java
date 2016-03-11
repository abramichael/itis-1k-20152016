
public class LongArithmeticsAddition {
    public static void main(String[] args) {
        final int CAPACITY = 1000;

        // представления чисел
        int [] number1 = new int[CAPACITY];
        int [] number2 = new int[CAPACITY];
        // их размеры
        int size1, size2;

        long x = Long.parseLong(args[0]);
        size1 = 0;
        while (x > 0) {
            number1[size1] = (int)(x % 10);
            size1 += 1;
            x = x / 10;
        }

        x = Long.parseLong(args[1]);
        size2 = 0;
        while (x > 0) {
            number2[size2] = (int)(x % 10);
            size2 += 1;
            x = x / 10;
        }
        // результат
        int [] result = new int[CAPACITY];

        // перенос на следующий разряд
        int r = 0;
        // переменная для суммы разрядов
        int s = 0;

        // ладно, Данил, уговорил
        int min_size = Math.min(size1, size2);

        // размер результата (количество цифр)
        // он же шаг цикла по построению результата
        // (на каждом шаге - новая цифра)

        int size = 0;
        while (size < min_size){
            s = number1[size] + number2[size] + r;
            result[size] = s % 10;
            size++;
            r = s / 10;
        }

        // чтобы не дублировать код, определяемся,
        // из какого массива мы должны брать данные
        int [] forResult;
        int leftSize;
        if (size == size2) {
            // надо дообработать первое число
            forResult = number1;
            leftSize = size1;
        }
        else {
            forResult = number2;
            leftSize = size2;
        }

        // обрабатываем возможно оставшийся перенос
        // цикл - см. случай 9999200 + 850, например.
        while (r != 0) {
            s = r + forResult[size];
            result[size] = s % 10;
            r = s / 10;
            size++;
        }

        // когда перенос обработали, а цифры еще есть,
        // просто их копируем в результат
        while (size < leftSize) {
            result[size] = forResult[size];
            size++;
        }

        // выводим на экран в нужном порядке
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(result[i]);
        }
    }
}
