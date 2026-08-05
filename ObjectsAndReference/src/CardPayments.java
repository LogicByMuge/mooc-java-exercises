public class CardPayments {
    public static void main(String[] args) {
        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("Remaining change " + change);

        PaymentCard annesCard = new PaymentCard(7);

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        System.out.println(annesCard.getBalance());

        unicafeExactum.addMoneyToCard(annesCard, 5);


        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        System.out.println(annesCard.getBalance());

        System.out.println(unicafeExactum);
    }
}