package School;

public class StudentTester {
    public static void main(String[] args) {
        Student joe = new Student("Joe", 12);
        System.out.println(joe);
        Student jose = new Student("Jose", 15);
        System.out.println(jose.IDorder(joe));
    }
}
