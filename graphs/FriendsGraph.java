public class FriendsGraph {

    static String[] names = {"Rithanya", "Magizhini", "Mithran"};
    
    static int[][] adj = {
        {0, 1, 1},  
        {0, 0, 0},  
        {0, 0, 0}   
    };

    static void printFriends(int node) {
        System.out.println("Friends of " + names[node] + " :");
        for (int i = 0; i < 3; i++) {
            if (adj[node][i] == 1) {
                System.out.println(names[i]);
            }
        }
    }

    public static void main(String[] args) {
        printFriends(0); // Rithanya
    }
}