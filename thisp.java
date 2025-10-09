class demo{
    int x=20;
    int y=10;
    void read(int x,int y){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println("x="+x+","+"y="+y);
    }
}

public class thisp {
    public static void main(String args[]){
        demo d = new demo();
        d.read(10,20);
        d.display();
    }
    
}
