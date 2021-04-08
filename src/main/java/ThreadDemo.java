public class ThreadDemo {
    
    private static int counter = 0;
    public static void main(String[] args) {
        work();
    }

    private static void work() {
        System.out.println("第"+ counter++ +"zhi zhu");
        work();;
    }
}
