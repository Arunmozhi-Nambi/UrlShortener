DROP TABLE IF EXISTS URLShortener;

CREATE TABLE URLShortener(
    id INT AUTO_INCREMENT PRIMARY KEY,
    url VARCHAR(5000) NOT NULL,
    tinyUrl VARCHAR(10) NOT NULL
    );

INSERT INTO URLShortener(id, url, tinyUrl) values
(123, 'https://www.google.com/', 'geralt'),
(124, 'https://www.youtube.com/', 'danny'),
(125, 'https://www.facebook.com/', 'marky');