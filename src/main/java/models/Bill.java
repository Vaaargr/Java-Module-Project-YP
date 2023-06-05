package models;

import java.math.BigDecimal;
import java.util.LinkedList;

import models.Product;

public class Bill {

    private int peopleCount;
    private BigDecimal sum = new BigDecimal(0.0);
    private StringBuilder textOfBill = new StringBuilder("Добавленные товары:");
    private LinkedList<Product> listOfProducts = new LinkedList<>();

    public Bill(int peopleCount){
        this.peopleCount = peopleCount;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void addProduct(Product product){
        listOfProducts.add(product);
    }

    /*public void getPeopleCount() throws IOException {

        while (true) {
            String input = reader.readLine();
            int inputPeopleCount = 0;
            try {
                inputPeopleCount = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Некорректное значение. Ожидается число. Повторите ввод:");
                continue;
            }
            if (inputPeopleCount > 1) {
                peopleCount = inputPeopleCount;
                break;
            } else {

            }
        }
    }

    public void makeProductList() throws IOException {
        while (true) {
            makeProduct();
            System.out.println("Хотите добавить ещё товар?");
            String answer = reader.readLine();
            if (answer.equalsIgnoreCase("завершить")) break;
        }
    }

    public void calculation() {
        System.out.println(textOfBill);
        float endPrice = sum / (float) peopleCount;
        String currentCase = makeCase(endPrice);
        System.out.printf("Каждый человек должен заплатить по %.2f %s", endPrice, currentCase);
    }

    private void makeProduct() throws IOException {
        System.out.println("Введите название продукта:");
        String name = reader.readLine();
        System.out.println("И его стоимость:");
        String countString;
        float count = -1;
        while (true) {
            countString = reader.readLine();
            try {
                count = Float.parseFloat(countString.replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Введена некорректная цена повторите ввод:");
                continue;
            }
            if (count > 0) {
                break;
            } else {
                System.out.println("Введена некорректная цена повторите ввод:");
            }
        }
        sum += count;
        textOfBill = textOfBill.concat("\n").concat(name).concat(" ").concat(countString);
        System.out.println("Товар добавлен.");
    }

    */
}

