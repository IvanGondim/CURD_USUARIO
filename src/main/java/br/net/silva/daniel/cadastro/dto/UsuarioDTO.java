package br.net.silva.daniel.cadastro.dto;

import br.net.silva.daniel.cadastro.enuns.Sexo;
import br.net.silva.daniel.cadastro.model.UsuarioEntity;

public class UsuarioDTO {

    public UsuarioDTO(UsuarioEntity entity) {
        this.nome = entity.getNome();
        this.cpf = entity.getCpf();
        this.idade = entity.getIdade();
        this.sexo = entity.getSexo();
    }

    public UsuarioDTO() {
    }

    private String nome;
    private Integer idade;
    private Sexo sexo;

    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
