-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 08 Jul 2019 pada 19.23
-- Versi server: 10.1.37-MariaDB
-- Versi PHP: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbprojek`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `login_admin`
--

CREATE TABLE `login_admin` (
  `username` varchar(25) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `login_admin`
--

INSERT INTO `login_admin` (`username`, `password`) VALUES
('upi', 'mariani');

-- --------------------------------------------------------

--
-- Struktur dari tabel `produk`
--

CREATE TABLE `produk` (
  `id_produk` int(11) NOT NULL,
  `Kd_produk` varchar(25) NOT NULL,
  `Nm_produk` varchar(25) NOT NULL,
  `Harga_produk` varchar(25) NOT NULL,
  `Qty` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `produk`
--

INSERT INTO `produk` (`id_produk`, `Kd_produk`, `Nm_produk`, `Harga_produk`, `Qty`) VALUES
(22, 'S1SK', 'SISTIK', '39000', '3'),
(24, 'JT3N', 'JINTEN', '39000', '4'),
(25, 'KCP6', 'Kicimpring', '20000', '4');

-- --------------------------------------------------------

--
-- Struktur dari tabel `registrasi`
--

CREATE TABLE `registrasi` (
  `password` varchar(25) DEFAULT '10',
  `email` varchar(25) DEFAULT '10',
  `kontak` varchar(25) DEFAULT '10',
  `alamat` varchar(30) DEFAULT '10',
  `status` varchar(20) DEFAULT '10',
  `regdate` time DEFAULT '00:00:20',
  `id` int(11) DEFAULT '7',
  `username` varchar(25) DEFAULT '10'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `registrasi`
--

INSERT INTO `registrasi` (`password`, `email`, `kontak`, `alamat`, `status`, `regdate`, `id`, `username`) VALUES
('kiki12345', 'marianiupi@gmail.com', '0898212131', 'winduherang', 'Customer', '00:00:00', 7, 'rizki');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `nama` varchar(25) DEFAULT NULL,
  `no_hp` int(11) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `pilih_pembayaran` varchar(10) DEFAULT NULL,
  `total_harga` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`nama`, `no_hp`, `alamat`, `pilih_pembayaran`, `total_harga`) VALUES
('upi', 89776644, 'jalan ramajaksa rt.07/03 winduherang', 'BRI', '1234555'),
('upi mariani', 97235, 'winduherang', 'BRI', '161000'),
('lusy', 97235, 'kuningan', 'Alfamart', '19664'),
('mariani', 86, 'kuningan', 'BNI', '9888'),
('dwie', 811234221, 'ciawigebang', 'BRI', '285720'),
('upi mariani', 8123456, 'ciawigebang', 'BRI', '629000'),
('mariani upi', 812283928, 'puncak', 'COD', '237500'),
('rizkinurhamdani', 8192283, 'kuningan', 'BRI', '432500'),
('rizki nurhamdani', 81223342, 'winduherang', 'BRI', '471500');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`id_produk`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `produk`
--
ALTER TABLE `produk`
  MODIFY `id_produk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
