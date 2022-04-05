package FastCampus;

public class Tomas {
    public int rudder;
    public int weight;
    public String gender;
    public String name;
    public int age;

    public Tomas(int rudder, int weight, String gender, String name, int age) {
        this.rudder = rudder;
        this.weight = weight;
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public String output() {
        return "키가 " + rudder + " 이고 몸무게가 " + weight + "킬로인 남성이 있습니다. 이름은 " + name + " 이고 나이는 "
                + age + "세입니다.";
    }
}
