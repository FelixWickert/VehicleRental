# phpMyAdmin SQL Dump
# version 2.5.3
# http://www.phpmyadmin.net
#
# Host: localhost
# Erstellungszeit: 31. Januar 2005 um 21:16
# Server Version: 4.0.15
# PHP-Version: 4.3.3
# 
# Datenbank: bankproject
# 
CREATE DATABASE bankproject;
USE bankproject;

# --------------------------------------------------------

#
# Tabellenstruktur für Tabelle accounts
#

CREATE TABLE accounts (
  id int(11) NOT NULL default 0,
  owner int(11) NOT NULL default 0,
  PRIMARY KEY  (id)
) ENGINE=InnoDB;

#
# Daten für Tabelle accounts
#

INSERT INTO accounts VALUES (1, 1);
INSERT INTO accounts VALUES (2, 7);
INSERT INTO accounts VALUES (3, 5);
INSERT INTO accounts VALUES (4, 6);
INSERT INTO accounts VALUES (5, 6);
INSERT INTO accounts VALUES (6, 3);
INSERT INTO accounts VALUES (7, 10);
INSERT INTO accounts VALUES (8, 6);
INSERT INTO accounts VALUES (9, 6);
INSERT INTO accounts VALUES (10, 1);
INSERT INTO accounts VALUES (10000, 10000);

# --------------------------------------------------------

#
# Tabellenstruktur für Tabelle customers
#

CREATE TABLE customers (
  id int(11) NOT NULL default 0,
  firstName varchar(100) NOT NULL default '',
  lastName varchar(100) NOT NULL default '',
  PRIMARY KEY  (id)
) ENGINE=InnoDB;

#
# Daten für Tabelle customers
#

INSERT INTO customers VALUES (1, 'Herbert', 'Müller');
INSERT INTO customers VALUES (2, 'Erna', 'Sparbier');
INSERT INTO customers VALUES (3, 'Sandra', 'Schweigemeier');
INSERT INTO customers VALUES (4, 'Helmut', 'Schmidt');
INSERT INTO customers VALUES (5, 'Helmut', 'Kohl');
INSERT INTO customers VALUES (6, 'Gerhard', 'Schröder');
INSERT INTO customers VALUES (7, 'Willy', 'Brand');
INSERT INTO customers VALUES (8, 'Kurt Georg', 'Kiesinger');
INSERT INTO customers VALUES (9, 'Ludwig', 'Erhard');
INSERT INTO customers VALUES (10,'Konrad', 'Adenauer');
INSERT INTO customers VALUES (11,'Günther', 'Maier');
INSERT INTO customers VALUES (10000,' ', 'Internal');

#
# Tabellenstruktur für Tabelle transactions
#

CREATE TABLE transactions (
  id int(11) NOT NULL default '0',
  sourceAccount int(11) NOT NULL default '0',
  targetAccount int(11) NOT NULL default '0',
  amount float NOT NULL default '0',
  PRIMARY KEY  (id)
) ENGINE=InnoDB;

#
# Daten für Tabelle transactions
#

INSERT INTO `transactions` (`id`,`sourceAccount`,`targetAccount`,`amount`) VALUES (1,1,2,100);
INSERT INTO `transactions` (`id`,`sourceAccount`,`targetAccount`,`amount`) VALUES (2,1,2,67.3);
INSERT INTO `transactions` (`id`,`sourceAccount`,`targetAccount`,`amount`) VALUES (3,2,1,16.5);
