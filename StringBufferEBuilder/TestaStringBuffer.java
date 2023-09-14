package StringBufferEBuilder;

public class TestaStringBuffer {
    public static void main(String[] args) {
        new Thread(t1).start();
        new Thread(t2).start();

    }
    private static Runnable t1 = new Runnable() {
        @Override
        public void run() {
            StringBuffer sb = new StringBuffer("Thread 1: ");
            for(int i = 0; i < 10; i++) {
                sb.append(i);
                System.out.println(sb);
            }
        }
    };
    private static Runnable t2 = new Runnable() {
        @Override
        public void run() {
            StringBuffer sb2 = new StringBuffer("Thread 2: ");
            for(int j = 0; j < 10; j++) {
                sb2.append(j);
                System.out.println(sb2);
            }
        }
    };
}
