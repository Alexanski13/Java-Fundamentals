package ExamPreparationFundamentals;

import java.util.*;

public class HeroesOfCodeAndLogicVII {
    static class Hero {
        String name;
        int hitPoints;
        int manaPoints;

        public Hero(String name, int hitPoints, int manaPoints) {
            this.name = name;
            this.hitPoints = hitPoints;
            this.manaPoints = manaPoints;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setHitPoints(int hitPoints) {
            this.hitPoints = hitPoints;
        }

        public void setManaPoints(int manaPoints) {
            this.manaPoints = manaPoints;
        }

        public String getName() {
            return name;
        }

        public int getHitPoints() {
            return hitPoints;
        }

        public int getManaPoints() {
            return manaPoints;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Hero> heroes = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] heroParameters = line.split(" ");
            Hero hero = new Hero(heroParameters[0], Integer.parseInt(heroParameters[1]), Integer.parseInt(heroParameters[2]));
            heroes.put(hero.getName(), hero);
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandParts = command.split(" - ");
            String commandName = commandParts[0];
            switch (commandName) {
                case "CastSpell":
                    handleCastSpell(heroes, commandParts[1], Integer.parseInt(commandParts[2]), commandParts[3]);
                    break;
                case "TakeDamage":
                    handleTakeDamage(heroes, commandParts[1], Integer.parseInt(commandParts[2]), commandParts[3]);
                    break;
                case "Recharge":
                    handleRecharge(heroes, commandParts[1], Integer.parseInt(commandParts[2]));
                    break;
                case "Heal":
                    handleHeal(heroes, commandParts[1], Integer.parseInt(commandParts[2]));
                    break;
            }
            command = scanner.nextLine();
        }
        for (Hero hero : heroes.values()) {
            System.out.println(
                    hero.getName() + System.lineSeparator()
                            + "  HP: " + hero.getHitPoints() + System.lineSeparator()
                            + "  MP: " + hero.getManaPoints());
        }
    }

    private static void handleHeal(Map<String, Hero> heroes, String heroName, int amount) {
        Hero hero = heroes.get(heroName);

        int oldHitPoints = hero.getHitPoints();
        int newHitPoints = Math.min(hero.getHitPoints() + amount, 100);
        hero.setHitPoints(newHitPoints);

        int amountRecovered = newHitPoints - oldHitPoints;
        System.out.println(hero.getName() + " healed for " + amountRecovered + " HP!");
    }

    private static void handleRecharge(Map<String, Hero> heroes, String heroName, int amount) {
        Hero hero = heroes.get(heroName);

        int oldManaPoints = hero.getManaPoints();
        int newManaPoints = Math.min(hero.getManaPoints() + amount, 200);
        hero.setManaPoints(newManaPoints);

        int amountRecovered = newManaPoints - oldManaPoints;
        System.out.println(hero.getName() + " recharged for " + amountRecovered + " MP!");
    }

    private static void handleTakeDamage(Map<String, Hero> heroes, String heroName, int damage, String attacker) {
        Hero hero = heroes.get(heroName);

        hero.setHitPoints(hero.getHitPoints() - damage);
        if (hero.getHitPoints() > 0) {
            System.out.println(hero.getName() + " was hit for " + damage + " HP by " + attacker + " and now has " + hero.getHitPoints() + " HP left!");
        } else {
            System.out.println(hero.getName() + " has been killed by " + attacker + "!");
            heroes.remove(heroName);
        }
    }

    private static void handleCastSpell(Map<String, Hero> heroes, String heroName, int manaPoints, String spellName) {
        Hero hero = heroes.get(heroName);

        if (hero.getManaPoints() >= manaPoints) {
            hero.setManaPoints(hero.getManaPoints() - manaPoints);
            System.out.println(hero.getName() + " has successfully cast " + spellName + " and now has " + hero.getManaPoints() + " MP!");
        } else {
            System.out.println(hero.getName() + " does not have enough MP to cast " + spellName + "!");
        }
    }
}