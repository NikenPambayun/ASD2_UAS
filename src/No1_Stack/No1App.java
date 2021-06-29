package No1_Stack;
public class No1App {
    public static void main (String[] args){
        No1 tumpukan = new No1(10);
        tumpukan.push(6);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(30);
        tumpukan.baca();
        System.out.println(" ");
        long nilai1 = tumpukan.peek();
        System.out.println("nilai teratas = "+ nilai1);
        System.out.println("Nama saya adalah RR. Niken Pambayun Dyah Setyawati");
        long nilai0 = tumpukan.pop();
        System.out.println("nilai yang dihapus = "+ nilai0);
        tumpukan.baca();
        System.out.println(" ");
        System.out.println(" ");
        tumpukan.push(40);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println(" ");
    }
}
