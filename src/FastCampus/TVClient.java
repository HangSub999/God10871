package FastCampus;

public class TVClient {
    public static void main(String[] args) {
        SamsungTV samsungTV = new SamsungTV();

        samsungTV.powerOn();
        samsungTV.volumeUp();
        samsungTV.volumeDown();
        samsungTV.powerOff();
      
    }
}
