INSERT INTO users (username, password, enable) VALUES ('cesar', '$2a$10$ayinZFrCg.GvjU.CPxvUBehgi/y5YUMoxkhhGSP9QRhL77XO8Fa1C', 1);
INSERT INTO users(username, password, enable) VALUES ('admin', '$2a$10$XezTQP9nIPsLfND8dhfE3OUZkQZz3A9lU0AmeiCxo2GW.73AMqUPm', 1);


INSERT INTO authorities (user_id, authority) VALUES (1, 'ROLE_USER');
INSERT INTO authorities (user_id, authority) VALUES (2, 'ROLE_ADMIN');
INSERT INTO authorities (user_id, authority) VALUES (2, 'ROLE_USER');