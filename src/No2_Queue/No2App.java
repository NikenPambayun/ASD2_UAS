package No2_Queue;
public class No2App {
    public static void main(String[] args){
                No2 antrian = new No2(5);
                antrian.enqueue(6);
                antrian.display();
                antrian.enqueue(60);
                antrian.display();
                System.out.println("nilai yang paling depan = "+ antrian.peek());
                System.out.println("Nama saya adalah RR. Niken Pambayun Dyah Setyawati");
                System.out.println("");
                antrian.enqueue(70);
                antrian.display();
                System.out.println("yang diambil dari antrian = "+ antrian.dequeue());
                antrian.display();
                System.out.println("nilai yang paling depan = "+ antrian.peek());
    }    
}
