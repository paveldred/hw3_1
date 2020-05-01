public class Main {
    public static void main(String[] args) {
        int ticketPriceKops = 2000100;
        int miles = ticketPriceKops / 100 / 20;

        System.out.println();
        System.out.println("Стоимость билета: " + ticketPriceKops / 100 + " рублей | После покупки вы получите " + miles + " миль.");
    }
}