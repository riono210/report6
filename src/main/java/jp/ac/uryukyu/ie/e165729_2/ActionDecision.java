package jp.ac.uryukyu.ie.e165729_2;

/**
 * Created by e165729 on 2017/01/16.
 */

// LivingThing.commandの引数をまとめたクラス
public class ActionDecision  {
    private LivingThing_2 opponent;
    private int command;
    private int agility;

    public ActionDecision(LivingThing_2 opponent, int  command, int agility){
        this.opponent = opponent;
        this.command = command;
        this.agility = agility;
    }


    public LivingThing_2 getOpponent(){ return opponent;}
    public int getCommand() { return command;}
    public int getAgility(){ return agility;}
}
