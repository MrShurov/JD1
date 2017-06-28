package Lesson4;

public class ATM {
    public int amount20;
    public int amount50;
    public int amount100;
    public int addAmount;
    public int requestedAmount;
    public int sum;
    public boolean takeOff;

    public ATM(int amount20, int amount50, int amount100) {
        this.amount20 = amount20;
        this.amount50 = amount50;
        this.amount100 = amount100;
    }

    public static void main(String[] args) {
        ATM atm = new ATM(50, 50, 50);
        atm.takeOff(1210, atm.isTakeOff(atm.getAmountMoney(), 1210));
    }

    public int addAmount() {
        amount20 += addAmount;
        return amount20;
    }

    public int addAmount50() {
        amount50 += addAmount;
        return amount50;
    }

    public int addAmount100() {
        amount100 += addAmount;
        return amount100;
    }

    public int getAmountMoney() {
        sum = amount20 * 20 + amount50 * 50 + amount100 * 100;
        return sum;
    }

    public boolean isTakeOff(int sum, int requestedAmount) {
        if (requestedAmount <= sum) {
            System.out.println("Можно снять деньги");
            return takeOff = true;
        } else {
            System.out.println("Нельзя снять деньги");
            return takeOff = false;
        }
    }

    public void takeOff(int requestedAmount, boolean takeOff) {
        int needAmount20 = 0;
        int needAmount50 = 0;
        int needAmount100 = 0;
        int needExtra20 = 0;
        int needExtra50 = 0;
        int extraMoney = 0;
        int requestedAmountCounter = 0;
        if (takeOff == true) {
            if (requestedAmount % 100 == 0 && requestedAmount / 100 <= amount100) {
                System.out.println("Выдано: " + requestedAmount / 100 + " купюр номиналом 100 рублей");
                amount100 -= requestedAmount / 100;
            } else if (requestedAmount % 50 == 0 && requestedAmount / 50 <= amount50) {
                System.out.println("Выдано: " + requestedAmount / 50 + " купюр номиналом 50 рублей");
                amount50 -= requestedAmount / 50;
            } else if (requestedAmount % 20 == 0 && requestedAmount / 20 <= amount20) {
                System.out.println("Выдано: " + requestedAmount / 20 + " купюр номиналом 20 рублей");
                amount20 -= requestedAmount / 20;
            }
            if (requestedAmount % 100 == 10) {
                requestedAmount = requestedAmount - 110;
                needExtra20 = 3;
                needExtra50 = 1;
                extraMoney = 110;
            }
            if (requestedAmount % 100 == 30) {
                requestedAmount = requestedAmount - 130;
                needExtra20 = 4;
                needExtra50 = 1;
                extraMoney = 130;
            }
            if (requestedAmount >= 0) {
                needAmount100 = requestedAmount / 100;
                if (requestedAmount > 0 && needAmount100 < amount100) {
                    requestedAmountCounter = requestedAmount - 100 * needAmount100;
                    amount100 -= needAmount100;
                }else if(requestedAmount == 0){

                } else {
                    requestedAmountCounter = requestedAmount - 100 * amount100;
                    needAmount100 = amount100;
                    amount100 -= needAmount100;
                }
                needAmount50 = requestedAmountCounter / 50;
                if (requestedAmountCounter > 0 && needAmount50 <= amount50) {
                    requestedAmountCounter = requestedAmountCounter - 50 * needAmount50;
                    amount50 -= needAmount50;
                }else if(requestedAmountCounter == 0){

                } else {
                    requestedAmountCounter = requestedAmountCounter - 50 * amount50;
                    needAmount50 = amount50;
                    amount50 -= needAmount50;
                }
                needAmount20 = requestedAmountCounter / 20;
                if (requestedAmountCounter > 0 && needAmount20 <= amount20) {
                    requestedAmountCounter = requestedAmountCounter - 20 * needAmount20;
                    amount20 -= needAmount20;
                }
                if (requestedAmountCounter == 0) {
                    System.out.println(requestedAmount + extraMoney + " выдано рублей");
                    System.out.println(needAmount20 + needExtra20 + " номиналом 20 рублей");
                    System.out.println(needAmount50 + needExtra50 + " номиналом 50 рублей");
                    System.out.println(needAmount100 + " номиналом 100 рублей");
                } else {
                    System.out.println("Банкомат не может выдать нужную сумму");
                }
            }
        }
    }
}
