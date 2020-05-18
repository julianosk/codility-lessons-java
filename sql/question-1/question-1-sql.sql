-- https://data36.com/sql-interview-questions-tech-screening-data-analysts/
-- Question 1

create table authors
(
	author_name varchar,
	book_name varchar
);

create table books
(
	book_name varchar,
	sold_copies int
);

INSERT INTO authors (author_name, book_name) VALUES ('author_1', 'book_1');
INSERT INTO authors (author_name, book_name) VALUES ('author_1', 'book_2');
INSERT INTO authors (author_name, book_name) VALUES ('author_2', 'book_3');
INSERT INTO authors (author_name, book_name) VALUES ('author_2', 'book_4');
INSERT INTO authors (author_name, book_name) VALUES ('author_3', 'book_5');
INSERT INTO authors (author_name, book_name) VALUES ('author_3', 'book_6');
INSERT INTO authors (author_name, book_name) VALUES ('author_4', 'book_7');
INSERT INTO authors (author_name, book_name) VALUES ('author_4', 'book_8');
INSERT INTO authors (author_name, book_name) VALUES ('author_5', 'book_9');
INSERT INTO authors (author_name, book_name) VALUES ('author_5', 'book_10');
INSERT INTO authors (author_name, book_name) VALUES ('author_6', 'book_11');
INSERT INTO authors (author_name, book_name) VALUES ('author_6', 'book_12');

INSERT INTO books (book_name, sold_copies) VALUES ('book_1', 1000);
INSERT INTO books (book_name, sold_copies) VALUES ('book_2', 1500);
INSERT INTO books (book_name, sold_copies) VALUES ('book_3', 34000);
INSERT INTO books (book_name, sold_copies) VALUES ('book_4', 29000);
INSERT INTO books (book_name, sold_copies) VALUES ('book_5', 40000);
INSERT INTO books (book_name, sold_copies) VALUES ('book_6', 4400);
INSERT INTO books (book_name, sold_copies) VALUES ('book_7', 20000);
INSERT INTO books (book_name, sold_copies) VALUES ('book_8', 100000);
INSERT INTO books (book_name, sold_copies) VALUES ('book_9', 8000);
INSERT INTO books (book_name, sold_copies) VALUES ('book_10', 9000);
INSERT INTO books (book_name, sold_copies) VALUES ('book_11', 30000);
INSERT INTO books (book_name, sold_copies) VALUES ('book_12', 5000);



SELECT author_name, SUM(sold_copies) as total_sold
FROM authors a
JOIN books b on a.book_name = b.book_name
GROUP BY author_name
ORDER BY total_sold desc
LIMIT 3;
