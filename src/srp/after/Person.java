package srp.after;

public class Person {

    private Bathroom bathroom;

    public Person(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    public void wakeUp() {
        System.out.println("Waking up at morning");
    }

    public void doBathroomActivity(){
        bathroom.goToBathroom();
        bathroom.washFace();
        bathroom.brushTeeth();
        bathroom.washHair();
        bathroom.dryOff();
        bathroom.leaveBathroom();
    }


}
