package br.unicamp.ic.inf335.app.Trabalho4_correcao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;



class AnuncianteBeanTest {

	@Test
	void testAnuncianteBean() {
		AnuncianteBean anunciante = new AnuncianteBean();
		assertNotNull(anunciante);
		assertEquals("", anunciante.getNome());
		assertEquals("", anunciante.getCPF());
		assertNotNull(anunciante.getAnuncios());
	}

	@Test
	void testAnuncianteBeanParameterized() {
		ArrayList<AnuncioBean> anuncios = new ArrayList<>();
		AnuncianteBean anunciante = new AnuncianteBean("Nome","12345678901", anuncios);
		assertEquals("Nome", anunciante.getNome());
		assertEquals("12345678901", anunciante.getCPF());
		assertEquals(anuncios, anunciante.getAnuncios());
		}
	
	@Test
	void testAddAnuncio() {
		AnuncianteBean anunciante = new AnuncianteBean();
		AnuncioBean anuncio = new AnuncioBean();
		anunciante.addAnuncio(anuncio);
		assertEquals(1,anunciante.getAnuncios().size());
		assertEquals(anuncio,anunciante.getAnuncios().get(0));
	}
	
	@Test
	void testRemoveAnuncio() {
		AnuncianteBean anunciante = new AnuncianteBean();
		AnuncioBean anuncio = new AnuncioBean();
		anunciante.addAnuncio(anuncio);
		anunciante.removeAnuncio(0);
		assertEquals(0, anunciante.getAnuncios().size());
	}
	
	@Test
	void testValorMedioAnuncios() {
		ProdutoBean produto1 = new ProdutoBean("123","Produto1", "Descricao1", 100.0,"Novo");
		ProdutoBean produto2 = new ProdutoBean("124","Produto2", "Descricao2", 200.0,"Novo");
		AnuncioBean anuncio1 = new AnuncioBean(produto1, new ArrayList<>(), 0.1);
		AnuncioBean anuncio2 = new AnuncioBean(produto2, new ArrayList<>(), 0.1);
		ArrayList<AnuncioBean> anuncios = new ArrayList<>();
		anuncios.add(anuncio1);
		anuncios.add(anuncio2);
		AnuncianteBean anunciante = new AnuncianteBean("Nome","12345678901", anuncios);
		assertEquals(135.0, anunciante.valorMedioAnuncios());
	}
	
}
