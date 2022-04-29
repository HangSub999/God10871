package FastCampus.Data_structure;

public class MyHash {
    public Slot[] hashTable;

    public MyHash(Integer size) {
        this.hashTable = new Slot[size];
    }

    public class Slot {
        public String value;

        public Slot(String value) {
            this.value = value;
        }

        public int hashFunc(String key) {
            return (int) (key.charAt(0));
        }
    }
}
