package jp.ac.uryukyu.ie.e165729_2;

/**
 * Created by e165729 on 2017/01/15.
 */
public class Enemy_2 extends LivingThing_2 {

    public  Enemy_2(String name, int maximumHP, int maximumMP, int attack, int speed) {
        super(name, maximumHP, maximumMP, attack, speed);
    }


    @Override
    public void attack(LivingThing_2 opponent) {
        // 死んでいない時
        if (isDead() == false) {
            int damage = (int) (Math.random() * getAttack());

            // 痛恨の一撃の確率
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

    // 敵の行動決定
    public void command(LivingThing_2 opponent, int deci){
        if (deci <= 4 ){
            attack(opponent);
        }else if(deci <= 6 ){
            magic(opponent);
        }else if (deci <= 8 && isDead()== false){
            System.out.printf("%sはじっとこちらを見ている。\n",getName());
        }else if (deci <= 10 && isDead() == false){
            escape(opponent);
        }
    }


}
