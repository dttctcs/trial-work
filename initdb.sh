# !/bin/bash

set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
   CREATE USER asset PASSWORD 'somepassword';
   CREATE DATABASE asset;
   GRANT ALL PRIVILEGES ON DATABASE asset TO asset;

EOSQL