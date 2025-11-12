package pack.cie;

public class Personal {
    public String usn;
    public String name;
    public int sem;

    public Personal(String u, String n, int s) {
        usn = u;
        name = n;
        sem = s;
    }

    public void display() {
        System.out.println("USN: " + usn + ", Name: " + name + ", Sem: " + sem);
    }
}