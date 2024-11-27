import java.util.Scanner;

public class gpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Phương trình bậc nhất với một biến
        System.out.println("Giải phương trình bậc nhất ax + b = 0");
        System.out.print("Nhập a (a != 0): ");
        double a = scanner.nextDouble();
        if (a == 0) {
            System.out.println("Giá trị a không thể là 0.");
        } else {
            System.out.print("Nhập b: ");
            double b = scanner.nextDouble();
            double x1 = -b / a;
            System.out.println("Nghiệm của phương trình là: x = " + x1);
        }

        // Hệ phương trình bậc nhất với hai biến
        System.out.println("\nGiải hệ phương trình bậc nhất:");
        System.out.print("Nhập a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Nhập a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Nhập b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Nhập a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Nhập a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Nhập b2: ");
        double b2 = scanner.nextDouble();

        double D = a11 * a22 - a12 * a21; // Định thức D
        double D1 = b1 * a22 - b2 * a12;   // Định thức D1
        double D2 = a11 * b2 - a21 * b1;   // Định thức D2

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Hệ phương trình có vô số nghiệm.");
            } else {
                System.out.println("Hệ phương trình vô nghiệm.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Nghiệm của hệ phương trình là: x1 = " + x1 + ", x2 = " + x2);
        }

        // Phương trình bậc hai với một biến
        System.out.println("\nGiải phương trình bậc hai ax^2 + bx + c = 0");
        System.out.print("Nhập a (a != 0): ");
        a = scanner.nextDouble();
        if (a == 0) {
            System.out.println("Giá trị a không thể là 0.");
        } else {
            System.out.print("Nhập b: ");
            double b = scanner.nextDouble();
            System.out.print("Nhập c: ");
            double c = scanner.nextDouble();
            double discriminant = b * b - 4 * a * c; // Tính delta

            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
            } else if (discriminant == 0) {
                double x1 = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x1);
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        }

        // Đóng scanner
        scanner.close();
    }
}
