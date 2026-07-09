public class xpowern {
    public static int  calcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpowerm1=calcPower(x,n-1);
        int xpown=x*xpowerm1;
        return xpown;
    }
    public static void main(String[]args){
        int x=2,n=5;
        int ans=calcPower(x,n);
        System.out.print(ans);
    }
}
