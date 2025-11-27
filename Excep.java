import java.util.Scanner;

class WrongAge extends Exception{
    public WrongAge(String a){
        super(a);
    }
}

class Father{
    int agef;
    public Father(int af) throws WrongAge{
        if (af<18){
            throw new WrongAge("Father's age can't be below 18");
        }
        agef=af;
    }
}
class Son extends Father{
    int ages;
    public Son(int af, int as) throws WrongAge{
        super(af);
        if (agef<=as){
            throw new WrongAge("Son's age is always less than Father's");
        }
        ages=as;
    }
}
public class Excep1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int as,af;
            System.out.print("Enter Father's age: ");
            af=sc.nextInt();
            System.out.print("Enter Son's age: ");
            as=sc.nextInt();
            Son s=new Son(af,as);
            System.out.println("Father's age: "+s.agef+" Son's age: "+s.ages);
        } catch (WrongAge e) {
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
