public class Responder implements DogListener{

    String name;
    public Responder(String name){
        this.name = name;
    }

    @Override
    public void dogHungry(DogEvent event) {
        System.out.println("-- " + name + " comes!" + event.getSource().getName() + " is eating food .. ");
    }

    @Override
    public void dogThirsty(DogEvent event) {
        System.out.println("-- " + name + " comes!" + event.getSource().getName() + " is drinking water .. ");
    }

}