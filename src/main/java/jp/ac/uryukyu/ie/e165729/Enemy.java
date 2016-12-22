package jp.ac.uryukyu.ie.e165729;

/**
 * Created by e165729 on 2016/11/17.
 */
public class Enemy extends LivingThing {

    public  Enemy(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);

    }

    @Override
    public void attack(LivingThing opponent) {
        if (isDead() == false) {
            int damage = (int) (Math.random() * getAttack());
            int critical = (int) (Math.random() * 10);
            if (damage == 0) {
                System.out.printf("%sの攻撃！...だが、%sは攻撃を回避した！\n", getName(), opponent.getName());
            } else if (critical >= 8) {
                damage = damage * 2;
                System.out.printf("%sの攻撃！痛恨の一撃！！%sに%dのダメージを与えた！！\n",getName(), opponent.getName(), damage);
                opponent.wounded(damage);
            } else {
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
                opponent.wounded(damage);
            }
        }

    }


}
