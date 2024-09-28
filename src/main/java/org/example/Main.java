package org.example;

import org.example.AYUDAS.Licor;
import org.example.MODELOS.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente("Pepeito Perez", "Masculino", 23, "10172222222", "Salsa", 400000F);

        Cliente cliente3 = new Cliente();
        Cliente cliente4 = new Cliente("Laura Ruiz", "Femenino", 20, "10172223331", "Rock", 180000F);

        Licor licor1 = new Licor();
        Licor licor2 = new Licor("Jose cuerco añejo", "jose cuervo", "Tequila", 80000F, "750ml");
        Licor licor3 = new Licor();
        Licor licor4 = new Licor("Club colombia Roja", "Club Colombia", "cerveza nacional", 20000F, "330ml");


        System.out.printf("getNombre(): %s%ngetEdad(): %s%ngetSexo(): %s%nIdentificacion: %s%nGusto Musical: %s%nSaldo Disponible: $%,.2f%n%n%n",
                cliente1.getNombre(),cliente1.getEdad(),cliente1.getSexo(), cliente1.getNumeroIdentificacion(),cliente1.getGustoMusical(),cliente1.getSaldoDisponible());
        System.out.printf("getNombre(): %s%ngetEdad(): %s%ngetSexo(): %s%nIdentificacion: %s%nGusto Musical: %s%nSaldo Disponible: $%,.2f%n%n%n",
                cliente2.getNombre(),cliente2.getEdad(),cliente2.getSexo(), cliente2.getNumeroIdentificacion(),cliente2.getGustoMusical(),cliente2.getSaldoDisponible());
        System.out.printf("getNombre(): %s%ngetEdad(): %s%ngetSexo(): %s%nIdentificacion: %s%nGusto Musical: %s%nSaldo Disponible: $%,.2f%n%n%n",
                cliente3.getNombre(),cliente3.getEdad(),cliente3.getSexo(), cliente3.getNumeroIdentificacion(),cliente3.getGustoMusical(),cliente3.getSaldoDisponible());
        System.out.printf("getNombre(): %s%ngetEdad(): %s%ngetSexo(): %s%nIdentificacion: %s%nGusto Musical: %s%nSaldo Disponible: $%,.2f%n%n%n",
                cliente4.getNombre(),cliente4.getEdad(),cliente4.getSexo(), cliente4.getNumeroIdentificacion(),cliente4.getGustoMusical(),cliente4.getSaldoDisponible());



        System.out.printf("getNombre(): %s%ngetMarca(): %s%ngetCategoria(): %s%ngetTamanio(): %s%ngetPrecio(): $%,.2f%n%n%n",
                licor1.getNombre(), licor1.getMarca(), licor1.getCategoria(), licor1.getTamanio(), licor1.getPrecio());
        System.out.printf("getNombre(): %s%ngetMarca(): %s%ngetCategoria(): %s%ngetTamanio(): %s%ngetPrecio(): $%,.2f%n%n%n",
                licor2.getNombre(), licor2.getMarca(), licor2.getCategoria(), licor2.getTamanio(), licor2.getPrecio());
        System.out.printf("getNombre(): %s%ngetMarca(): %s%ngetCategoria(): %s%ngetTamanio(): %s%ngetPrecio(): $%,.2f%n%n%n",
                licor3.getNombre(), licor3.getMarca(), licor3.getCategoria(), licor3.getTamanio(), licor3.getPrecio());
        System.out.printf("getNombre(): %s%ngetMarca(): %s%ngetCategoria(): %s%ngetTamanio(): %s%ngetPrecio(): $%,.2f%n%n%n",
                licor4.getNombre(), licor4.getMarca(), licor4.getCategoria(), licor4.getTamanio(), licor4.getPrecio());

    }
}