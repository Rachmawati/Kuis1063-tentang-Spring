-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 12 Des 2017 pada 14.12
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis1063`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_cv_1063`
--

CREATE TABLE `tbl_cv_1063` (
  `id_cv` bigint(20) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `nama` varchar(255) NOT NULL,
  `tanggal_lahir` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `tbl_cv_1063`
--

INSERT INTO `tbl_cv_1063` (`id_cv`, `alamat`, `nama`, `tanggal_lahir`) VALUES
(1, 'jalan durian', 'linda', '20-01-2017');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_nilai_1063`
--

CREATE TABLE `tbl_nilai_1063` (
  `id` bigint(20) NOT NULL,
  `id_cv` bigint(20) DEFAULT NULL,
  `matakuliah` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `nilai` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `tbl_nilai_1063`
--

INSERT INTO `tbl_nilai_1063` (`id`, `id_cv`, `matakuliah`, `nama`, `nilai`) VALUES
(1, 1, 'memasak', 'linda', 80);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_cv_1063`
--
ALTER TABLE `tbl_cv_1063`
  ADD PRIMARY KEY (`id_cv`);

--
-- Indexes for table `tbl_nilai_1063`
--
ALTER TABLE `tbl_nilai_1063`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKj5q1hngqup1fk41lagyjuthvn` (`id_cv`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_cv_1063`
--
ALTER TABLE `tbl_cv_1063`
  MODIFY `id_cv` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `tbl_nilai_1063`
--
ALTER TABLE `tbl_nilai_1063`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tbl_nilai_1063`
--
ALTER TABLE `tbl_nilai_1063`
  ADD CONSTRAINT `FKj5q1hngqup1fk41lagyjuthvn` FOREIGN KEY (`id_cv`) REFERENCES `tbl_cv_1063` (`id_cv`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
