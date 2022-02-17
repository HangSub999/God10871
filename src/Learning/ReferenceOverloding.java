package Learning;

public class ReferenceOverloding {
    public static void main(String[] args) {
        ReferenceOverloding ro = new ReferenceOverloding();
    }

    public void print(int data) {

    }

    public void print(String data) {

    }

    public void print(int intData, String stringData) {

    }

    public void print(String stringData, int intData) {

    }
}
