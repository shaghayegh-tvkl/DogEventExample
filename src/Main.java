public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyDog myDog = new MyDog();

        Dog dog = new Dog(" Your Dog", myDog);
        Responder responder = new Responder("Human");
        dog.addListener(responder);


        myDog.setThirsty(true);
        myDog.setHungry(true);
        myDog.setThirsty(false);
        myDog.setHungry(false);

    }
}