
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
//same method with different properties
class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");

    }
}
    class PolyDemo{

        public static void main(String[] args) {
            Animal animal=new Dog();
//            Dog dog=new Dog();
           animal.animalSound();
        }
    }
