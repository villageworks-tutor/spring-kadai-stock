package com.example.demo.entity;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "stocks")
@Data
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "item_id")
	private Integer itemId;
	@Column(name = "operated_at")
	private Timestamp operatedAt;
	private Integer quantity;
	
	/**
	 * デフォルトコンストラクタ
	 */
	public Stock() {}
	
	/**
	 * コンストラクタ
	 * @param itemId
	 * @param quantity
	 */
	public Stock(Integer itemId, Integer quantity) {
		this.itemId = itemId;
		this.operatedAt = new Timestamp(System.currentTimeMillis());
		this.quantity = quantity;
	}
	
	public String getOperatedAt() {
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 return simpleDateFormat.format(this.operatedAt);
	}
	
}
