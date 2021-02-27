package Task3;

public class Money {
    protected int realPart;
    protected int floatPart;
    public void Print(){
        System.out.println(new StringBuilder().append(realPart).append(".").append(floatPart).toString());
    }
    public void SetRealPart(int val){
        realPart=val;
    }
    public void SetFloatPart(int val){
        floatPart=val;
    }
}
