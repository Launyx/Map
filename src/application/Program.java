package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        
        // Treemap ordena o map com base na chave, como neste caso a chave é String, o map foi ordenado em ordem alfabética
        Map<String, String> cookies = new TreeMap<>();

        //Put insere elemento no map
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");

        System.out.println("ALL COOKIES: ");

        // .keyset() retorna um set<K>, um set com as chaves do map
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
