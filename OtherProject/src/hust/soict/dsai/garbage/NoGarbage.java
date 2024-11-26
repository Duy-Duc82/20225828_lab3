package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
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

        // Sử dụng StringBuffer để tối ưu hiệu năng
        startTime = System.currentTimeMillis();
        StringBuffer outputBuffer = new StringBuffer();
        for (byte b : inputBytes) {
            outputBuffer.append((char) b);
        }
        String outputString = outputBuffer.toString();
        endTime = System.currentTimeMillis();

        System.out.println("Thời gian thực thi (NoGarbage): " + (endTime - startTime) + " ms");
    }
}
