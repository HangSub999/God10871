package SungJon_Test.InstanceTest;

public class Stusent {
    private String name;
    private Subject subject;

    public Stusent(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }


    public String getName() {
        return this.name;
    }

    public Subject getSubject() {
        return subject;
    }


}
