package prac27.task02;

import java.util.*;

public class NewMap{
    Map<String, ArrayList<String>> map;

    public NewMap() {
        map = new HashMap<>();
    }

    public HashMap<String, ArrayList<String>> createMap() {
        return (HashMap<String, ArrayList<String>>) map;
    }

    public void addValue(String key, String value) {
        if(map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            map.put(key, new ArrayList<>());
            map.get(key).add(value);
        }
    }

    public int getSameFirstNameCount(){
        int count = 0;
        for(Map.Entry<String, ArrayList<String>> item : map.entrySet()){
            if (item.getValue().size() > 1) count++;
        }
        return count;
    }

    public int getSameLastNameCount(){
        Map<String, Integer> tmp = new HashMap<>();

        for(Map.Entry<String, ArrayList<String>> item : map.entrySet()){
            for (String name : item.getValue()) {
                if (tmp.containsKey(name)) tmp.replace(name, tmp.get(name) + 1);
                else tmp.put(name, 1);
            }
        }

        int count = 0;

        for(Map.Entry<String, Integer> item : tmp.entrySet()){
            if (item.getValue() > 1) count++;
        }
        return count;
    }

}