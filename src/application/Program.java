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
        cookies.put("phone", "9971122");

        cookies.remove("email");
        // Devido ao Map não aceitar repetições de chave, a linha abaixo vai substituir o elemento existente que tem "phone" como sua chave
        cookies.put("phone", "99771133");

        // Verifica se o Map contêm a chave "phone"
        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));

        // Obtêm o valor da chave "phone"
        System.out.println("Phone number: " + cookies.get("phone"));

        // Quando não há o elemento no map ele retorna nulo
        System.out.println("Email: " + cookies.get("email"));

        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES: ");

        // .keyset() retorna um set<K>, um set com as chaves do map
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
