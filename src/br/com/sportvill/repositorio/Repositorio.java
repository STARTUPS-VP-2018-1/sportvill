/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sportvill.repositorio;

import br.com.sportvill.dominio.Cliente;
import br.com.sportvill.dominio.Modalidade;
import br.com.sportvill.dominio.Ranking;
import br.com.sportvill.dominio.Eventos;
import java.util.ArrayList;
import java.util.List;



public class Repositorio {
    
    public static List<Cliente> clienteDBFake = new ArrayList<Cliente>();
    public static List<Modalidade> fornecedorDBFake = new ArrayList<Modalidade>();
    public static List<Ranking> rankingDBFake = new ArrayList<Ranking>();
    public static List<Eventos> eventosDBFake = new ArrayList<Eventos>();
    
    
}
