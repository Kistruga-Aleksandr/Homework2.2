public class RavenclawStudent extends Student {//Ravenclaw
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public RavenclawStudent(String firstName, String lastName, int conjure, int transgress, int smart, int wise, int witty, int creativity) {
        super(firstName, lastName, conjure, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}
