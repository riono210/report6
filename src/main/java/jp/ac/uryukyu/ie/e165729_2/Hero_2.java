package jp.ac.uryukyu.ie.e165729_2;

/**
 * Created by e165729 on 2017/01/15.
 */
public class Hero_2 extends LivingThing_2 {

    public Hero_2(String name, int maximumHP, int maximumMP, int attack, int speed) {
        super(name, maximumHP, maximumMP, attack, speed);

    }

    @Override
    public void attack(LivingThing_2 opponent) {
        // 死んでいない時
        if (isDead() == false) {
            int damage = (int) (Math.random() * getAttack());

            // 会心の一撃の確率
            int critical = (int) (Math.random() * 10);
            if (damage == 0) {
                System.out.printf("%sの攻撃！...だが、%sは攻撃を回避した！\n", getName(), opponent.getName());
            } else if (critical >= 7) {
                damage = damage * 2;
                System.out.printf("%sの攻撃！会心の一撃！！%sに%dのダメージを与えた！！\n",getName(), opponent.getName(), damage);
                opponent.wounded(damage);
            } else {
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
                opponent.wounded(damage);
            }
        }
    }

    // コマンド
    public void command(LivingThing_2 opponent, int deci){

        if (deci == 0){
            attack(opponent);
        }else if(deci == 1){
            magic(opponent);
        }else if (deci == 2) {
            escape(opponent);
        }
    }

}
