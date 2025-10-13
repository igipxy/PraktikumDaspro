import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("input kelas lur:  ");
            String kelas = sc.nextLine();
            System.out.println("input sub kelas: ");
            String subkelas = sc.nextLine();
            
            if(kelas.equals("kelas 1")){
                switch (subkelas) {
                    case "a" -> System.out.println();
                    case "b" -> System.out.println();
                    default -> System.out.println();
                }
            }else{
                System.out.println("nuh uh");
            }
        }
    }
}