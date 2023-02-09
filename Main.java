import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MySet ms = new MySet();        
        ms.add(1);
        ms.add(2);
        ms.add(3);
        ms.add(2);        
        System.out.println(ms.toString());
        System.out.println(ms.get(1));

    }
}

class  MySet{
    private final Object OBJ = new Object();
    private HashMap <Integer, Object> map = new HashMap<>();  
    
    @Override 
    public String toString (){
        return map.keySet().toString();
    }  

    public   boolean add(Integer i){
        return map.put(i, OBJ) != null?true:false;
    }

    public Integer get(Integer a){
        return (Integer) map.keySet().toArray()[a];        
    }

}

