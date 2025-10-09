import java.util.*;
class demo1 {
    int kg;
    int g;
    void read(int a,int b){
        kg=a;
        g=b;
    }
    void display(){
        System.out.println(kg+"kgs and "+g+"grams");
    }    
    void add(demo1 p,demo1 q){
        g=(p.g+q.g)%1000;
        kg=p.kg+q.kg+(p.g+q.g)/1000;
    }
}

class weight{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int w=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        demo1 d1= new demo1();
        demo1 d2=new demo1();
        d1.read(w,x);
        d2.read(y,z);
        demo1 d3=new demo1();
        d3.add(d1,d2);
        d3.display();
    }
}
