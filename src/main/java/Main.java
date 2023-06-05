import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Controllers.BufferReaderController;
import builders.BillBuilder;
import builders.ProductBuilder;
import models.Bill;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            BufferReaderController controller = new BufferReaderController(reader);
            Bill bill = BillBuilder.makeBill(controller);

            do {
                bill.addProduct(ProductBuilder.makeProduct(controller));
                System.out.println(
                        "Если вы хотите продолжить добавление продуктов, введите любой символ."
                                + System.lineSeparator()
                                + "Для завершения ввода введите \"Завершить\"");
            } while (!controller.getString().equalsIgnoreCase("завершить"));


        } catch (IOException e) {
            System.out.println("Вмешались неведомые силы и что-то пошло не так. Попробуйте запустить приложение ещё раз.");
        }
    }
}