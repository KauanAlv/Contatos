package br.com.kauan.contatos;

import br.com.kauan.contatos.model.Contato;
import br.com.kauan.contatos.repository.ContatoRepository;

import java.util.Scanner;

public class ContatosApp {
    public static void main(String[] args) {
        System.out.println("ContatosApp");

        Scanner sc = new Scanner(System.in);

        Contato c1 = new Contato();
        System.out.println("Digite o nome do contato: ");
        c1.nome = sc.nextLine();

        System.out.println("Digite o email do contato: ");
        c1.email = sc.nextLine();

        System.out.println("Digite o telefone do contato: ");
        c1.telefone = sc.nextLine();

        ContatoRepository cr = new ContatoRepository();
        cr.listarContatos();
        cr.contato = c1;
        cr.gravar();
    }
}