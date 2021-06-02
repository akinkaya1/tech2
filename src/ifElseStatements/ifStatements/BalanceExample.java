package ifElseStatements.ifStatements;

public class BalanceExample {
    public static void main(String[] args) {
        double balance = 200;

        //We spend some money here

        balance -= 250; // -50

        if(balance < 0){
            //this code will be executed only if condition (balance < 0) is true
            System.out.println("Alert: your balance is under zero!!!");
        }

        System.out.println("End of program");
    }
}
