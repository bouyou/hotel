-- phpMyAdmin SQL Dump
-- version 4.5.5.1
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mer 26 Août 2020 à 10:21
-- Version du serveur :  5.7.11
-- Version de PHP :  5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `mfe`
--

-- --------------------------------------------------------

--
-- Structure de la table `chambre`
--

CREATE TABLE `chambre` (
  `id` int(11) NOT NULL,
  `numero` varchar(5) NOT NULL,
  `nbPax` int(11) NOT NULL,
  `dateAjout` date NOT NULL,
  `dateModif` date DEFAULT NULL,
  `dateDelete` date DEFAULT NULL,
  `id_hotel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `chambre`
--

INSERT INTO `chambre` (`id`, `numero`, `nbPax`, `dateAjout`, `dateModif`, `dateDelete`, `id_hotel`) VALUES
(20, '1', 3, '2020-08-25', NULL, NULL, 1),
(21, '2', 3, '2020-08-25', NULL, NULL, 1),
(22, '3', 3, '2020-08-25', NULL, NULL, 2),
(23, '4', 3, '2020-08-25', NULL, NULL, 3),
(24, '5', 3, '2020-08-25', NULL, NULL, 4),
(25, '6', 3, '2020-08-25', NULL, NULL, 5),
(26, '7', 2, '2020-08-25', NULL, NULL, 6),
(27, '8', 2, '2020-08-25', NULL, NULL, 1),
(28, '9', 2, '2020-08-25', NULL, NULL, 2),
(29, '10', 2, '2020-08-25', NULL, NULL, 3),
(30, '11', 2, '2020-08-25', NULL, NULL, 4),
(31, '7', 3, '2020-08-25', NULL, NULL, 1);

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `id` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `dateNaissance` date NOT NULL,
  `mail` varchar(50) NOT NULL,
  `dateAjout` date NOT NULL,
  `dateModif` date DEFAULT NULL,
  `dateDelete` date DEFAULT NULL,
  `id_hotel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`id`, `nom`, `prenom`, `dateNaissance`, `mail`, `dateAjout`, `dateModif`, `dateDelete`, `id_hotel`) VALUES
(3, 'Groix', 'David', '1982-04-27', 'd.g@gmail.com', '2020-08-25', '2020-08-25', NULL, 1),
(4, 'Bensi', 'Malik', '1982-05-16', 'm.b@gmail.com', '2020-08-25', '2020-08-25', NULL, 1),
(5, 'Jack', 'Billy', '1986-11-24', 'b.j@gmail.com', '2020-08-25', '2020-08-25', NULL, 1),
(6, 'Roc', 'Etienne', '1983-12-22', 'e.r@gmail.com', '2020-08-25', '2020-08-25', NULL, 1),
(7, 'Van', 'Fabrice', '1991-08-26', 'f.v@gmail.com', '2020-08-25', '2020-08-25', NULL, 1),
(8, 'DeSm', 'Marie', '1993-03-22', 'm.d@free.fr', '2020-08-25', '2020-08-25', NULL, 1),
(9, 'Bon', 'Jean', '1998-01-03', 'j.b@gmail.com', '2020-08-25', '2020-08-25', NULL, 1),
(10, 'Lauren', 'Ralph', '1962-09-29', 'r.l@wanadoo.com', '2020-08-25', '2020-08-25', NULL, 1),
(11, 'Dior', 'Cris', '1953-04-01', 'c.d@gmail.com', '2020-08-25', '2020-08-25', NULL, 1);

-- --------------------------------------------------------

--
-- Structure de la table `hotel`
--

CREATE TABLE `hotel` (
  `id` int(11) NOT NULL,
  `nbChambre` int(11) NOT NULL,
  `dateAjout` date NOT NULL,
  `dateModif` date DEFAULT NULL,
  `dateDelete` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `hotel`
--

INSERT INTO `hotel` (`id`, `nbChambre`, `dateAjout`, `dateModif`, `dateDelete`) VALUES
(1, 40, '2020-08-25', NULL, NULL),
(2, 50, '2020-08-25', NULL, NULL),
(3, 60, '2020-08-25', NULL, NULL),
(4, 70, '2020-08-25', NULL, NULL),
(5, 80, '2020-08-25', NULL, NULL),
(6, 90, '2020-08-25', NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

CREATE TABLE `reservation` (
  `id` int(11) NOT NULL,
  `numReserv` int(11) NOT NULL,
  `nbPers` int(11) NOT NULL,
  `prix` float NOT NULL,
  `nbCb` varchar(16) NOT NULL,
  `dateArrivee` date NOT NULL,
  `dateReserv` date NOT NULL,
  `dateModif` date DEFAULT NULL,
  `dateDelete` date DEFAULT NULL,
  `id_chambre` int(11) NOT NULL,
  `id_client` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `reservation`
--

INSERT INTO `reservation` (`id`, `numReserv`, `nbPers`, `prix`, `nbCb`, `dateArrivee`, `dateReserv`, `dateModif`, `dateDelete`, `id_chambre`, `id_client`) VALUES
(4, 1, 3, 150, '1456654778966523', '2020-08-25', '2020-08-25', NULL, NULL, 20, 3);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `chambre`
--
ALTER TABLE `chambre`
  ADD PRIMARY KEY (`id`),
  ADD KEY `chambre_hotel_FK` (`id_hotel`);

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id`),
  ADD KEY `client_hotel_FK` (`id_hotel`);

--
-- Index pour la table `hotel`
--
ALTER TABLE `hotel`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `reservation_chambre_FK` (`id_chambre`),
  ADD KEY `reservation_client0_FK` (`id_client`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `chambre`
--
ALTER TABLE `chambre`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;
--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT pour la table `hotel`
--
ALTER TABLE `hotel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT pour la table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `chambre`
--
ALTER TABLE `chambre`
  ADD CONSTRAINT `chambre_hotel_FK` FOREIGN KEY (`id_hotel`) REFERENCES `hotel` (`id`);

--
-- Contraintes pour la table `client`
--
ALTER TABLE `client`
  ADD CONSTRAINT `client_hotel_FK` FOREIGN KEY (`id_hotel`) REFERENCES `hotel` (`id`);

--
-- Contraintes pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `reservation_chambre_FK` FOREIGN KEY (`id_chambre`) REFERENCES `chambre` (`id`),
  ADD CONSTRAINT `reservation_client0_FK` FOREIGN KEY (`id_client`) REFERENCES `client` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
