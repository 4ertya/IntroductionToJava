package decomposition;

public class Task1_7 {
    public static void main(String[] args) {
        Task1_7 task1_7 =new Task1_7();
        System.out.println(task1_7.sumOfFactorialsFrom1To9());
    }

    public int sumOfFactorialsFrom1To9(){
        int sum=0;
        for (int i = 1; i < 10; i++) {
            sum=sum+factorial(i);
        }
        return sum;
    }
    public int factorial(int x){
        int factorial=1;
        for (int i = 1; i <=x ; i++) {
            factorial=factorial*i;
        }
        return factorial;
    }
}
