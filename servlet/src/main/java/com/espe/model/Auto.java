package com.espe.model;

import java.time.Year;

public class Auto {

    private String placa;
    private String marca;
    private String modelo;
    private String cilindraje;
    private Year anio;
    private String cosumo;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Year getAnio() {
        return anio;
    }

    public void setAnio(Year anio) {
        this.anio = anio;
    }

    public String getCosumo() {
        return cosumo;
    }

    public void setCosumo(String cosumo) {
        this.cosumo = cosumo;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindraje='" + cilindraje + '\'' +
                ", anio=" + anio +
                ", cosumo='" + cosumo + '\'' +
                '}';
    }
}
