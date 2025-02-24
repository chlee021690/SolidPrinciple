package isp.before;

public interface IPet {
    public boolean isFriendly();
    public boolean getName();
    public void bark(); // this is the problem. Cat does not bark at all.
}
