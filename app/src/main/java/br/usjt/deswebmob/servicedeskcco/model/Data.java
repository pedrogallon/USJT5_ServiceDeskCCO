package br.usjt.deswebmob.servicedeskcco.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by asbonato on 21/03/18.
 */

public class Data {

    public static ArrayList<Chamado> buscarChamados(String chave){
        ArrayList<Chamado> lista = geraListaChamados();
        if(chave == null || chave.length()==0){
            return lista;
        }

        ArrayList<Chamado> resultado = new ArrayList<>();

        for(Chamado chamado:lista){
            if(chamado.getFila().getNome().toUpperCase().contains(chave.toUpperCase())){
                resultado.add(chamado);
            }
        }
        return resultado;
    }

    public static ArrayList<Chamado> geraListaChamados() {
        ArrayList<Chamado> lista = new ArrayList<>();

        Chamado chamado = new Chamado();
        chamado.setNumero(1);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Computador da secretária quebrado");
        Fila fila = new Fila();
        fila.setId(FilaId.DESKTOPS.id());
        fila.setNome(FilaId.DESKTOPS.nome());
        fila.setFigura(FilaId.DESKTOPS.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(2);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Telefone não funciona.");
        fila = new Fila();
        fila.setId(FilaId.TELEFONIA.id());
        fila.setNome(FilaId.TELEFONIA.nome());
        fila.setFigura(FilaId.TELEFONIA.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(3);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Troca de senha.");
        fila = new Fila();
        fila.setId(FilaId.DESKTOPS.id());
        fila.setNome(FilaId.DESKTOPS.nome());
        fila.setFigura(FilaId.DESKTOPS.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(4);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(new Date());
        chamado.setStatus(Chamado.FECHADO);
        chamado.setDescricao("CRM");
        fila = new Fila();
        fila.setId(FilaId.PROJETO.id());
        fila.setNome(FilaId.PROJETO.nome());
        fila.setFigura(FilaId.PROJETO.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(5);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Rede MPLS");
        fila = new Fila();
        fila.setId(FilaId.PROJETO.id());
        fila.setNome(FilaId.PROJETO.nome());
        fila.setFigura(FilaId.PROJETO.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(6);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Gestão do Orçamento");
        fila = new Fila();
        fila.setId(FilaId.PROJETO.id());
        fila.setNome(FilaId.PROJETO.nome());
        fila.setFigura(FilaId.PROJETO.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(7);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Big Data");
        fila = new Fila();
        fila.setId(FilaId.PROJETO.id());
        fila.setNome(FilaId.PROJETO.nome());
        fila.setFigura(FilaId.PROJETO.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(8);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("ITIL V3");
        fila = new Fila();
        fila.setId(FilaId.PROJETO.id());
        fila.setNome(FilaId.PROJETO.nome());
        fila.setFigura(FilaId.PROJETO.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(9);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Liberar celular");
        fila = new Fila();
        fila.setId(FilaId.TELEFONIA.id());
        fila.setNome(FilaId.TELEFONIA.nome());
        fila.setFigura(FilaId.TELEFONIA.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(10);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Troca de ramal");
        fila = new Fila();
        fila.setId(FilaId.TELEFONIA.id());
        fila.setNome(FilaId.TELEFONIA.nome());
        fila.setFigura(FilaId.TELEFONIA.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(11);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Ramal defeituoso");
        fila = new Fila();
        fila.setId(FilaId.TELEFONIA.id());
        fila.setNome(FilaId.TELEFONIA.nome());
        fila.setFigura(FilaId.TELEFONIA.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(12);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Internet com Lentidão");
        fila = new Fila();
        fila.setId(FilaId.REDES.id());
        fila.setNome(FilaId.REDES.nome());
        fila.setFigura(FilaId.REDES.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(13);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Manutenção no Proxy");
        fila = new Fila();
        fila.setId(FilaId.REDES.id());
        fila.setNome(FilaId.REDES.nome());
        fila.setFigura(FilaId.REDES.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(14);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Lentidão generalizada");
        fila = new Fila();
        fila.setId(FilaId.SERVIDORES.id());
        fila.setNome(FilaId.SERVIDORES.nome());
        fila.setFigura(FilaId.SERVIDORES.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(15);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Erro no fechamento contábil de 2017");
        fila = new Fila();
        fila.setId(FilaId.ERP.id());
        fila.setNome(FilaId.ERP.nome());
        fila.setFigura(FilaId.ERP.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        return lista;
    }
}
