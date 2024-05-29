import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Lion Toto = new Lion("Lion", 51, 4, true, 4, true);
        Parrot parrot = new Parrot("Perroquet", 7, false, 2, true);

        System.out.println(Toto.introduce());
        System.out.println("Le lion est-il dangereux ? " + Toto.isDangerous());
        Toto.hunt();

        System.out.println(parrot.introduce());
        System.out.println("Le perroquet est-il dangereux ? " + parrot.isDangerous());
        parrot.fly();
    }
}
