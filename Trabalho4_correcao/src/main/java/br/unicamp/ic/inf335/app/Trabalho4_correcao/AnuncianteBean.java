package br.unicamp.ic.inf335.app.Trabalho4_correcao;

import java.util.ArrayList;

/**
 * 
 * @author bonacin
 *Classe que representa o anunciante, com respectivos dados e anuncios associados
 */

public class AnuncianteBean {
	/**
	 * Nome do anunciante
	 */
     private String nome;
     /**
 	 * CPF do anunciante
 	 */
      private String CPF;
      /**
  	 * Lista de anuncios de anunciante
  	 */
       private ArrayList<AnuncioBean> anuncios;
       
       public String getNome() {
    	   return nome;
        }
       public void setNome(String nome) {
    	   this.nome = nome;
       }
       
       public String getCPF() {
    	   return CPF;
        }
       public void setCPF(String cPF) {
    	   CPF = cPF;
       }
       public ArrayList<AnuncioBean> getAnuncios() {
    	   return anuncios;
        }
       public void setAnuncios(ArrayList<AnuncioBean> anuncios) {
    	   this.anuncios = anuncios;
       }
       
       /**
        * Construtor default
        */
       
       public AnuncianteBean() {
    	   nome = new String();
    	   CPF = new String();
    	   anuncios = new ArrayList<AnuncioBean>();
       }
       
       /**
        * Construtor com parametros
        * @param nome
        * @param cPF
        * @param anuncios
        */

       public AnuncianteBean(String nome, String cPF, ArrayList<AnuncioBean> anuncios) {
            super();
            this.nome = nome;
            CPF = cPF ;
            this.anuncios = anuncios;
       }
       
       /**
        * Inclui novo anuncio na lista de anuncios de um anunciante
        * @param nAnuncio Anuncio a ser incluido
        */
       public void addAnuncio(AnuncioBean nAnuncio) {
    	   anuncios.add(nAnuncio);
       }
       
       /**
        * Remove anuncio na lista de anuncios de um anunciante
        * @param nAnuncio Anuncio a ser removido
        */
       public void removeAnuncio(int i) {
    	   if (i >= 0 && i < anuncios.size()) {
    	   anuncios.remove(i);
       }
       }
       
       /**
        * Calcula o valor medio de anuncios de um anunciante
        * @return valor medio dos anuncios
        */
       public Double valorMedioAnuncios() {
    	   if (anuncios.size() == 0) {
    		   return 0.0;
    	   }
    	   Double soma = 0.0;
    	   for (AnuncioBean an:anuncios) {
    		   soma += an.getValor();
    	   }
     	   return soma/anuncios.size();
       }
       
}
