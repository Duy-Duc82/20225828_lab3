package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {

        String filename = "src/longtext.txt"; // Đường dẫn đến file lớn
        byte[] inputBytes = {0};
        long startTime, endTime;

        try {
            // Đọc toàn bộ nội dung file vào mảng byte
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
            return;
        }

        // Nối chuỗi sử dụng toán tử + (Tạo ra nhiều rác)
        startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b; // Tạo nhiều đối tượng String trong bộ nhớ
        }
        endTime = System.currentTimeMillis();

        System.out.println("Thời gian thực thi (GarbageCreator): " + (endTime - startTime) + " ms");
    }
}
