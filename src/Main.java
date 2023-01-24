public class Main {
    public static void main(String[] args) {

        int checkClient = 100;
        int refill = 1200;

        int percent = 1;
        if (refill >= 1000) {
            }

        int bonus = refill * percent / 100;
        int totalClientAmount = checkClient + refill * percent / 100;

        System.out.println(" Итого начисленно бонусных рублей: " + bonus);
        System.out.println(" Итого на счету клиента: " + totalClientAmount);


    }
}