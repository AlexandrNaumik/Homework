import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Text {
    public static void main(String[] args){
        try (FileInputStream fis = new FileInputStream("D:\\programs\\test.txt")) {
            int i;
            StringBuilder sb = new StringBuilder();
            while ((i = fis.read())!= -1) {
                sb.append((char) i);
            }
            System.out.print(sb.toString());
            return;
        }
        catch (IOException e){System.out.print("Файл не существует");

            }
        String text ="Some text";
        try (
            FileOutputStream fos = new  FileOutputStream("test.txt")){
            fos.write(text.getBytes(),0,text.getBytes().length);
        }
        catch (IOException e){
            e.printStackTrace();
        }

        }
        }

