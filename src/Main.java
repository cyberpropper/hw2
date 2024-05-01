public class Main {
    public static void main(String[] args) {
        var frog = 3.5;
        System.out.println("жаба1" + frog);
        var frog2 = frog * 10;
        System.out.println("жаба2" + frog2);
        var frog3 = frog2 / 3.5;
        System.out.println("жаба3" + frog3);
        var frog4 = frog3 + 4;
        System.out.println("жаба4" + frog4);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var allboxer = boxer1 + boxer2;
        System.out.println("общий вес" + allboxer );
        var diff = boxer2 - boxer1;
        System.out.println("разница" + diff);
        var rem = boxer2 % boxer1;
        System.out.println("остаток от деления" + rem);
    }
}