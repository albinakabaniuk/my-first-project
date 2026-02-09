CREATE TABLE IF NOT EXISTS artists (
   artist_id INT PRIMARY KEY,
   name VARCHAR(50)
);

CREATE TABLE genres (
   genre_id INT PRIMARY KEY,
   genre_name VARCHAR(50)
);

CREATE TABLE artist_genre (
   artist_id INT,
   genre_id INT,
   PRIMARY KEY (artist_id, genre_id),
   FOREIGN KEY (artist_id) REFERENCES artists(artist_id),
   FOREIGN KEY (genre_id) REFERENCES genres(genre_id)
);

INSERT INTO artists (artist_id, name) VALUES
   (1, 'Queen'),
   (2, 'Beyonce'),
   (3, 'Daft Punk'),
   (4, 'Adele');

INSERT INTO genres (genre_id, genre_name) VALUES
   (1, 'Rock'),
   (2, 'Pop'),
   (3, 'Electronic'),
   (4, 'Soul');

INSERT INTO artist_genre (artist_id, genre_id) VALUES
   (1, 1), -- Queen → Rock
   (1, 2), -- Queen → Pop
   (2, 2), -- Beyonce → Pop
   (2, 4), -- Beyonce → Soul
   (3, 3), -- Daft Punk → Electronic
   (4, 2); -- Adele → Pop

SELECT a.name AS artist, g.genre_name AS genre
FROM artists a
     INNER JOIN artist_genre ag ON a.artist_id = ag.artist_id
     INNER JOIN genres g ON g.genre_id = ag.genre_id;

SELECT a.name AS artist, g.genre_name AS genre
FROM artists a
     LEFT JOIN artist_genre ag ON a.artist_id = ag.artist_id
     LEFT JOIN genres g ON g.genre_id = ag.genre_id;

SELECT a.name AS artist, g.genre_name AS genre
FROM artists a
     RIGHT JOIN artist_genre ag ON a.artist_id = ag.artist_id
     RIGHT JOIN genres g ON g.genre_id = ag.genre_id;

SELECT a.name AS artist, g.genre_name AS genre
FROM artists a
     FULL OUTER JOIN artist_genre ag ON a.artist_id = ag.artist_id
     FULL OUTER JOIN genres g ON g.genre_id = ag.genre_id;