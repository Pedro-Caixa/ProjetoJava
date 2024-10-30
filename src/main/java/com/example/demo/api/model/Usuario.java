package com.example.demo.api.model;


public class Usuario{
    private long id;
    private String Nome;
    private String Email;
    private String Senha;

    public Usuario(Long id, String Nome, String Email,String Senha){
        this.id = id;
        this.Nome = Nome;
        this.Email = Email;
        this.Senha = Senha;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", Nome='" + Nome + '\'' +
                ", Email='" + Email + '\'' +
                ", Senha='" + Senha + '\'' +
                '}';
    }
}
