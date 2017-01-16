package jp.ac.uryukyu.ie.e165729_2;

import java.util.Collection;
import java.util.Comparator;

/**
 * Created by e165729 on 2017/01/16.
 */
public class OrderComparator implements Comparator<ActionDecision>{
    public int compare(ActionDecision actionDecision1, ActionDecision actionDecision2){
        return actionDecision2.getSpeed() - actionDecision1.getSpeed();
    }
}