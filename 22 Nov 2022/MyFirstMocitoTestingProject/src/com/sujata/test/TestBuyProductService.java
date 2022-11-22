package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.sujata.bean.Stock;
import com.sujata.dao.ProductDao;
import com.sujata.service.BuyProductService;
import com.sujata.service.BuyProductServiceImpl;

class TestBuyProductService {

	private BuyProductServiceImpl buyProductServiceImpl;
	private ProductDao productDao;
	
	@BeforeEach
	void setUp() throws Exception {
	buyProductServiceImpl=new BuyProductServiceImpl();
	
	//Creating the Stock List
	List<Stock> stocks=Arrays.asList(new Stock(101, "Pencil", 10),
			new Stock(102, "Pen", 5),
			new Stock(103, "Eraser", 2));
	//Setting the stock List to ButProductServiceImpl to calculate totalPrice
	buyProductServiceImpl.setStocks(stocks);
	
	/*
	 * Creating the Mock of ProductDao 
	 * and setting Mock to BuyProductServiceImpl 
	 */
	productDao=Mockito.mock(ProductDao.class);
	buyProductServiceImpl.setProductDao(productDao);
	
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetTotalPrice() {
		//add the behaviour to mocked/ mimiced dao
		when(productDao.getPrice(new Stock(101, "Pencil", 10))).thenReturn(10.0);//100
		when(productDao.getPrice(new Stock(102, "Pen", 5))).thenReturn(100.0);//500
		when(productDao.getPrice(new Stock(103, "Eraser", 2))).thenReturn(5.0);//10
		
		assertEquals(610, buyProductServiceImpl.getTotalPrice());
	}

}
