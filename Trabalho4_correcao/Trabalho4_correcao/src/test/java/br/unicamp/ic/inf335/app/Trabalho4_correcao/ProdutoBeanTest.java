package br.unicamp.ic.inf335.app.Trabalho4_correcao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutoBeanTest {

	@Test
	void testProdutoBean() {
		ProdutoBean produto = new ProdutoBean();
		assertNotNull(produto);
		assertEquals("",produto.getCodigo());
		assertEquals("",produto.getNome());
		assertEquals("",produto.getDescricao());
		assertEquals(0.0,produto.getValor());
		assertEquals("",produto.getEstado());
	}

	@Test
	
	void testProdutoBeanParameterized() {
		ProdutoBean produto = new ProdutoBean("123","Produto","Descricao",100.0,"Novo");
		assertEquals("123", produto.getCodigo());
		assertEquals("Produto", produto.getNome());
		assertEquals("Descricao", produto.getDescricao());
		assertEquals(100.0, produto.getValor());
		assertEquals("Novo", produto.getEstado());
	}
	
	@Test
	
	void testCompareTo() {
		ProdutoBean produto1 = new ProdutoBean("123","Produto1", "Descricao1", 100.0,"Novo");
		ProdutoBean produto2 = new ProdutoBean("124","Produto2", "Descricao2", 200.0,"Novo");
		assertTrue(produto1.compareTo(produto2)<0);
		assertTrue(produto2.compareTo(produto1)>0);
		assertTrue(produto1.compareTo(produto1)==0);
	}
	
	
}
