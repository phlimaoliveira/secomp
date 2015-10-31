package com.example.fox.androidsecomp.core;

/**
 * Created by Fox on 30/10/2015.
 */
public class Noticia {

    private Integer imagem;
    private Integer imagemAuthor;
    private String tituloNoticia;
    private String nomeAuthor;
    private String descricao;

    public Noticia() { }

    public Noticia(Integer imagem, Integer imagemAuthor, String tituloNoticia, String nomeAuthor) {
        this.imagem = imagem;
        this.imagemAuthor = imagemAuthor;
        this.tituloNoticia = tituloNoticia;
        this.nomeAuthor = nomeAuthor;
    }

    public Integer getImagem() {
        return imagem;
    }

    public void setImagem(Integer imagem) {
        this.imagem = imagem;
    }

    public Integer getImagemAuthor() {
        return imagemAuthor;
    }

    public void setImagemAuthor(Integer imagemAuthor) {
        this.imagemAuthor = imagemAuthor;
    }

    public String getTituloNoticia() {
        return tituloNoticia;
    }

    public void setTituloNoticia(String tituloNoticia) {
        this.tituloNoticia = tituloNoticia;
    }

    public String getNomeAuthor() {
        return nomeAuthor;
    }

    public void setNomeAuthor(String nomeAuthor) {
        this.nomeAuthor = nomeAuthor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
