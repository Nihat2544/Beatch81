package Beach_80.src.day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IcIcğTryCatch {
    public static void main(String[] args) {
        int k;

        try {
            FileInputStream fis = new FileInputStream("src/Beach_80/src/day39_exception/Test.txt");
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosyadan bilgiler okumadi");
        }
      }
    }
