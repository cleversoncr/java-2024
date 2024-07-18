package br.com.cursojsf;

import java.io.Serializable;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

@Named("pessoaBean")
@RequestScoped
public class PessoaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}