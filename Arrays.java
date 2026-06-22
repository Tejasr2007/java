public class Arrays {
    public static void main(String[] args) {
        int age=20;
        double height=1.674d;
        String Name = "Pranay";
        char Blood = 'O';
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        int even_num[]=new int[5];
        int count=0;
        int odd_num[]=new int[5];
        int count_odd=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==0)
            {
                even_num[count]=numbers[i];
                count+=1;
            }
            else
            {
               odd_num[count]=numbers[i];
                count_odd+=1;
            }
        }
    }
}