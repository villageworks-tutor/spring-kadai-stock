package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Item;
import com.example.demo.entity.Stock;
import com.example.demo.repository.ItemRepository;
import com.example.demo.repository.StockRepository;



@Controller
public class ItemController {
	
	@Autowired
	ItemRepository itemRepository;
	
	@Autowired
	StockRepository stockRepository;
	
	// 商品一覧画面表示
	@GetMapping("/items")
	public String index(Model model) {
		// すべての商品をデータベースから取得
		List<Item> itemList = itemRepository.findAll();
		// 取得した商品リストをスコープに登録
		model.addAttribute("itemList", itemList);
		// 画面遷移
		return "items";
	}
	
	@GetMapping("/items/{id}")
	public String show(
			@PathVariable("id") Integer id,
			Model model) {
		// パスパラメータをもとに詳細表示する商品をデータベースから取得
		Item item = itemRepository.findById(id).get();
		// 取得した商品をスコープに登録
		model.addAttribute("item", item);
		// パスパラメータで指定された商品の入出庫履歴をデータベースから取得
		List<Stock> stockList = stockRepository.findByItemId(id);
		// 取得した入出庫履歴リストをスコープに登録
		model.addAttribute("stockList", stockList);
		// 画面遷移
		return "detail";
	}
}
