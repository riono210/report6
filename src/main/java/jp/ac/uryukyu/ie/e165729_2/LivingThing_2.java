package jp.ac.uryukyu.ie.e165729_2;

/**
 * Created by e165729 on 2017/01/15.
 */
abstract class LivingThing_2 {
    private String name;
    private int hitPoint;
    private int magicPoint;
    private int attack;
    private int speed;
    private boolean dead;

    public LivingThing_2(String name, int maximumHP, int maximumMP, int attack, int speed) {
        this.name = name;
        hitPoint = maximumHP;
        magicPoint = maximumMP;
        this.attack = attack;
        this.speed = speed;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSpeed() { return speed;}

    public void attack(LivingThing_2 opponent) {
        // 死んでいない時
        if (dead == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", this.name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    // 魔法
    public void magic(LivingThing_2 opponent) {
        if (dead == false && opponent.dead == false) {
            if (magicPoint > 0) {
                magicPoint--;
                int damage = (int) (Math.random() * ((attack + hitPoint) * 0.9));
                System.out.printf("%sは魔法を唱えた!%sに%dのダメージを与えた!\n", name, opponent.getName(), damage);
                opponent.wounded(damage);
            } else {
                System.out.printf("ミス! %sはMPが足りない!\n", name);
            }
        }
    }

    // ダメージ計算
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint <= 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    // 逃げる
    public void escape(LivingThing_2 oppoent) {
        if (oppoent.dead == false) {
            this.dead = true;
        }
    }

    abstract public int command(LivingThing_2 opponent, int deci);

}

