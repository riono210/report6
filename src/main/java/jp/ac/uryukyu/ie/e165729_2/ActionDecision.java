package jp.ac.uryukyu.ie.e165729_2;

/**
 * Created by e165729 on 2017/01/16.
 */
public class ActionDecision  {
    private LivingThing_2 opponent;
    private int command;
    private int speed;

    public ActionDecision(LivingThing_2 opponent, int  command, int speed){
        this.opponent = opponent;
        this.command = command;
        this.speed = speed;
    }


    public LivingThing_2 getOpponent(){ return opponent;}
    public int getCommand() { return command;}
    public int getSpeed(){ return speed;}
}
