package ss3_Array_Method_to_java.bai_tap.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo mảng ban đầu
        int[] array = {10, 2, 3, 4, 6, 0, 6};

        // In mảng ban đầu
        System.out.println("Mảng ban đầu là: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Nhập phần tử cần xóa
        System.out.println("Nhập số cần xóa: ");
        int x = Integer.parseInt(scanner.nextLine());

        // Tìm và xóa phần tử
        int count = 0;
        for (int value : array) {
            if (value == x) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Không tìm thấy phần tử cần xóa.");
        } else {
            int[] newArray = new int[array.length - count];
            int index = 0;

            for (int value : array) {
                if (value != x) {
                    newArray[index++] = value;
                }
            }

            // In mảng sau khi xóa
            System.out.println("Mảng sau khi xóa là: ");
            for (int value : newArray) {
                System.out.print(value + " ");
            }
        }
    }
}
