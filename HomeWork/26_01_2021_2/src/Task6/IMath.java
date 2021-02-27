package Task6;

public interface IMath {
    public default int Max(int _1, int _2){
        return _1>_2?_1:_2;
    }
    public default int Min(int _1, int _2){
        return _1<_2?_1:_2;
    }
    public default float Avg(int _1, int _2){
        return (_1+_2)/2;
    }
}
