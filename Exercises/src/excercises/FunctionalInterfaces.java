package excercises;
/**
 * FunctionalInterfaces
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionalInterfaces {
  static List<String> countries=new ArrayList<>();
  static Map<String,String> countryCapitals=new HashMap<>();
  static{
    
    countries.add("India");
    countries.add("USA");
    countries.add("UAE");
    countries.add("Canada");
    countries.add("Australia");
    countryCapitals.put("India", "New Delhi");
    countryCapitals.put("USA", "Washington");
    countryCapitals.put("Autralia", "Melbourne");
    countryCapitals.put("Canada", "Ottawa");

  }
  public static void displayCountries(){
    System.out.println("Countries------------------");
    countries.forEach(System.out::println);
  }
  public static void displayCountryCapitals(){
    System.out.println("Country \t Capital");
    countryCapitals.forEach((k,v)->System.out.println(k+"\t"+v));
  }
  public static void sortCountriesByName(){
    countries.sort((s1,s2)->s1.compareTo(s2));
    countries.reversed();
    displayCountries();
  }
  public static void sortCountriesBylength(){
    Comparator<String> comparator=Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder());
    countries.sort(comparator);
    // countries.sort((i1,i2)->i1.length()-i2.length());
    displayCountries();
  }
  public static void removeCountry(){
    countries.removeIf(s->s.length()>6);
    displayCountries();

  }
    public static void main(String[] args) {
        displayCountries();
        System.out.println("--------------------------");
        displayCountryCapitals();
        System.out.println("After sort by name");
        sortCountriesByName();
        System.out.println("After sort by length");
        sortCountriesBylength();
        System.out.println("Remove the country ");
        removeCountry();
    }
}