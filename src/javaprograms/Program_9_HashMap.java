package javaprograms;

import java.util.HashMap;

public class Program_9_HashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        //add keys and values (name, Age)
        map.put("Dhoni", 32);
        map.put("Hardik", 42);
        map.put("Sachin", 33);
        map.put("Sehvag", 43);

        for (String i : map.keySet()) {
            System.out.println("keys: "+ i + " values: "+ map.get(i));
        }

//        Iterator <Map.Entry<String, Integer>> MatchList = map.entrySet().iterator();
//        while (MatchList.hasNext()){
//            System.out.println(MatchList.next());
//        }
    }
}
