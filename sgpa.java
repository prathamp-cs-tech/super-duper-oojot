import java.util.*;
class Student{
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
        for(int i=0;i<subno;i++){
        System.out.println("Enter credits:");
        credits[i]=sc.nextInt();
        System.out.println("Enter marks:");
        marks[i]=sc.nextInt();
        }
    }
    void disdetail(){
        System.out.println(usn);
        System.out.println(name);
        for (int i=0;i<subno;i++){
            System.out.println("Credits:"+credits[i]+","+"Marks:"+marks[i]);
        }
    }   
    void calc(){
        int totalcredits=0;
        int totalpoints=0;
        for(int i=0;i<subno;i++){  
            totalcredits=totalcredits+credits[i];
            if(marks[i]>=90){
                totalpoints=totalpoints+(10*credits[i]);
            }
            else if(marks[i]>=80){
                totalpoints=totalpoints+(9*credits[i]);
            }
            else if(marks[i]>=70){
                totalpoints=totalpoints+(8*credits[i]);
            }
            else if(marks[i]>=60){
                totalpoints=totalpoints+(7*credits[i]);
            }
            else if(marks[i]>=50){
                totalpoints=totalpoints+(6*credits[i]);
            }
            else if(marks[i]>=40){
                totalpoints=totalpoints+(5*credits[i]);
            }
            else{
                totalpoints=totalpoints+(0*credits[i]);
            }
        }
        float sgpa=(float)totalpoints/totalcredits;
        System.out.println("SGPA is:"+sgpa);
    }

}
class sgpa{
    public static void main(String[] args) {
        int j=100;
        Student s=new Student();
        while(j!=0){
            System.out.println("Enter number: 1.Enter, 2.Display 3.Calculate sgpa 4.exit");
            Scanner sc=new Scanner(System.in);
            j=sc.nextInt();
            if (j==1){
                s.entdetail();
            }
            else if(j==2){
                s.disdetail();
            }
            else if(j==3){
                s.calc();
            }
            else if(j==4){
                break;
            }
            else{
                System.out.println("Invalid input");
            }
        }
    }
    


}