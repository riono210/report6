package jp.ac.uryukyu.ie.e165729_2;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by e165729 on 2017/01/15.
 */
public class Main_2 {
    public static void main(String[] args) {
        // 行動順配列
        LivingThing_2[] live= new LivingThing_2[2];
        ActionDecision[] ac = new ActionDecision[2];
        Hero_2 hero2 = new Hero_2("勇者", 10, 3, 5, 4);
        Enemy_2 enemy2 = new Enemy_2("スライム", 6, 1, 3, 3);

        System.out.printf("%s vs. %s\n", hero2.getName(), enemy2.getName());

        int turn = 0;
        while (hero2.isDead() == false && enemy2.isDead() == false) {
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            System.out.println("勇者はどうする?\n0:こうげき　1:まほう　2:にげる\n");
            Scanner com = new Scanner(System.in);
            int fa = com.nextInt();
            int eneCom = (int) (Math.random() * 10);

            live[0] = hero2;
            live[1] = enemy2;

            ac[0] = new ActionDecision(enemy2, fa, hero2.getSpeed());
            ac[1] = new ActionDecision(hero2, eneCom, enemy2.getSpeed());

            Arrays.sort(live, new CaracterComparator());
            Arrays.sort(ac, new OrderComparator());

            for (int i = 0; i <=1; i++){
                live[i].command(ac[i].getOpponent(),ac[i].getCommand());
            }

        }
            System.out.println("戦闘終了");
    }
}

