import java.io.*;

/**
 * Created by KPS on 7/27/2020.
 */
public class Main {
    public static void main(String[] args) {
        File path = new File("d:\\employee.txt");
        try(FileInputStream fileInputStream = new FileInputStream(path);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)){
            byte[] bytes = new byte[1024];
            int length = 0;
            while ((length =bufferedInputStream.read(bytes))!=-1){
                System.out.println(new String(bytes,0,length));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
