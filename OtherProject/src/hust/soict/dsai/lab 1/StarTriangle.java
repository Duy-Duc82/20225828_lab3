import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 

        // Nhập chiều cao của tam giác
        System.out.print("Nhập chiều cao của tam giác: ");
        int n = keyboard.nextInt();

        // Hiển thị tam giác
        for (int i = 0; i < n; i++) {
            // Tính số sao: 2 * i + 1
            int numberOfStars = 2 * i + 1;
            // Tính số khoảng trắng để căn giữa
            int spaces = n - i - 1;

            // In khoảng trắng
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // In sao
            for (int j = 0; j < numberOfStars; j++) {
                System.out.print("*");
            }

            // Xuống dòng sau mỗi hàng
            System.out.println();
        }

        keyboard.close(); // Close the Scanner
    }
}
