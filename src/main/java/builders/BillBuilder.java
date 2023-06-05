package builders;

import java.io.IOException;

import Controllers.BufferReaderController;
import models.Bill;

public class BillBuilder {
    public static Bill makeBill(BufferReaderController bufferReaderController) throws IOException {
        System.out.println("Введите количество человек," +
                " на которых необходимо разделить чек(должно быть больше 1го):");
        while (true) {
            int peopleCount = bufferReaderController.getInt();
            if (peopleCount > 1) {
                return new Bill(peopleCount);
            } else {
                System.out.println(
                        "Некорректное значение. Количество людей должно быть больше 1го. Повторите ввод:"
                );
            }
        }
    }
}
