class Animal {
    public void makeSound() {
        System.out.println("Grr...");
    }
}

/* La clase Cat y Dog extienden de Animal */

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}


class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}


/* Se aplico polimorfismo */

