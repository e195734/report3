package jp.ac.uryukyu.ie.e195734;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
    LivingThing(String name,int hitPoint,int attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public int getHitPoint(){
        return this.hitPoint;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    public boolean getIsDead(){return dead;}

    public void setIsDead(boolean isDead){
        this.dead = isDead;
    }

    public String getName(){return name;}

    public void setName(String name){
        this.name = name;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack){
        this.attack = attack;
    }
    public void attack(LivingThing opponent){
        if(getIsDead() == false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        this.hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}