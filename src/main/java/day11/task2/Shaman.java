package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack{

    static final int HEALTH_HIMSELF = 50;
    static final int HEALTH_TEAMMATE = 30;

    public Shaman(){
        physAtt = 10;
        magicAtt = 15;
        physDef = 0.2;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health + HEALTH_HIMSELF > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += HEALTH_HIMSELF;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEALTH_TEAMMATE > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += HEALTH_TEAMMATE;
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackScore = magicAtt * (1 - hero.magicDef);
        if (hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
