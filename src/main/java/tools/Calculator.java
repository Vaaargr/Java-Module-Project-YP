package tools;

import java.math.BigDecimal;
import java.math.RoundingMode;

import models.Bill;
import models.Product;

public class Calculator {
    public static void countBill(Bill bill) {
        StringBuilder builder = new StringBuilder("Добавленные товары:" + System.lineSeparator());
        BigDecimal amount = new BigDecimal(0);

        if (bill.getListOfProducts().isEmpty()) {
            System.out.println("Список товаров в чеке пуст. Нечего считать.");
        } else {
            for (Product product : bill.getListOfProducts()) {
                builder.append(product.getInformation()).append(System.lineSeparator());
                amount = amount.add(product.getPrice());
            }

            amount = amount.divide(BigDecimal.valueOf(bill.getPeopleCount()), 2, RoundingMode.HALF_UP);

            builder.append("Каждый человек должен заплатить по ").append(amount).append(Variator.makeCase(amount.toString())).append(System.lineSeparator());
            System.out.println(builder);
        }
    }
}
