import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Animal lion = new Animal ("Lion",51,true,4);
        Animal parrots = new Animal ("Perroquet",7,false,2);

        System.out.println(lion.introduce()+" "+lion.isDangerous());
        System.out.println(parrots.introduce()+" "+parrots.isDangerous());

        }
}
