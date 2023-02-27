package Lab12.lab12x6;

public class review {
    public static int giaithua(int x){
        int s = 1;
        for(int i = x; i > 0; i--){
            s =s*i;
        }
        return s;
    }

    public static void main(String[] args){
        System.out.println(giaithua(5));
    }
}
