package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Item;
import com.example.demo.entity.Stock;
import com.example.demo.repository.ItemRepository;
import com.example.demo.repository.StockRepository;


@Controller
public class StockController {
	
	@Autowired
	ItemRepository itemRepository;
	
	@Autowired
	StockRepository stockRepository;
	
	@PostMapping("/stock/{id}/inbound")
	public String recieve(
			@PathVariable("id") Integer id,
			@RequestParam(name = "inbound") Integer quantity) {
		// パスパラメータから商品を取得
		Item item = itemRepository.findById(id).get();
		Integer currentStock = item.getStock();
		item.setStock(currentStock + quantity);
		// 商品を永続化
		itemRepository.save(item);
		// パスパラメータとリクエストパラメータから入出庫履歴をインスタンス化
		Stock stock = new Stock(id, quantity);
		// 入出庫履歴イスタンスを永続化
		stockRepository.save(stock);
		return "redirect:/items/" + id;
	}
	
}
