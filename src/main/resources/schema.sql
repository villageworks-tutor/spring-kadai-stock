-- テーブルの削除
DROP TABLE IF EXISTS items;
DROP TABLE IF EXISTS stocks;

-- 商品テーブルの定義
CREATE TABLE items (
	id SERIAL PRIMARY KEY,     -- 商品ID
	name VARCHAR(50) NOT NULL, -- 商品名
	price INTEGER NOT NULL,    -- 価格
	stock INTEGER              -- 入出庫
);

-- 入出庫テーブルの定義
CREATE TABLE stocks (
	id SERIAL PRIMARY KEY,     -- 入出庫ID
	item_id INTEGER NOT NULL,  -- 商品ID
	operated_at TIMESTAMP NOT NULL DEFAULT current_timestamp, -- 入出庫日時
	quantity INTEGER NOT NULL  -- 数量
);
