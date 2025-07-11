public class Main {
    public static void main(String[] args) {
        SuperHero superman = new SuperHero();
        SuperHero spiderman = new SuperHero();
        SuperHero hawk = new SuperHero();


        superman.name = "Superman";
        superman.attackPower = 50;
        superman.isTurningIntoStatue = false;
        superman.isHeroKind = true;

        spiderman.name = "Spiderman";
        spiderman.attackPower = 15;
        spiderman.isTurningIntoStatue = false;
        spiderman.isHeroKind = true;

        hawk.name = "Hawk";
        hawk.attackPower = 20;
        hawk.isTurningIntoStatue = false;
        hawk.isHeroKind = true;
        
        System.out.println("=== Полуфінал: Superman VS Spiderman ===");
        SuperHero semiFinalWinner = fight(superman, spiderman);

        System.out.println(">>> Переможець відпочиває перед фіналом...");
        semiFinalWinner.rest(5);

        System.out.println("=== Фінал: " + semiFinalWinner.name + " VS Hawk ===");
        SuperHero champion = fight(semiFinalWinner, hawk);

        System.out.println("\n🏆 Переможець турніру: " + champion.name + "!");
        System.out.println("Статистика після бою");
        superman.showStats();
        spiderman.showStats();
        hawk.showStats();


    }

    public static SuperHero fight(SuperHero h1, SuperHero h2) {
        int round = 1;
        while (h1.isAlive() && h2.isAlive()) {
            System.out.println("-- Раунд " + round + " --");
            h1.attack(h2);
            if (!h2.isAlive()) break;

            h2.attack(h1);
            if (!h1.isAlive()) break;

            round++;
        }

        h1.showStats();
        h2.showStats();

        return h1.isAlive() ? h1 : h2;

    }

}




