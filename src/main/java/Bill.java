import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bill {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private int peopleCount = 0;
    private float sum = 0.0f;
    private String textOfBill = "Добавленные товары:";

    public void getPeopleCount() throws IOException {
        System.out.println("Введите количество человек, на которых необходимо разделить чек:");
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
                System.out.println(
                        "Некорректное значение. Количество людей должно быть больше 1го. Повторите ввод:"
                );
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
        float endPrice = sum/(float) peopleCount;
        String currentCase = makeCase(endPrice);
        System.out.printf("Каждый человек должен заплатить по %.2f %s",endPrice, currentCase);
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

    private String makeCase(double endPrice) {
        String[] buffer = String.valueOf(endPrice).split("\\.");
        if (buffer[0].length() > 1 && buffer[0].charAt(buffer[0].length() - 2) == '1') {
            return "рублей.";
        } else {
            return switch (buffer[0].charAt(buffer[0].length() - 1)) {
                case '1' -> "рубль.";
                case '2', '3', '4' -> "рубля.";
                default -> "рублей.";
            };
        }
    }
}

