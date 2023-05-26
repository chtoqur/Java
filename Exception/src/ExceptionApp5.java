import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class ExceptionApp5 {
    public static void main(String[] args) {
        
        // 주소 저장
        Path file = Paths.get("C:\\AAA\\test.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(file))
        {
            // 파일에 작성
            writer.write('A');
            writer.write('B');
        }
        catch(IOException e)
        {
            // printStackTrace = 역으로 올라가며 출력
            e.printStackTrace();
        }
        
    }
}
