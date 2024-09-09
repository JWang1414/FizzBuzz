public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int input = 100;
        while(input > 0){
            if(input % 2 == 0){
                input = input/2;
            } else {
                input--;
            }
            System.out.println(input);
            steps++;
        }
        System.out.println(steps);
    }
}
