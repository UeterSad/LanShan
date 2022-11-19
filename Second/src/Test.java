public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog("旺财",true,"黄色");
        dog.talk();
        dog.eat();
        dog.hunt();
        System.out.println("===============");
        Cat cat=new Cat("凯西",false,3.1);
        cat.talk();
        cat.eat();
        cat.climb();
    }
}
