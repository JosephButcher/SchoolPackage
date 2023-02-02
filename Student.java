package School;

public class Student {
    private static int nextID = 1000;
    private String name;
    private int IDnum;

    public Student(String name, int IDnum){
        this.name = name;
        this.IDnum = IDnum;
    }

    public Student(String name) {
        this.name = name;
        this.IDnum = nextID;
        this.nextID++;
    }

    public void nameChange(String newName) {
        this.name = newName;
    }

    public boolean IDorder(Student otherstudent) {
        if (this.IDnum < otherstudent.IDnum)
            return true;
        else {
            return false;
        }
    }

    public String toString() {
        return name + " has account " + IDnum;
    }
}
