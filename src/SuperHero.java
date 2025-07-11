public class SuperHero {
    int healthPoints = 100;
    int attackPower;
    boolean isTurningIntoStatue;
    boolean isHeroKind;
    String name;

    public void attack(SuperHero opponent) {
        if (isTurningIntoStatue || healthPoints <= 0) {
            return;
        }
        System.out.println("SuperHero " + this.name + "  атакує і завдає " + attackPower + " очок ушкоджень ");
        opponent.takeDamage(attackPower);
    }

    public void takeDamage(int damage) {
        /*    System.out.println("SuperHero " + this.name + "  receives " + damage); */
        healthPoints -= damage;
        System.out.println("SuperHero " + this.name + "  має  залишок " + healthPoints + " очок здоров'я ");
        if (healthPoints <= 0) {
            turningIntoStatue();
        }
    }

    public void rest(int seconds) {
        if (isTurningIntoStatue || healthPoints <= 0) {
            System.out.println("SuperHero " + this.name + " не може відпочивати — він уже статуя або мертвий.");
            return;
        }
        int healed = seconds * 2;
        healthPoints += healed;
        if (healthPoints > 100) healthPoints = 100;
        System.out.println("SuperHero " + this.name + " rests for " + seconds + " seconds and restores " + healed + " HP.");
    }

    public void turningIntoStatue() {
        if (healthPoints == 0) {
            isTurningIntoStatue = true;
            System.out.println("SuperHero " + this.name + "  turns on a statue!");
            System.out.println("Game is over!!!");
        }
    }

    public boolean isAlive() {
        return !isTurningIntoStatue && healthPoints > 0;
    }

    public void showStats() {
        System.out.println("   Health: " + this.name + " has " + healthPoints);

    }
}
