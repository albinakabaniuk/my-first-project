CREATE TABLE IF NOT EXISTS artists
(
    name TEXT,
    country TEXT,
    active_since DATE
);

CREATE TABLE IF NOT EXISTS albums
(
    title TEXT,
    release_year INT,
    artist_name TEXT
);

CREATE TABLE IF NOT EXISTS songs
(
    title TEXT,
    duration INT,
    album_title TEXT
);

INSERT INTO artists (name, country, active_since)
VALUES ('Billie Eilish', 'USA', '2015-01-01'),
       ('Dua Lipa', 'UK', '2015-01-01'),
       ('The Weeknd', 'Canada', '2010-01-01'),
       ('Olivia Rodrigo', 'USA', '2020-01-01');

INSERT INTO albums (title, release_year, artist_name)
VALUES ('Happier Than Ever', 2021, 'Billie Eilish'),
       ('Future Nostalgia', 2020, 'Dua Lipa'),
       ('After Hours', 2020, 'The Weeknd'),
       ('SOUR', 2021, 'Olivia Rodrigo');

INSERT INTO songs (title, duration, album_title)
VALUES ('Therefore I Am', 185, 'Happier Than Ever'),
       ('Happier Than Ever', 298, 'Happier Than Ever'),
       ('Levitating', 203, 'Future Nostalgia'),
       ('Dont Start Now', 183, 'Future Nostalgia'),
       ('Blinding Lights', 200, 'After Hours'),
       ('Save Your Tears', 215, 'After Hours'),
       ('Drivers License', 242, 'SOUR'),
       ('Good 4 U', 178, 'SOUR');

-- SELECT FROM
SELECT title, duration, album_title FROM songs;
SELECT * FROM songs;
SELECT * FROM songs LIMIT 10;
SELECT * FROM songs WHERE duration > 180 AND duration < 250;
SELECT * FROM songs WHERE duration IS NULL;
SELECT * FROM songs WHERE duration IS NOT NULL;
SELECT * FROM songs WHERE duration = 203 OR title = 'Drivers License';
SELECT * FROM songs WHERE duration != 203;

-- UPDATE
SELECT * FROM songs WHERE duration IS NULL;
UPDATE songs SET duration = 200;
UPDATE songs SET duration = 220 WHERE title = 'Good 4 U';
UPDATE songs
SET title = 'Levitating (Remix)', duration = 210
WHERE title = 'Levitating';
SELECT * FROM songs WHERE title = 'Levitating';

-- ADD COLUMN
ALTER TABLE artists ADD genres TEXT;
ALTER TABLE artists ADD COLUMN style TEXT NOT NULL DEFAULT 'Pop';
ALTER TABLE artists
    ADD COLUMN label TEXT,
    ADD COLUMN awards TEXT,
    ADD COLUMN manager TEXT;
SELECT * FROM artists;

-- DROP COLUMN
ALTER TABLE artists
    DROP COLUMN IF EXISTS style,
    DROP COLUMN IF EXISTS label,
    DROP COLUMN IF EXISTS awards,
    DROP COLUMN IF EXISTS manager;
SELECT * FROM artists;

-- ALTER COLUMN
ALTER TABLE albums
    ALTER COLUMN release_year TYPE TEXT;
ALTER TABLE albums
    ALTER COLUMN release_year TYPE INT USING release_year::INT;

-- ORDER BY
SELECT * FROM songs;
SELECT * FROM songs ORDER BY duration;
SELECT * FROM songs ORDER BY duration DESC;
SELECT * FROM songs WHERE duration IS NOT NULL ORDER BY duration;
SELECT * FROM songs ORDER BY title DESC;
SELECT * FROM songs ORDER BY album_title;
SELECT * FROM songs ORDER BY title;

-- MIN_MAX
SELECT MIN(duration) FROM songs;
SELECT MAX(duration) FROM songs;
SELECT MAX(title) FROM songs;
SELECT MIN(title) FROM songs;
SELECT MAX(album_title) FROM songs;
SELECT MIN(album_title) FROM songs;
SELECT MIN(title) FROM songs WHERE duration > 2;
SELECT MAX(title) FROM songs WHERE duration > 2;
SELECT MIN(title) FROM songs;
SELECT title FROM songs ORDER BY title LIMIT 1;

-- SUM
SELECT SUM(duration) FROM songs;
SELECT SUM(duration) FROM songs WHERE duration = 200;
SELECT SUM(duration) FROM songs WHERE duration < 0;

-- AVG
SELECT AVG(duration) FROM songs;
SELECT AVG(duration) FROM songs WHERE duration = 200;
SELECT AVG(duration) FROM songs WHERE duration < 0;
SELECT MIN(duration) FROM songs WHERE duration < 0;
SELECT MAX(duration) FROM songs WHERE duration < 0;

-- DELETE
TRUNCATE songs;
DELETE FROM songs;
DELETE FROM songs WHERE title = 'Good 4 U';
