public class Animal {

    protected String name;
    protected int size;
    protected boolean isCarnivorous = false;
    protected int pawNumber;

    public Animal (String name,int size, boolean isCarnivorous, int pawNumber){
        this.name = name;
        this.size = size;
        this.isCarnivorous = isCarnivorous;
        this.pawNumber = pawNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isCarnivorous() {
        return isCarnivorous;
    }

    public void setCarnivorous(boolean carnivorous) {
        isCarnivorous = carnivorous;
    }

    public int getPawsNbr() {
        return this.pawNumber;
    }

    public void setPawsNbr(int pawsNbr) {
        this.pawNumber = pawNumber;
    }

    public String introduce() {
        String statutCarnivorous = isCarnivorous?"Carnivorous":"Not Carnivorous";
       return "Hey, en tant que " + this.name + ", j’ai " + this.pawNumber + " pattes et je suis " + statutCarnivorous;

    }

    public String isDangerous() {
        boolean isDangerous = false;
        if (getSize() > 50 && this.isCarnivorous) {
            return "Je suis dangereux";
        } else {
            return "Je ne suis pas dangereux";
        }
    }
    }


