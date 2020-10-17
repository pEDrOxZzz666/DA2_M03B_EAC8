package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
    private String nombre;
    private double sueldo;
    private int agno;
    private int mes;
    private int dia;
    private Date altaContrato;
    private int id;
    private static int idSiguiente = 1;
    
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();
        ++idSiguiente;
        id = idSiguiente;
    }
    
    public Empleado(String nom){
        this(nom, 30000, 2020,01,01);
    }
    
    //getter
    public String dameNombre(){
        return nombre + " ID: " + id;
    }
    
    public double dameSueldo(){
        return sueldo;
    }
    
    public Date dameFechaContrato(){
        return altaContrato;
    }
    
    //setter
    public void subeSueldo(double porcentaje){
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }      
}
