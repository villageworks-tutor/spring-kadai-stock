package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

	/**
	 * 商品IDの昇順に並べ替え
	 * SELECT * FROM items ORDER BY id
	 */
	List<Item> findAllByOrderById();

}
