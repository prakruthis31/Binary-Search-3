public class Powxn {
    
    public double myPow(double x, int n) {
        double re =  1.0;
        if(n<0){
            x= 1/x;
            n *= -1;
        }
        while(n!=0){
            if(n%2!=0){
                re = re *x;
            }
            x= x*x;
            n = n/2;
        }
        return re;
    }
}
