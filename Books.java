import java.util.*;
class Book {
    String name;
    String author;
    int price;
    int numPages;

    public Book() {
        name = "";
        author = "";
        price = 0;
        numPages = 0;
    }

    public Book(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public void set_name(String n){
        name=n;
    }

    public void set_aut(String n){
        author=n;
    }

    public void set_price(int n){
        price=n;
    }

    public void set_num(int n){
        numPages=n;
    }

    public String get_name(){
        return name;
    }

    public String get_auth(){
        return author;
    }

    public int get_price(){
        return price;
    }

    public int get_num(){
        return numPages;
    }

    public String toString() {
        return String.format("Name: %s, Author: %s, Price: %d, Pages: %d",
                name, author, price, numPages);
    }

}
class Books{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,p,np;
        String nm,au;
        n=sc.nextInt();
        Book[] b=new Book[n];
        for(int i=0;i<n;i++){
            nm=sc.next();
            au=sc.next();
            p=sc.nextInt();
            np=sc.nextInt();
            b[i]=new Book(nm,au,p,np);
        }
        for(int i=0;i<n;i++){
            System.out.println(b[i]);
        }
    }
}