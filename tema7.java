/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscurso6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 *
 * @author asortega
 */
public class tema7 {
    
    //Suma de las ventas totales:
    //Sin usar pipelines
    //usando parallel stream
    //usando parallel stream y reduce
    
    List<ventas> datos = Arrays.asList(
            new ventas("Luis", "Chihuahua", 200.56),
            new ventas("Maria", "Chihuahua", 200.56),
            new ventas("Luis", "Juarez", 200.56),
            new ventas("Juan", "Aldama", 200.56),
            new ventas("Ana", "Delicias", 200.56)
    );
    //SUMA DEL TOTAL LA DE VENTAS  SIN USAR PIPELINE
    Stream <ventas> lista1 = datos.stream();
    Stream <ventas>lista3 = lista1.filter(t->t.obtenerVentas() >=0 );
    DoubleStream ss= lista3.mapToDouble(t->t.obtenerVentas());
    double resultado = ss.sum();
    
    //SUMATORIA TOTAL USANDO PARALLELSTREAM()
    double resultado2 = datos.parallelStream()
            .filter(t-> t.obtenerVentas() >= 0)
            .mapToDouble(t->t.obtenerVentas())
            .sum();
    
    //REDUCTION()
    
    int pruebaReduction = IntStream.rangeClosed(1, 5).parallel()
            .reduce(0, (sum, element)-> sum + element);
    
    
    
   
    public void sumatoriaSinPipeline(){
        System.out.println("----------SUMATORIA TOTAL SIN PIPELINES----------");
        System.out.println(resultado);
    }
    
    public void sumatoriaConParallelStream(){
        System.out.println("----------SUMATORIA USANDO PARALLELSTREAM()----------");
        System.out.println(resultado2);
    }
    
    public void sumatoriaConParallelStreamYReduce(){
        System.out.println("----------SUMATORIA USANDO PARALLELSTREAM() Y REDUCTION()----------");
        System.out.println(pruebaReduction);
    }
    
    public tema7(){
        sumatoriaSinPipeline();
        sumatoriaConParallelStream();
        sumatoriaConParallelStreamYReduce();
    }
    
    public static void main (String args[]){
        new tema7();
    }
    
}
