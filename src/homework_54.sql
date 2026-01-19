-- ONE-TO-ONE
CREATE TABLE artists (
   id UUID PRIMARY KEY,
   stage_name TEXT NOT NULL,
   genre TEXT
);

CREATE TABLE artist_styles (
   artist_id UUID PRIMARY KEY REFERENCES artists(id),
   favorite_instrument TEXT,
   signature_style TEXT
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