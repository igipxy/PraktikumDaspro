import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input kelas lur:  ");
        String kelas = sc.nextLine();
        System.out.println("input sub kelas: ");
        String subkelas = sc.nextLine();
        
        if(kelas == "kelas 1"){
            if(subkelas == "a"){
                System.out.println();
            } else if (subkelas == "b") {
                System.out.println();
            }else{
                System.out.println();
            }
        }else{
            System.out.println("nuh uh");
        }
        


        sc.close();
    }
}