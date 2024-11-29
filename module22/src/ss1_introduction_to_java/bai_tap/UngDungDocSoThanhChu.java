package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {

    // Mảng chứa các từ tương ứng với các số trong phạm vi 0-19
    private static final String[] below20 = {
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"
    };

    // Mảng chứa các từ tương ứng với các số trong phạm vi 20, 30, ..., 90
    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    // Hàm chuyển số thành chữ
    public static String numberToWords(int num) {
        if (num == 0) {
            return below20[0];
        }

        StringBuilder words = new StringBuilder();

        if (num >= 100) {
            words.append(below20[num / 100]).append(" Hundred ");
            num %= 100;
        }

        if (num >= 20) {
            words.append(tens[num / 10]).append(" ");
            num %= 10;
        }

        if (num > 0) {
            words.append(below20[num]);
        }

        return words.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số từ người dùng
        System.out.print("Nhập một số từ 0 đến 999: ");
        int num = scanner.nextInt();

        if (num < 0 || num > 999) {
            System.out.println("Vui lòng nhập một số trong phạm vi từ 0 đến 999.");
        } else {
            // Hiển thị số thành chữ
            System.out.println("Số " + num + " đọc là: " + numberToWords(num));
        }

        scanner.close();
    }
}
