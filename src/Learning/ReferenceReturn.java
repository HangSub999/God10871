package Learning;

public class ReferenceReturn {
    public static void main(String[] args) {
        ReferenceReturn re = new ReferenceReturn();
        System.out.println(re.intReturn());
        System.out.println(re.intArrayReturn());
        System.out.println(re.seringReturn());
    }

    public int intReturn() {
        int returnInt = 0;
        return returnInt;
    }

    public int[] intArrayReturn() {
        int[] returnArray = new int[10];
        return returnArray;
    }

    public String seringReturn() {
        String returnString = "rerererere";
        return returnString;
    }
}
