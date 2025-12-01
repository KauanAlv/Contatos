package br.com.kauan.contatos.model;

import java.util.UUID;

public class Contato {

    public String nome;
    public String telefone;
    public String email;
    public String id = UUID.randomUUID().toString();

    public String serializarContato(){
        String contatoSerializado = id + ";" + nome + ";" + email + ";" + telefone + "\n";

        return contatoSerializado;
    }
}