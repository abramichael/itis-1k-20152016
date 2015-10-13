
public class LongArithmeticsAddition {
    public static void main(String[] args) {
        final int CAPACITY = 1000;

        // ������������� �����
        int [] number1 = new int[CAPACITY];
        int [] number2 = new int[CAPACITY];
        // �� �������
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
        // ���������
        int [] result = new int[CAPACITY];

        // ������� �� ��������� ������
        int r = 0;
        // ���������� ��� ����� ��������
        int s = 0;

        // �����, �����, ��������
        int min_size = Math.min(size1, size2);

        // ������ ���������� (���������� ����)
        // �� �� ��� ����� �� ���������� ����������
        // (�� ������ ���� - ����� �����)

        int size = 0;
        while (size < min_size){
            s = number1[size] + number2[size] + r;
            result[size] = s % 10;
            size++;
            r = s / 10;
        }

        // ����� �� ����������� ���, ������������,
        // �� ������ ������� �� ������ ����� ������
        int [] forResult;
        int leftSize;
        if (size == size2) {
            // ���� ������������ ������ �����
            forResult = number1;
            leftSize = size1;
        }
        else {
            forResult = number2;
            leftSize = size2;
        }

        // ������������ �������� ���������� �������
        // ���� - ��. ������ 9999200 + 850, ��������.
        while (r != 0) {
            s = r + forResult[size];
            result[size] = s % 10;
            r = s / 10;
            size++;
        }

        // ����� ������� ����������, � ����� ��� ����,
        // ������ �� �������� � ���������
        while (size < leftSize) {
            result[size] = forResult[size];
            size++;
        }

        // ������� �� ����� � ������ �������
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(result[i]);
        }
    }
}
