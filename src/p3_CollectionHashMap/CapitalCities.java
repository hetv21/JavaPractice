    package p3_CollectionHashMap;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.HashSet;

    public class CapitalCities { //key-value pair
        public static void main(String[] args) {
            HashMap<String, String> capitalCity = new HashMap<>();
            capitalCity.put("UK", "London");
            capitalCity.put("France", "Paris");
            capitalCity.put("Italy", "Rome");
            capitalCity.put("Switzerland", "Bern");
            capitalCity.put("Germany", "Berlin");

            System.out.println("**Full list**  "+capitalCity);
            capitalCity.remove("Germany");
            System.out.println("**After removing Germany**  "+capitalCity);

            HashSet<String> keys = new HashSet<>(); // to print keys only
         //   ArrayList<String> values = new ArrayList<>();

            for (String country : capitalCity.keySet())
                keys.add(country);
        //    for (String city: capitalCity.values());

            System.out.println("**Printing only keys**   "+ keys);


        }

    }
