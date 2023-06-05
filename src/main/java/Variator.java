public class Variator {
    public static String makeCase(double endPrice) {
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
