public class TestATMMachine {

    public static void main(String[] args) {

        ATMMachine atmMachine = new ATMMachine();

        atmMachine.InsertCard();

        atmMachine.insertPin(1234);

        atmMachine.requestCash(500);
    }
}
