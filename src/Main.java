public class Main {
    public static void main(String[] args) {
        var frog = 3.5;
        System.out.println("жаба1 " + frog);
        var frog2 = frog * 10;
        System.out.println("жаба2 " + frog2);
        var frog3 = frog2 / 3.5;
        System.out.println("жаба3 " + frog3);
        var frog4 = frog3 + 4;
        System.out.println("жаба4 " + frog4);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var allBoxer = boxer1 + boxer2;
        System.out.println("общий вес " + allBoxer );
        var diff = boxer2 - boxer1;
        System.out.println("разница " + diff);
        var rem = boxer2 % boxer1;
        System.out.println("остаток от деления " + rem );

        var wTime = 640;
        var workers = wTime / 8;
        System.out.println("Всего работников в компании - " + workers);
        var workersPlus = workers + 94;
        var wTimeAll = 640 / workersPlus;
        System.out.println("Если в компании работает " + workersPlus + " человек, то всего " + wTimeAll + " часов работы может быть поделено между сотрудниками");

    }
}