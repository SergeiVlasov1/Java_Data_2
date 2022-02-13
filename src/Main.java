public class Main {
    public static void main(String[] args) {

        int topUpSum = 1100;
        int topUpBonusSum;
        topUpBonusSum = topUpSum / 100;
        int currentBalance = 100;
        int totalBalance;
        if (topUpSum > 1000) {
            totalBalance = (currentBalance + topUpSum + topUpBonusSum);
            System.out.println(totalBalance + " рублей на счете");
            System.out.println(topUpBonusSum + " сумма бонусных рублей");
        } else {
            totalBalance = (currentBalance + topUpSum);
            System.out.println(totalBalance + " Ваш баланс в рублях");
        }
    }
}