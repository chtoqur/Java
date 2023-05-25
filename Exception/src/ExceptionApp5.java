import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class ExceptionApp5 {
    public static void main(String[] args) {
        
        // 주소 저장
        Path file = Paths.get("C:\\AAA\\test.txt");
        BufferedWriter writer = null;

        try
        {
            // 뭔가를 저장할 버퍼를 만드는 것
            // 용도 = file에 저장할 버퍼
            // 파일을 만들어서 열어라
            writer = Files.newBufferedWriter(file);

            // 파일에 써라
            writer.write('A');
            writer.write('B');

            // 다 적었으면
            if (writer != null)
            {
                // 파일을 닫아라
                writer.close();
            }
        }
        catch(IOException e)
        {

        }

    }
}
