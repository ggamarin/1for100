public class Main {
    public static void main(String[] args) {
        int account=100;
        int payment=13294;
        int bonus;
        if (payment>=1000){
            bonus = payment / 100;
        } else{
            bonus = 0;
        }
        long accounttotal= account+payment+bonus;
        System.out.println(accounttotal);
        System.out.println(bonus);
        }
    }

