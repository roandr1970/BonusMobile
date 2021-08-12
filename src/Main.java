public class Main {
    public static void main(String[] args) {
        int clientAccount = 100;
        int depositAmount = 1500;
        int numberBonusRub = 0;
        if (depositAmount > 1000) {
            numberBonusRub = depositAmount / 100;
        }
        clientAccount = clientAccount + depositAmount + numberBonusRub;
        System.out.println(clientAccount);
    }
}
