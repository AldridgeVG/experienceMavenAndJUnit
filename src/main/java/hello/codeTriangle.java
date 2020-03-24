package hello;

public class codeTriangle {

    public boolean isTriangle(int a, int b,int c){
        if(a<=0||b<=0||c<=0) return false;
        if(a+b<=c) return false;
        if(b+c<=a) return false;
        if(a+c<=b) return false;
        return true;
    }

    public boolean isAT(int a,int b,int c){
        if(!isTriangle(a,b,c)) return false;
        else{
            if(a*a+b*b==c*c) return true;
            if(b*b+c*c==a*a) return true;
            if(c*c+a*a==b*b) return true;
        }
        return false;
    }

}
