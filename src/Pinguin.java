import java.util.Date;
public class Pinguin extends Animal {
    Food food = Food.FISH;
    Env env = Env.ICE;
    public Pinguin(String name, Date dateB, Env env, Food food) {
        super (name, dateB, env, food);
    }

    @Override
    public void move() {
        System.out.println(this.name + " пошагал");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " поел");
    }
}

