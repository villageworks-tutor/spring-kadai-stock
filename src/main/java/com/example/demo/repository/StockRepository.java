package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {

	/**
	 * 入出庫履歴の商品ID検索
	 * SELECT * FROM stocks WHERE item_id = ?
	 */
	List<Stock> findByItemId(Integer id);

	/**
	 * 入出庫履歴の入出庫日時の昇順で商品ID検索
	 * SELECT * FROM stocks WHERE item_id ORDER BY operated_at
	 */
	List<Stock> findByItemIdOrderByOperatedAt(Integer id);

}
