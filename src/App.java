import models.genericos.Caja;

import java.util.ArrayList;
import java.util.List;

import models.Persona;


public class App {
    public static void main(String[] args) throws Exception {
        Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaInteger = new Caja<>();
        Caja<Persona> cajaPersona = new Caja<>();

        /* 
        Persona persona1 = new Persona(18, "Jose");
        persona1.setEdad(18);
        persona1.setNombre("Jose");
        */

        Persona[] personas = {
            new Persona("Ana", 25),
            new Persona("Carlos", 17),
            new Persona("Maria", 16),
            new Persona("Jorge", 35),
            new Persona("Laura", 15),
            new Persona("Luis", 40),
            new Persona("Elena", 14),
            new Persona("David", 27),
            new Persona("Sofia", 19),
            new Persona("Pablo", 13)
        };

        for (Persona persona : personas) {
            persona.mostrarDatos();
        }

        //cajaString.guardar("Guardo un String");
        //cajaInteger.guardar(10);
        //cajaPersona.guardar(personas);


        //System.out.println(cajaString.obtener());
        //System.out.println(cajaInteger.obtener());
        //System.out.println(cajaPersona.obtener().getNombre());
        //System.out.println(cajaPersona.obtener().getEdad());

        /* 
        Par par = new Par();

        par.establecerClave(8);
        par.establecerValor("Jelou");

        Par<Integer, String> par = new Par<>();
        System.out.println("Par");
        System.out.println(par);
        */

        List<Par<Integer, String>> menoresDeEdad = new ArrayList<>();
        List<Par<Integer, String>> mayoresDeEdad = new ArrayList<>();

        // Rellenar la lista con menores de edad
        for (Persona persona : personas) {
            if (persona.getEdad() <= 18) {
                Par<Integer, String> par = new Par<>();
                par.establecerClave(persona.getEdad());
                par.establecerValor(persona.getNombre());
                menoresDeEdad.add(par);
            }
        }
        for (Persona persona : personas) {
            if (persona.getEdad() >= 18) {
                Par<Integer, String> par = new Par<>();
                par.establecerClave(persona.getEdad());
                par.establecerValor(persona.getNombre());
                mayoresDeEdad.add(par);
            }
        }

        System.out.println("Menores de edad:");
        for (Par<Integer, String> par : menoresDeEdad) {
            System.out.println(par);
        }

        System.out.println("Mayores de edad:");
        for (Par<Integer, String> par : mayoresDeEdad) {
            System.out.println(par);
        }
    }
}
