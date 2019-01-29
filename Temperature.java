
public class Temperature {
    public static void temp(int minF,int maxF,int step){
        for(int i=minF;i<=maxF;i=i+step){
            int cel=(int)((5.0/9)*(i-32));
            System.out.println(i +" " +cel);
        }
    }
    public static void main(String[] args) {
        int minF=0;
        int maxF=100;
        int step=20;
        Temperature obj=new Temperature();
        obj.temp(minF,maxF,step);
    }
}
