-- 商品テーブル用サンプルレコード
INSERT INTO items (name, price, stock) VALUES ('ルームデニムジャケット', 4000, 3);
INSERT INTO items (name, price, stock) VALUES ('ふんわりワンピース', 5000, 5);
INSERT INTO items (name, price, stock) VALUES ('2wayトレンチコート', 30000, 4);

-- 入出庫テーブル用サンプルレコード
INSERT INTO stocks (item_id, operated_at, quantity) VALUES (1, '2020/04/12 10:00:00', 3);
INSERT INTO stocks (item_id, operated_at, quantity) VALUES (1, '2020/04/12 10:00:00', 1);
INSERT INTO stocks (item_id, operated_at, quantity) VALUES (1, '2020/04/12 10:00:00', -1);
