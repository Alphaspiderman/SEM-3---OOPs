package Lab_9;

public class L9_Q1 {
    public static void main(String[] args) {
        Tables t5 = new Tables(5);
        Tables t7 = new Tables(7);
        
        t5.start();
        try {
            t5.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        t7.start();
    }
}

class Tables extends Thread{
    int num;
    
    public void run(){
        System.out.println("Multiplication table for " + num + " -");
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
    }

    Tables(int n){
        num = n;
    }
}