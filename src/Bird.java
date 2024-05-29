public abstract class Bird extends Animal {

    public Bird(String name, int size,boolean isCarnivorous, int pawNumber) {
        super(name, size, isCarnivorous,pawNumber);
    }
        public abstract void fly();
    }
