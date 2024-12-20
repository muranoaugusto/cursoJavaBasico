package projects.curso_alternativo.testestream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class TesteStream {

    public String result01(){
    
    ArrayList<String> tTeste = new ArrayList<>(Arrays.asList("tTeste","tTeste1","tTeste2","tTeste3","tTeste4","tTeste5"));

    ArrayList<String> uTeste = new ArrayList<>(List.of("uTeste","uTeste1","uTeste2","uTeste3","uTeste4","uTeste5"));

        System.out.println("Usando o foreach...");
        for (String testetTeste: tTeste){
            System.out.println(testetTeste);
        }
    
        System.out.println("\nUsando Iterator...");
        Iterator<String> iterator = uTeste.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("\nUsando Stream...");
        Stream<String> stream = uTeste.stream();
        stream.forEach(System.out::println);
        

    return "teste finalizado";

        }
}