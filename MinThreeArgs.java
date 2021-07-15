public class MinThreeArgs {
    public static void main(String[] args) {
        int[] num = new int[] {10,20,5};
        int min = num[0];
        for (int i=0; i<num.length; i++){
            if(num[i] < min){
                min = num[i];
            }
        }
        System.out.println(min);

    }
}
