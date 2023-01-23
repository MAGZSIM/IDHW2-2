public class Main {
    public static void main(String[] args) {

        int checkClient = 100;

        int refill = 1200;

        int percent = refill >= 1000 ? 1 : 0;

        int totalClientAmount = checkClient + refill * percent / 100;

        System.out.println(" Итого на счету клиента: " + totalClientAmount);


    }
}