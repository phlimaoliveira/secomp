package com.example.fox.androidsecomp.core;

/**
 * Created by Fox on 10/11/2015.
 */
public class Participante {

    private Integer imageParticipante;
    private String nomeParticipante;
    private String descricaoParticipante;

    public Participante() { }

    public Participante(Integer imageParticipante, String nomeParticipante) {
        this.imageParticipante = imageParticipante;
        this.nomeParticipante = nomeParticipante;
    }

    public Integer getImageParticipante() {
        return imageParticipante;
    }

    public void setImageParticipante(Integer imageParticipante) {
        this.imageParticipante = imageParticipante;
    }

    public String getNomeParticipante() {
        return nomeParticipante;
    }

    public void setNomeParticipante(String nomeParticipante) {
        this.nomeParticipante = nomeParticipante;
    }

    public String getDescricaoParticipante() {
        return descricaoParticipante;
    }

    public void setDescricaoParticipante(String descricaoParticipante) {
        this.descricaoParticipante = descricaoParticipante;
    }
}
