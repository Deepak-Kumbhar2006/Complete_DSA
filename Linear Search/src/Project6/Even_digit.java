package Project6;

public class Even_digit {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(digits(0));
        System.out.println(finNumbers(nums));
    }
    static int finNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int NumberofDigit = digits(num);
        return NumberofDigit % 2 == 0;
    }
    static int digits(int num){
        if(num < 0){
            num = num*-1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num = num/10; // num /= 10
        }
        return count;
    }
}
