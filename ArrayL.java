import java.util.*;
public class ArrayL{
    ArrayList<String> list = new ArrayList<String>();
    public void display(){
        list.add("CSE");
        list.add("ISE");
        list.add("ME");
        System.out.println("array elements are");
       System.out.println(list);
       System.out.println("");

    }
    public void appendatend(){
        System.out.println("enter the string to append at end");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        list.add(str);
        System.out.println(list);
        System.out.println("");
    }
    public void insertat(){
        System.out.println("Enter the position and element to be inserted");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        String str = sc.next();
        list.add(pos,str);
        System.out.println(list);
        System.out.println("");
    }
    public void searchele(){
        System.out.println("Enter the element to be searched");
        Scanner sc = new Scanner(System.in);
        String strsea = sc.next();
        int pos = list.indexOf(strsea);
        if(pos < 0){
            System.out.println("not found");
        }
        else{
            System.out.println("Element found "+pos);
        }
    }
    void print(){
        System.out.println("Enter the starting charecter ");
        Scanner sc = new Scanner(System.in);
        char alpha= sc.next().charAt(0);
        String str = Character.toString(alpha) ;
        System.out.println("Strings starting with "+ alpha);
        for(int i =0 ; i<list.size();i++){
            if(list.get(i).startsWith(str)){
                System.out.println(list.get(i));
            }
        }
    }
    public static void main(String[]args){
        ArrayL n = new ArrayL();
        n.display();
        n.appendatend();
        n.insertat();
        n.searchele();
        n.print();
    }
}
