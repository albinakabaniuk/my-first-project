-- Customers
CREATE TABLE customers (
    id UUID PRIMARY KEY,
    name TEXT NOT NULL,
    phone_number TEXT NOT NULL UNIQUE,
    email TEXT NOT NULL UNIQUE,
    password TEXT NOT NULL,
    created_at TIMESTAMPTZ NOT NULL,
    updated_at TIMESTAMPTZ NOT NULL,
    status TEXT NOT NULL
);

-- Admins
CREATE TABLE admins (
    id UUID PRIMARY KEY,
    name TEXT NOT NULL,
    email TEXT NOT NULL UNIQUE,
    phone_number TEXT NOT NULL UNIQUE,
    password TEXT NOT NULL,
    role TEXT NOT NULL,
    created_at TIMESTAMPTZ NOT NULL,
    updated_at TIMESTAMPTZ NOT NULL
);

-- Cards
CREATE TABLE cards (
    id UUID PRIMARY KEY,
    customer_id UUID NOT NULL UNIQUE,
    balance INT NOT NULL,
    created_at TIMESTAMPTZ NOT NULL,
    updated_at TIMESTAMPTZ NOT NULL,
    status TEXT NOT NULL,

    CONSTRAINT fk_cards_customer
        FOREIGN KEY (customer_id)
            REFERENCES customers(id)
            ON DELETE CASCADE
);

-- Transactions
CREATE TABLE transactions (
    id UUID PRIMARY KEY,
    card_id UUID NOT NULL,
    admin_id UUID NOT NULL,
    direction TEXT NOT NULL,
    amount INT NOT NULL,
    created_at TIMESTAMPTZ NOT NULL,
    updated_at TIMESTAMPTZ NOT NULL,
    status TEXT NOT NULL,
    note TEXT,

    CONSTRAINT fk_transactions_card
        FOREIGN KEY (card_id)
            REFERENCES cards(id)
            ON DELETE CASCADE,

    CONSTRAINT fk_transactions_admin
        FOREIGN KEY (admin_id)
            REFERENCES admins(id)
            ON DELETE RESTRICT
);