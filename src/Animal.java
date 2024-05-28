public class Animal {

    private String name;
    private int size;
    private boolean isCarnivorous = false;
    private int pawsNbr;

    public Animal (String name,int size, boolean isCarnivorous, int pawsNbr){
        this.name = name;
        this.size = size;
        this.isCarnivorous = isCarnivorous;
        this.pawsNbr = pawsNbr;
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
        return this.pawsNbr;
    }

    public void setPawsNbr(int pawsNbr) {
        this.pawsNbr = pawsNbr;
    }

    public String introduce() {
        String statutCarnivorous = isCarnivorous?"Carnivorous":"Not Carnivorous";
       return "Hey, en tant que " + getName() + ", j’ai " + getPawsNbr() + " pattes et je suis " + statutCarnivorous;

    }

    public String isDangerous() {
        if (getSize() > 50 && isCarnivorous()) {
            return "Je suis dangereux";
        } else {
            return "Je ne suis pas dangereux";
        }
    }
    }


