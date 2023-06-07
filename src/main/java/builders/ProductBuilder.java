package builders;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import Controllers.BufferReaderController;
import models.Product;

public class ProductBuilder {
    public static Product makeProduct(BufferReaderController controller) throws IOException {
        System.out.println("Введите название продукта:");
        String name = controller.getString();
        System.out.println("Введите стоимость продукта в формате рубли.копейки:");
        BigDecimal price;
        while (true) {
            price = controller.getDecimal().setScale(2, RoundingMode.HALF_UP);
            if (price.compareTo(BigDecimal.ZERO) <=0){
                System.out.println("Стоимость продукта должна быть больше 0. Повторите ввод:");
            } else return new Product(name, price);
        }
    }
}
