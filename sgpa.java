import java.util.*;
class student{
    Scanner sc=new Scanner(System.in);
    String usn;
    String name;
    int[] credits;
    int[] marks;
    int subno;
    void entdetail(){
        usn=sc.nextLine();
        name=sc.nextLine();
        System.out.println("Enter number of subjects:");
        subno=sc.nextInt();
        credits=new int[subno];
        marks=new int[subno];
        for(int i=0;i<=subno;i++){
        System.out.println("Enter credits:");
        credits[i]=sc.nextInt();
        System.out.println("Enter marks:");
        marks[i]=sc.nextInt();
        }
    }
    void disdetail(){
        System.out.println(usn);
        System.out.println(name);
        System.out.println("Credits are:");
        for (int i=0;i<=subno;i++){
            System.out.println("credits:"+credits[i]+","+"marks:"+marks[i]);
    }
    void calc(){

    }

}
class sgpa{
    public static void main(String[] args) {
        int j=100;
        while(j!=0){
            System.out.println("Enter number: 1.Enter, 2.Display 3.Calculate sgpa 4.exit")
        }
    }
    


}