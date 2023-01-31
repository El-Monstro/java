import java.util.Date;
public class Program {
    public static void main(String args[]) {
        Pinguin pinguin = new Pinguin("Шкипер", new Date(2023, 1, 1), Env.ICE, Food.FISH);

        System.out.println(pinguin.getName());
        System.out.println(pinguin.getDateB());
    }
}

