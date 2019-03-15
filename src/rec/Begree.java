package rec;

public class Begree {
    public static void main(String[] args){
        System.out.println(pow(10,3));
    }
    public static int pow(int a, int e) {
        if (e == 0) {
            return 1;
        }
        int t = pow(a, e / 2);
        return (e % 2 != 0 ? a : 1) * t * t;
    }
}
