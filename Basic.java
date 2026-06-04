public class Basic {
    static int N=4 , count = 0;
    static boolean [] cols = new boolean[4], d1 = new boolean[8], d2 = new boolean[8];
    static void solve(int r){
        if(r==N){
            count++;
            return;
        }
        for(int c=0;c<N;c++){
            if(cols[c] || d1[r+c] || d2[r-c+N-1]) continue;
            cols[c] = d1[r+c] = d2[r-c+N-1] = true;
            solve(r+1);
            cols[c] = d1[r+c] = d2[r-c+N-1] = false;
        }
    }
    public static void main(String[] args) {
        solve(0);
        System.out.println(count);
    }
}
