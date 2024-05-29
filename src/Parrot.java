public class Parrot extends Bird {
private boolean canTalk;

    public Parrot(String name, int size, boolean isCarnivorous,int pawNumber, boolean canTalk) {
        super(name, size,isCarnivorous, pawNumber);
        this.canTalk = canTalk;
    }

    public boolean isCanTalk() {
        return canTalk;
    }

    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }

    @Override
    public String introduce() {
        String talkStatus = canTalk ? "Je peux parler" : "Je ne peux pas parler ";
        return super.introduce() + " " + talkStatus;
    }

    @Override
    public void fly() {
        System.out.println("Le perroquet vole.");
    }
}

