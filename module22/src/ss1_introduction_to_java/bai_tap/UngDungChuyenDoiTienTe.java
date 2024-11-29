package ss1_introduction_to_java.bai_tap;
import java.util.Scanner;
public class UngDungChuyenDoiTienTe {

        // Hàm chuyển đổi tiền tệ với tỷ giá cố định (ví dụ: USD sang VND)
        public static double convertCurrency(double amount, double exchangeRate) {
            return amount * exchangeRate;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Hiển thị menu và nhận đầu vào từ người dùng
            System.out.println("Ứng dụng chuyển đổi tiền tệ");
            System.out.println("1. USD sang VND");
            System.out.println("2. VND sang USD");
            System.out.print("Chọn loại chuyển đổi (1 hoặc 2): ");
            int choice = scanner.nextInt();

            double exchangeRateUSDToVND = 23000.0;  // Tỷ giá 1 USD = 23,000 VND
            double exchangeRateVNDToUSD = 1 / exchangeRateUSDToVND;

            // Nhập số tiền cần chuyển đổi
            System.out.print("Nhập số tiền cần chuyển đổi: ");
            double amount = scanner.nextDouble();

            double result = 0;

            if (choice == 1) {
                // Chuyển từ USD sang VND
                result = convertCurrency(amount, exchangeRateUSDToVND);
                System.out.println(amount + " USD = " + result + " VND");
            } else if (choice == 2) {
                // Chuyển từ VND sang USD
                result = convertCurrency(amount, exchangeRateVNDToUSD);
                System.out.println(amount + " VND = " + result + " USD");
            } else {
                System.out.println("Lựa chọn không hợp lệ.");
            }

            scanner.close();
        }
    }
