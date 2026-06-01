public class TaskScheduling {
    public static int gcd(int a, int b){
        while(b!= 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a ,int b){
        return (a*b) / gcd(a,b);
    }
    
    public static void main(String[] args){
        // int taskA = 15;
        // int taskB = 25;
        // System.out.println("Both tasks complete together after : " + lcm(taskA,taskB) + " seconds ");

        int result = lcm(12,18);
        result = lcm(result, 30);
        System.out.println("All server refresh together after : " + result + " seconds ");
    }
}