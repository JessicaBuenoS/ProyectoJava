-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 23-05-2019 a las 20:31:13
-- Versión del servidor: 5.1.41
-- Versión de PHP: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `quejas_sugerencias`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `incidencias`
--

CREATE TABLE IF NOT EXISTS `incidencias` (
  `id_incidencia` int(11) NOT NULL AUTO_INCREMENT,
  `id_tipo_incidencia` int(11) NOT NULL,
  `nombre_cliente` varchar(100) NOT NULL,
  `direccion_cliente` varchar(100) NOT NULL,
  `edad_cliente` int(11) NOT NULL,
  `telefono_cliente` varchar(12) NOT NULL,
  `descripcion_cliente` varchar(150) NOT NULL,
  `id_gestor` varchar(5) NOT NULL,
  `id_tipo_estado` int(11) NOT NULL,
  `estado` varchar(11) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_incidencia`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=24 ;

--
-- Volcar la base de datos para la tabla `incidencias`
--

INSERT INTO `incidencias` (`id_incidencia`, `id_tipo_incidencia`, `nombre_cliente`, `direccion_cliente`, `edad_cliente`, `telefono_cliente`, `descripcion_cliente`, `id_gestor`, `id_tipo_estado`, `estado`, `fecha`) VALUES
(1, 1, 'Marco Antonio Gonzalez', 'Av estrella 234', 18, '123456', 'Falta reporte', '6w/', 1, 'inactivo', '2019-05-23 20:13:09'),
(2, 1, 'Maria Elena Hernandez', 'Av Estrella #125', 68, '123456', 'Mejorar Capacitacion', '5h)', 2, 'inactivo', '2019-05-23 20:13:48'),
(3, 1, 'Patricia Flores', 'Av de los pinos #64', 52, '123456', 'Error en base', '5z.', 1, 'inactivo', '2019-05-23 20:14:02'),
(4, 2, 'Emily Flores', 'Av kukulkan #700', 25, '123456', 'Error secundario', '5z.', 2, 'inactivo', '2019-05-20 20:17:31'),
(5, 1, 'Patricia Flores', 'Amatista #45', 0, '789456', 'Fallo de servicio', '7i%', 1, 'activo', '2019-05-23 20:14:41'),
(7, 2, 'Patricia Flores', 'Himno Nacional #500', 53, '123456', 'Sin acceso', '5h)', 1, 'activo', '2019-05-23 20:15:35'),
(8, 1, 'Emily Flores', 'Av kukulkan #700', 25, '123456', 'Falta notificacion', '8h$', 2, 'activo', '2019-05-23 20:15:07'),
(9, 1, 'Luz Maria Perez', 'Av estrella 234', 53, '123456', 'Falla primaria', '6w/', 2, 'inactivo', '2019-05-23 20:16:00'),
(10, 2, 'Emily Flores', 'Av kukulkan #700', 25, '123456', 'Error secundario', '5h)', 1, 'activo', '2019-05-20 20:19:08'),
(11, 1, 'Marco Antonio Gonzalez', 'Av de los pinos #64', 53, '123456', 'Error en base', '7i%', 1, 'activo', '2019-05-20 20:19:18'),
(12, 2, 'Emily Flores', 'Av kukulkan #700', 25, '123456', 'Error secundario', '7i%', 2, 'inactivo', '2019-05-20 20:19:27'),
(13, 2, 'Joel Flores', 'Av de los pinos #64', 45, '312323', 'Mejorar horario', '5z.', 2, 'activo', '2019-05-23 20:17:39'),
(14, 2, 'Juan Cruz', '4a. cerrada de dalias 112', 28, '112088', 'Horario Apto', '5z.', 2, 'activo', '2019-05-23 20:18:33'),
(15, 1, 'Guillermina Concepcion', 'Simon Diaz #20', 20, '123456', 'Servicio rapido', '5z.', 2, 'inactivo', '2019-05-23 20:19:44'),
(16, 1, 'Marco Antonio Gonzalez', 'Av estrella 234', 54, '208218', 'Servicio rapido', '5z.', 2, 'activo', '2019-05-23 20:20:21'),
(17, 1, 'Miguel Solis', 'Cerrada de Dalias #243', 28, '121416', 'Error secundario', '5z.', 1, 'activo', '2019-05-23 20:21:04'),
(18, 2, 'Diana Gonzalez', 'Av de la paz #457', 45, '123789', 'Ayuda apropiada', '5z.', 1, 'activo', '2019-05-23 20:22:04'),
(19, 1, 'Ana Lopez', 'Tercera Norte #23', 35, '123456', 'Servicio rapido', '5z.', 2, 'activo', '2019-05-23 20:24:35'),
(20, 2, 'Pedro Sanchez', 'Aguamarina #200', 35, '123456', 'Falta reporte', '5z.', 1, 'activo', '2019-05-23 20:26:31'),
(21, 2, 'Sofia Reyes', 'cerrada de Dalias', 18, '123456', 'Ayuda apropiada', '9k-', 2, 'activo', '2019-05-23 20:26:58'),
(22, 2, 'Diana Rodriguez', 'Amatista #45', 50, '123456', 'Servicio retrasado', '9k-', 2, 'activo', '2019-05-23 20:28:26'),
(23, 2, 'Victor Esparza', 'Fundadores #320', 45, '123456', 'Falla soporte', '6w/', 2, 'activo', '2019-05-23 20:29:29');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movimiento_gestor`
--

CREATE TABLE IF NOT EXISTS `movimiento_gestor` (
  `id_movimiento` int(11) NOT NULL AUTO_INCREMENT,
  `id_tipo_movimiento` int(11) NOT NULL,
  `id_gestor` varchar(5) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_movimiento`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=68 ;

--
-- Volcar la base de datos para la tabla `movimiento_gestor`
--

INSERT INTO `movimiento_gestor` (`id_movimiento`, `id_tipo_movimiento`, `id_gestor`, `fecha`) VALUES
(1, 2, '5z.', '2019-05-20 20:30:43'),
(2, 3, '5z.', '2019-05-20 20:33:58'),
(3, 4, '5z.', '2019-05-20 20:34:22'),
(4, 4, '5z.', '2019-05-20 20:34:25'),
(5, 4, '5z.', '2019-05-20 20:34:33'),
(6, 4, '5z.', '2019-05-20 20:34:36'),
(7, 4, '5z.', '2019-05-20 20:34:39'),
(8, 4, '5z.', '2019-05-20 20:34:44'),
(9, 4, '5z.', '2019-05-20 20:34:46'),
(10, 2, '5z.', '2019-05-20 20:35:55'),
(11, 2, '5z.', '2019-05-20 20:37:34'),
(12, 1, '5z.', '2019-05-20 20:50:06'),
(13, 1, '5z.', '2019-05-20 20:52:40'),
(14, 1, '5z.', '2019-05-20 20:54:39'),
(15, 1, '5z.', '2019-05-20 20:57:09'),
(16, 1, '5z.', '2019-05-20 20:58:00'),
(17, 2, '5z.', '2019-05-20 21:01:19'),
(18, 3, '5z.', '2019-05-20 21:02:07'),
(19, 4, '5z.', '2019-05-20 21:02:30'),
(20, 4, '5z.', '2019-05-20 21:02:40'),
(21, 4, '5z.', '2019-05-20 21:02:59'),
(22, 1, '5z.', '2019-05-20 21:07:23'),
(23, 3, '5z.', '2019-05-20 21:10:28'),
(24, 1, '5z.', '2019-05-20 21:14:48'),
(25, 3, '5z.', '2019-05-20 21:15:14'),
(26, 1, '5z.', '2019-05-20 21:18:05'),
(27, 3, '5z.', '2019-05-20 21:19:44'),
(28, 4, '5h)', '2019-05-23 08:24:19'),
(29, 4, '5h)', '2019-05-23 08:24:33'),
(30, 4, '5h)', '2019-05-23 08:24:43'),
(31, 4, '5h)', '2019-05-23 08:24:46'),
(32, 4, '5h)', '2019-05-23 08:25:00'),
(33, 4, '5h)', '2019-05-23 08:25:12'),
(34, 4, '5h)', '2019-05-23 08:25:24'),
(35, 4, '5h)', '2019-05-23 08:25:47'),
(36, 4, '5h)', '2019-05-23 08:26:09'),
(37, 4, '5h)', '2019-05-23 08:26:18'),
(38, 4, '5h)', '2019-05-23 08:26:23'),
(39, 4, '5h)', '2019-05-23 08:26:28'),
(40, 1, '9k-', '2019-05-23 19:36:23'),
(41, 3, '9k-', '2019-05-23 19:37:03'),
(42, 3, '9k-', '2019-05-23 19:37:53'),
(43, 2, '9k-', '2019-05-23 19:38:17'),
(44, 4, '9k-', '2019-05-23 19:38:31'),
(45, 4, '9k-', '2019-05-23 19:38:34'),
(46, 4, '9k-', '2019-05-23 19:38:58'),
(47, 4, '9k-', '2019-05-23 19:39:05'),
(48, 4, '9k-', '2019-05-23 19:39:08'),
(49, 4, '9k-', '2019-05-23 19:39:16'),
(50, 4, '9k-', '2019-05-23 19:39:25'),
(51, 4, '9k-', '2019-05-23 19:39:44'),
(52, 4, '9k-', '2019-05-23 19:39:48'),
(53, 4, '9k-', '2019-05-23 19:40:52'),
(54, 4, '9k-', '2019-05-23 19:43:15'),
(55, 4, '9k-', '2019-05-23 19:46:19'),
(56, 4, '9k-', '2019-05-23 19:46:46'),
(57, 4, '9k-', '2019-05-23 19:46:53'),
(58, 4, '9k-', '2019-05-23 19:47:07'),
(59, 1, '9k-', '2019-05-23 19:51:32'),
(60, 3, '9k-', '2019-05-23 19:52:30'),
(61, 1, '6w/', '2019-05-23 19:59:40'),
(62, 4, '6w/', '2019-05-23 20:00:07'),
(63, 4, '6w/', '2019-05-23 20:00:12'),
(64, 4, '6w/', '2019-05-23 20:00:16'),
(65, 4, '6w/', '2019-05-23 20:00:49'),
(66, 4, '6w/', '2019-05-23 20:00:55'),
(67, 4, '6w/', '2019-05-23 20:00:58');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_estado`
--

CREATE TABLE IF NOT EXISTS `tipo_estado` (
  `id_tipo_estado` int(11) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  PRIMARY KEY (`id_tipo_estado`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tipo_estado`
--

INSERT INTO `tipo_estado` (`id_tipo_estado`, `descripcion`) VALUES
(1, 'En espera'),
(2, 'Urgencia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_incidencia`
--

CREATE TABLE IF NOT EXISTS `tipo_incidencia` (
  `id_tipo_incidencia` int(11) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  PRIMARY KEY (`id_tipo_incidencia`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tipo_incidencia`
--

INSERT INTO `tipo_incidencia` (`id_tipo_incidencia`, `descripcion`) VALUES
(1, 'Queja'),
(2, 'Sugerencia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_movimiento`
--

CREATE TABLE IF NOT EXISTS `tipo_movimiento` (
  `id_tipo_movimiento` int(11) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  PRIMARY KEY (`id_tipo_movimiento`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tipo_movimiento`
--

INSERT INTO `tipo_movimiento` (`id_tipo_movimiento`, `descripcion`) VALUES
(1, 'Alta'),
(2, 'Baja'),
(3, 'Modificar'),
(4, 'Consultar');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_turno`
--

CREATE TABLE IF NOT EXISTS `tipo_turno` (
  `id_tipo_turno` int(11) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  PRIMARY KEY (`id_tipo_turno`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tipo_turno`
--

INSERT INTO `tipo_turno` (`id_tipo_turno`, `descripcion`) VALUES
(1, 'Matutino'),
(2, 'Vespertino');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_usuarios`
--

CREATE TABLE IF NOT EXISTS `tipo_usuarios` (
  `id_tipo_usuario` int(11) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  PRIMARY KEY (`id_tipo_usuario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tipo_usuarios`
--

INSERT INTO `tipo_usuarios` (`id_tipo_usuario`, `descripcion`) VALUES
(1, 'Administrador'),
(2, 'Gestor');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `id_usuario` varchar(5) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `edad` int(11) NOT NULL,
  `contrasena` varchar(7) NOT NULL,
  `nacionalidad` varchar(20) NOT NULL,
  `id_turno` int(11) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `id_tipo_usuario` int(11) NOT NULL,
  `activo` int(11) NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `nombre`, `edad`, `contrasena`, `nacionalidad`, `id_turno`, `fecha`, `id_tipo_usuario`, `activo`) VALUES
('9k-', 'Kim Kardashian', 16, 'kim97', 'inglesa', 1, '2019-05-23 19:31:05', 2, 1),
('4k"', 'Diana Gonzalez', -5, 'dia21', 'Mexicana', 1, '2019-05-23 19:25:36', 2, 1),
('6e.', 'Guadalupe', 43, 'gua75', 'mexicana', 2, '2019-05-13 08:28:28', 2, 1),
('admin', 'Nick Jonas', 36, '123456', 'México', 1, '2019-05-12 21:17:32', 1, 1),
('5z.', 'Jessica Bueno', 20, 'jes48', 'Mexicana', 1, '2019-04-25 08:22:24', 2, 1),
('6w/', 'Sofia Reyes Hernandez', 25, 'sof28', 'Mexicana', 1, '2019-04-25 08:12:37', 2, 1),
('5h)', 'Rodolfo Vazquez Reyes', 22, 'rod28', 'Mexicana', 1, '2019-04-21 21:58:09', 2, 1),
('8h$', 'Jessica Elizabeth Bueno Sanchez', 19, 'jes49', 'Estadounidense', 2, '2019-04-21 21:57:33', 2, 1),
('1f+', 'Ana perez', 19, 'ana85', 'mexicana', 1, '2019-05-23 19:32:56', 2, 1),
('7r+', 'Ariana Grande', 28, 'ari23', 'Estadounidense', 2, '2019-05-23 19:57:31', 2, 1);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
