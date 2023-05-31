import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Bill bill = new Bill();

        bill.getPeopleCount();
        bill.makeProductList();
        bill.calculation();
    }
}