-- ONE-TO-ONE
CREATE TABLE IF NOT EXISTS Artists (
    artist_id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    genre VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS ArtistDetails (
    details_id SERIAL PRIMARY KEY,
    artist_id INT NOT NULL UNIQUE,
    biography TEXT,
    debut_year INT,
    country VARCHAR(50)
);

-- ONE-TO-MANY
CREATE TABLE IF NOT EXISTS fashion_brands (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT NOT NULL,
    country TEXT
);

CREATE TABLE IF NOT EXISTS collections (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    collection_name TEXT NOT NULL,
    release_year INT,
    brand_id UUID NOT NULL REFERENCES fashion_brands(id)
);