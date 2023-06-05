package Controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;

public class BufferReaderController {
    BufferedReader reader;

    public BufferReaderController(BufferedReader reader){
        this.reader = reader;
    }

    public int getInt() throws IOException {
        while (true){
            try{
                return Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e){
                System.out.println("Ожидается целое число, не больше " + Integer.MAX_VALUE + ". Повторите ввод:");
            }
        }
    }

    public String getString() throws IOException{
        while (true){
            String line = reader.readLine();
            if (!line.trim().isEmpty()){
                return line;
            } else {
                System.out.println("Ожидается не пустая строка. Повторите ввод:");
            }
        }
    }

    public BigDecimal getDecimal() throws IOException{
        while (true){
            try{
                return new BigDecimal(reader.readLine());
            } catch (NumberFormatException e){
                System.out.println("Ожидается дробное число. Повторите ввод:");
            }
        }
    }
}
