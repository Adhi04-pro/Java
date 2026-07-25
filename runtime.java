public class animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }

    public static class Dog extends animal {
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }
    }

    public static class Cat extends animal {
        @Override
        public void sound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        animal a = new animal();
        a.sound();

        a = new Cat();
        a.sound();

        a = new Dog();
        a.sound();
    }
}
