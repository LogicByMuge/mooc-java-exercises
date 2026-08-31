package TacoBoxes;

public class Main {
    public static void main(String[] args) {
        TacoBox triple = new TripleTacoBox();
        System.out.println(triple.tacosRemaining()); // 3
        triple.eat();
        System.out.println(triple.tacosRemaining()); // 2

        TacoBox custom = new CustomTacoBox(5);
        System.out.println(custom.tacosRemaining()); // 5
        custom.eat();
        System.out.println(custom.tacosRemaining()); // 4
    }
}
