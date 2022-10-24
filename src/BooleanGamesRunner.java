public class BooleanGamesRunner {
    public static void main(String[] args) {
        BooleanGames game1 = new BooleanGames(10);
        System.out.println(game1.isNegative());
        System.out.println("----");
        System.out.println(game1.exceeds(9));
        System.out.println(game1.exceeds(10));
        System.out.println(game1.exceeds(11));
        System.out.println("----");
        System.out.println(game1.isEven());
        System.out.println(game1.isOdd());
        System.out.println("----");
        System.out.println(game1.isMultipleOf(1));
        System.out.println(game1.isMultipleOf(2));
        System.out.println(game1.isMultipleOf(5));
        System.out.println(game1.isMultipleOf(10));
        System.out.println(game1.isMultipleOf(4));
        System.out.println(game1.isMultipleOf(8));
        System.out.println(game1.isMultipleOf(20));
        System.out.println("----");
        System.out.println(game1.isOnesDigit(0));
        System.out.println(game1.isOnesDigit(1));
        System.out.println(game1.isOnesDigit(5));
    }
}


