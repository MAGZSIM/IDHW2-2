public class Main {
    public static void main(String[] args) {

        int checkClient = 100;
        int refill = 1000;

        int percent;
        if (refill >= 1000) {
            percent = 1;
            int bonus = refill * percent / 100;
            int totalClientAmount = checkClient + bonus + refill;

            System.out.println(" Итого начисленно бонусных рублей: " + bonus);
            System.out.println(" Итого на счету клиента: " + totalClientAmount);
        } else {
            int bonus = 0;
            int totalClientAmount = checkClient + bonus + refill;

            System.out.println(" Итого начисленно бонусных рублей: " + bonus);
            System.out.println(" Итого на счету клиента: " + totalClientAmount);
        }

    }
}