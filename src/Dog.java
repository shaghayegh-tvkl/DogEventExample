import java.util.HashSet;

public class Dog {

    public Thread dogLife = new Thread(){
        public void run() {
            if (myDog.isHungry())
                fireHungryEvent();
            if (myDog.isThirsty())
                fireThirstyEvent();
        }
    };

    private MyDog myDog;
    private HashSet<DogListener> listeners;
    private String name;

    public Dog(String name, MyDog myDog) {
        this.name = name;
        this.myDog = myDog;

        listeners = new HashSet<>();
        dogLife.start();
    }

    public String getName() {
        return name;
    }

    public synchronized void addListener(DogListener listener){
        listeners.add(listener);
    }

    public void fireHungryEvent(){
        System.out.println("Dog is Hungry .. ");
        DogEvent event = new DogEvent(this);
        for(DogListener listener: listeners){
            listener.dogHungry(event);
        }
    }

    public void fireThirstyEvent(){
        System.out.println("Dog is Thirsty .. ");
        DogEvent event = new DogEvent(this);
        for(DogListener listener: listeners){
            listener.dogThirsty(event);
        }
    }
}
