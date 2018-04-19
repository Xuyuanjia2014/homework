import java.util.Map;

public class testClass {

    private class myclass{
        public Integer f;
    }

    public void test2(int tag)
    {
        myclass a = new myclass();
        a.f = new Integer(10);
        Integer y;
        if(tag > 0){
            y = a.f;
        }
        else{
            a.f = new Integer(20);
            y = a.f;
        }
    }

    public int test3(int tag,int b){
        if(tag%10 == 0){
            tag = tag*3;
            b = 50;
        }
        else{
            tag = b+tag;
            b++;
        }
        tag = b+23;
        return tag;
    }

    public int test2(int i,int j)
    {
        while(i > j){
            if(i >-100){
                if(i>0)
                    i = j;
                else
                    j = 100;
            }
            else{
                i = 5;
                j = 6;
            }
        }
        return i + j;
    }
}
