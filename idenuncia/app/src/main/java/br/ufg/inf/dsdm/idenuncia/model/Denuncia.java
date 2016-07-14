package br.ufg.inf.dsdm.idenuncia.model;

import java.util.Date;

/**
 * Created by José Sérgio de Souza on 13/07/2016.
 */
public class Denuncia {
    private int idDenuncia;
    private int idUser;
    private int contadorDenun;
    private Date data;
    private int tipoDenuncia;
    private Localizacao localizacao;
    private String descricao;

    public int getIdDenuncia() {
        return idDenuncia;
    }

    public void setIdDenuncia(int idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getContadorDenun() {
        return contadorDenun;
    }

    public void setContadorDenun(int contadorDenun) {
        this.contadorDenun = contadorDenun;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getTipoDenuncia() {
        return tipoDenuncia;
    }

    public void setTipoDenuncia(int tipoDenuncia) {
        this.tipoDenuncia = tipoDenuncia;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
