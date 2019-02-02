// Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
import java.io.*;

public class Task_15{
        public static void main(String[] args) {
            String line;
            try {
                File file = new File("file.txt");
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
                bufferedReader.close();
            }
            catch (IOException e) {
                System.out.println("Ошибка: " + e);
            }
        }
    }