import java.util.*;
class demo2{
    int x;
    int y;
    void read(int a,int b){
        x=a;
        y=b;
    }
    void display(String m){
        System.out.println("Complex "+m+" = "+x+"+"+y+"i");
    }
    demo2 add1(demo2 p){
        demo2 c3= new demo2();
        c3.x=x+p.x;
        c3.y=y+p.y;
        return c3;
    }
    void add2(demo2 p,demo2 q){
        x=p.x+q.x;
        y=p.y+q.y;
    }
    void add3(demo2 p,demo2 q){
        q.x=x+p.x;
        q.y=y+p.y;
    }
}

class complex{
    public static void main(String args[]){
        demo2 c1= new demo2();
        demo2 c2= new demo2();
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        int f=sc.nextInt();
        int g=sc.nextInt();
        int h=sc.nextInt();
        c1.read(e,f);
        c2.read(g,h);
        c1.display("C1");
        c2.display("C2");
        demo2 c3;
        c3=c1.add1(c2);
        c3.display("C3");
        c3=c2.add1(c1);
        c3.display("C4");
        demo2 c4= new demo2();
        c4.add2(c1,c2);
        c4.display("C5");
        demo2 c5= new demo2();
        c1.add3(c2,c5);
        c5.display("C6");
    }
}

