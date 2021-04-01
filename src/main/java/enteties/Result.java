package enteties;

import util.NumberUtills;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Result class;
 */
public class Result {
    private Map<Integer, Integer> results;

    public Result() {
        results = new HashMap<Integer, Integer>();
    }

    public void createResultList (List <Integer> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        NumberUtills numberUtills = new NumberUtills();
        Iterator<Integer> iterator = list.iterator();
        for (Integer key : list){
            if (numberUtills.isPrimeNumber(key)) {
                if (results.get(key) != null) {
                    Integer value = results.get(key);
                    value++;
                    results.put(key, value);
                } else {
                    results.put(key, 1);
                }
            }
        }
    }

    public Map getResults() {
        return results;
    }

    public void setResults(Map results) {
        this.results = results;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        if (!results.isEmpty()) {
            Iterator<Map.Entry<Integer, Integer>> iterator = results.entrySet().iterator();
            for (Map.Entry entry: results.entrySet()) {
                buffer.append("Values: " + entry.getKey() + " repeats: " + entry.getValue() + " times.");
            }
/*            while (iterator.hasNext()) {
                Map.Entry entry = iterator.next();
                buffer.append("Values: " + entry.getKey() + " repeats: " + entry.getValue() + " times.");
                System.out.println("Values: " + entry.getKey() + " repeats: " + entry.getValue() + " times.");
            }*/
        }
        return buffer.toString();
    }
}
