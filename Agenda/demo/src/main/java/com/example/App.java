package com.example;

import java.net.SocketPermission;

import javax.swing.OverlayLayout;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Agenda agenda = new Agenda();
        agenda.id = 1;
        agenda.nome = "GEG";
        agenda.cpf = "12345678901";
        agenda.rg = "123456789";
        agenda.email = "grupoGEG@pti.geg";
        agenda.telefone = "4512345678";
        agenda.aniversario = "2022/05/30";

        System.out.println(agenda.id);
        System.out.println(agenda.nome);
        System.out.println(agenda.cpf);
        System.out.println(agenda.rg);
        System.out.println(agenda.email);
        System.out.println(agenda.telefone);
        System.out.println(agenda.aniversario);
    
    }
}
