package org.example.MODELOS;

public class Cliente {
    private String nombre;
    private String sexo;
    private Integer edad;
    private String numeroIdentificacion;
    private String gustoMusical;
    private Float saldoDisponible;

    public Cliente() {
    }

    public Cliente(String nombre, String sexo, Integer edad, String numeroIdentificacion, String gustoMusical, Float saldoDisponible) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.numeroIdentificacion = numeroIdentificacion;
        this.gustoMusical = gustoMusical;
        this.saldoDisponible = saldoDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getGustoMusical() {
        return gustoMusical;
    }

    public void setGustoMusical(String gustoMusical) {
        this.gustoMusical = gustoMusical;
    }

    public Float getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(Float saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
}
