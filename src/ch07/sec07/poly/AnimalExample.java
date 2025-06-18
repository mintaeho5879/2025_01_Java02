package ch07.sec07.poly;

public class AnimalExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Cow cow = new Cow();
        Dog dog = new Dog();
        BullDog bullDog = new BullDog();

        animalCrying(cat);
        animalCrying(tiger);
        animalCrying(cow);
        animalCrying(dog);
        animalCrying(bullDog);
        //월~ 월~
        //불독이 점프점프.
    }
    public static void animalCrying(Animal animal){
        animal.crying();
        //Dog 객체 넘어오면 jump 메소드 호출해주세요.
        //1. jump() 메소드를 호출하려면 타입이 Dog가 되어야 한다.
        //2. Dog 객체가 들어왔을 때만 Dog 타입으로 형변환을 해야한다.
        if(animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.jump();
        }

    }

}
