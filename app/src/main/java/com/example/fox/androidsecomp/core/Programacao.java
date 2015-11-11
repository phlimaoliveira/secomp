package com.example.fox.androidsecomp.core;

/**
 * Created by Fox on 11/11/2015.
 */
public class Programacao {

    private String horario;
    private String nomePalestra;
    private String local;

    public Programacao() { }

    public Programacao(String horario, String nomePalestra, String local) {
        this.horario = horario;
        this.nomePalestra = nomePalestra;
        this.local = local;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNomePalestra() {
        return nomePalestra;
    }

    public void setNomePalestra(String nomePalestra) {
        this.nomePalestra = nomePalestra;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

}
