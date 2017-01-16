package jp.ac.uryukyu.ie.e165729_2;

import java.util.Comparator;

/**
 * Created by e165729 on 2017/01/16.
 */
// 設定されたagilityの大きい順にソート
public class CaracterComparator implements Comparator<LivingThing_2>{
    public int compare(LivingThing_2 liv1, LivingThing_2 liv2){
        return liv2.getAgility() - liv1.getAgility();
    }

}

