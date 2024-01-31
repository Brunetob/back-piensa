-- V1__registergol.sql

CREATE TABLE IF NOT EXISTS gol(
    id SERIAL PRIMARY KEY,
    gol_number INT NOT NULL,
    timestamp TIMESTAMP NOT NULL
);