package dip.after;

public class Kid {
    public Toy toy;

    public Kid(Toy toyParam){
        toy = toyParam;
    }

    public String getToyName(){
        return toy.getName();
    }
}
