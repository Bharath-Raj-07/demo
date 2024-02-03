import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        Object[] array1 = new Object[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+"th element");
            array1[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            System.out.println("Array "+(i+1)+"=> "+array1[i]);
        }
        /*ArrayList<Object> newlist = new ArrayList<>();
        for(int j=0;j<n;j++){
            newlist.add(sc.next());
        }
        System.out.println(newlist);*/
    }
}