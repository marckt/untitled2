import java.util.Random;
class Javarush extends B {
    public Javarush(String randname) {
        super(randname);
    }
    public static void main(String[] args) {

        long timeStart = System.currentTimeMillis();
       onCreate(100000);


        System.out.println(System.currentTimeMillis()-timeStart);
    }

}

class  B {
    String name;
    int age;

    public B(String randname) {
        this.name = randname;
        this.age = new Random().nextInt(100);
    }

    private int move2end(int age) {
        return age < 3 ? 0 : (age < 18) ? 1 : (age < 50) ? 2 : 3;
    }

    public void pass() {

        switch (move2end(age)) {
            case 0:
                System.out.println(name + " to young1");
                break;
            case 1:
                System.out.println(name + " less then 18");
                break;
            case 2:
                System.out.println(name + " from 18 to 50");
                break;
            case 3:
                System.out.println(name + " too old");
                break;

        }
    }
    public static void onCreate(int count) {
        for (int i = 0; i < count; i++)
            new B("name-" + Integer.toString(i)).pass();

    }
}