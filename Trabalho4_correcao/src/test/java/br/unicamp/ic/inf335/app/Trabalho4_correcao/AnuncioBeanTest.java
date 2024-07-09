package br.unicamp.ic.inf335.app.Trabalho4_correcao;

import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;


class AnuncioBeanTest {

	@Test
	void testAnuncioBean() {
		AnuncioBean anuncio = new AnuncioBean();
		assertNotNull(anuncio);
		assertNotNull(anuncio.getProduto());
		assertNotNull(anuncio.getFotosUrl());
		assertEquals(0.0, anuncio.getDesconto());
	}
	
	@Test
	void testAnuncioBeanParameterized() throws MalformedURLException{
		ProdutoBean produto = new ProdutoBean("123", "Produto", "Descricao", 100.0,"Novo");
		ArrayList<URL>fotos = new ArrayList<>();
		fotos.add(new URL("http://example.com/foto1"));
		AnuncioBean anuncio = new AnuncioBean(produto, fotos, 0.1);
		assertEquals(produto, anuncio.getProduto());
		assertEquals(fotos, anuncio.getFotosUrl());
		assertEquals(0.1, anuncio.getDesconto());
	}
	
	@Test
	void testGetValor() {
		ProdutoBean produto = new ProdutoBean("123","Produto","Descricao",100.0,"Novo");
		AnuncioBean anuncio = new AnuncioBean(produto, new ArrayList<>(), 0.1);
		assertEquals(90.0, anuncio.getValor());
	}

}
