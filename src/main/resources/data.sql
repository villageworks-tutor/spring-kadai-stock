-- ���i�e�[�u���p�T���v�����R�[�h
INSERT INTO items (name, price, stock) VALUES ('���[���f�j���W���P�b�g', 4000, 3);
INSERT INTO items (name, price, stock) VALUES ('�ӂ��胏���s�[�X', 5000, 5);
INSERT INTO items (name, price, stock) VALUES ('2way�g�����`�R�[�g', 30000, 4);

-- ���o�Ƀe�[�u���p�T���v�����R�[�h
INSERT INTO stocks (item_id, operated_at, quantity) VALUES (1, '2020/04/12 10:00:00', 3);
INSERT INTO stocks (item_id, operated_at, quantity) VALUES (1, '2020/04/12 10:00:00', 1);
INSERT INTO stocks (item_id, operated_at, quantity) VALUES (1, '2020/04/12 10:00:00', -1);
