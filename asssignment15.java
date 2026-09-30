class Animal {
    @Override
    public String toString() {
        return "This is an Animal";
    }
}

class Dog extends Animal {
    @Override
    public String toString() {
        return "This is a Dog";
    }
}

class Cat extends Animal {
    @Override
    public String toString() {
        return "This is a Cat";
    }
}

class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        System.out.println(a1);
        System.out.println(a2);
    }
}
