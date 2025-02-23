package srp.after;

public class Morning {
    private Person person;

    public Morning(Person person) {
        this.person = person;
    }

    public void startActivity(){
        person.wakeUp();
        person.doBathroomActivity();
    }
}
