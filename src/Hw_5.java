public class Hw_5 {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(450);
        boss.setDamage(60);
        boss.setDefenceType("Shield");
        //
        System.out.println("Boss Info: ");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenceType());
        //
        Hero[] heroes = createHeroes();
        System.out.println("Heroes info:");
        for (Hero hero:heroes){
            System.out.println("Health: " + hero.getHealth() + " Damage: " + hero.getDamage() +
                    (hero.getSuperAbility()!= null ?", Super ability: " + hero.getSuperAbility(): ""));
        }

    }
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(300, 30, "Fireball");
        Hero hero2 = new Hero(230,20);
        Hero hero3 = new Hero(250, 25, "Healing");

        return new Hero[]{hero1, hero2, hero3};
}
}