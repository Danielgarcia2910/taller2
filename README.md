DIAVEL PHANTOM 🕶️
Sistema de Tienda de Accesorios de Moda

Aplicación de escritorio desarrollada en Java Swing que simula una tienda de accesorios de moda con sistema de compras, carrito, historial de pedidos y panel de administración.
1. Descripción General
Diavel Phantom es una aplicación de escritorio desarrollada en Java con interfaz gráfica Swing. Simula el funcionamiento de una tienda de accesorios de moda que permite a los clientes explorar el catálogo, agregar productos al carrito y realizar pedidos.
Además cuenta con un panel de administración protegido por contraseña para gestionar el inventario: agregar y eliminar productos, y editar precios y stock en tiempo real.
El sistema aplica los principios fundamentales de la Programación Orientada a Objetos (POO): herencia, encapsulamiento, polimorfismo, abstracción y manejo de excepciones personalizadas.

2. Cómo Ejecutar el Proyecto
Requisitos previos
•	Java JDK 17 o superior instalado
•	Apache NetBeans 19 o superior (recomendado)
•	Maven integrado (viene incluido con NetBeans)

Pasos en NetBeans
•	Abre NetBeans y selecciona File → Open Project
•	Navega hasta la carpeta del proyecto y ábrelo
•	Verifica que todos los archivos .java estén en sus paquetes correctos
•	Haz clic derecho sobre DiavelPhantom.java → Run File
•	La ventana de Diavel Phantom se abrirá automáticamente


3. Tecnologías Utilizadas
Lenguaje y entorno de desarrollo
•	Lenguaje: Java (JDK 17 o superior)
•	IDE recomendado: Apache NetBeans 19 o IntelliJ IDEA
•	Gestor de proyecto: Maven (estructura estándar de NetBeans)

Bibliotecas Java utilizadas
•	javax.swing: construcción de la interfaz gráfica (ventanas, botones, paneles, tablas)
•	java.awt: colores, fuentes, layouts y gráficos 2D
•	java.awt.event: manejo de eventos de clic, teclado y foco
•	java.awt.geom: figuras con bordes redondeados en los botones
•	java.util.ArrayList: almacenamiento dinámico del inventario, carrito e historial


4. Funcionalidades del Sistema

4.1 Modo Cliente
Al iniciar la aplicación entra directamente en modo Cliente. Las opciones del sidebar son:

Opción	Descripción
Inicio	Pantalla principal con el catálogo completo de productos
Mis Pedidos	Historial de todos los pedidos realizados en la sesión
Perfil	Información del cliente: nombre, correo, teléfono y dirección
Cambiar a Admin	Pide contraseña y cambia al panel de administración
Cerrar Sesión	Cierra la aplicación con ventana de confirmación

Catálogo de productos
•	Cuadrícula de 3 columnas con tarjetas individuales por producto
•	Cada tarjeta muestra: emoji de categoría, nombre, tipo, precio y stock
•	Stock en verde si hay disponibilidad, en rojo si está agotado
•	Botón Agregar desactivado automáticamente cuando el stock es 0

Buscador en tiempo real
•	Campo de texto que filtra productos al instante mientras el usuario escribe
•	Busca coincidencias tanto en el nombre como en la categoría del producto

Filtro por categoría
•	Botones de radio en el sidebar para filtrar: Todos, Gafas, Collares, Gorras, Pulseras, Anillos, Relojes
•	Se puede combinar con el buscador para filtrar dentro de una categoría

Carrito de compras
•	Panel lateral derecho que muestra los productos agregados
•	Cada ítem muestra emoji, nombre, precio y botón X para quitar
•	Total actualizado automáticamente en tiempo real
•	Contador de ítems visible en el encabezado del carrito
•	Al quitar un producto, el stock se devuelve al inventario

Realizar pedido
•	Valida que el carrito no esté vacío antes de procesar
•	Descuenta el stock de cada producto comprado
•	Genera un objeto Pedido y lo agrega al historial del cliente
•	Muestra ventana de confirmación con ID del pedido y total
•	Vacía el carrito automáticamente al completar el pedido

4.2 Modo Administrador
Para acceder al modo administrador se hace clic en 'Cambiar a Admin' en el sidebar e ingresa la contraseña: admin

Descripción del modo administrador
Agregar Producto	Formulario para crear un producto: nombre, precio, stock y categoría
Eliminar Producto	Lista desplegable para seleccionar y eliminar un producto del inventario
Editar Precio	Selecciona un producto y cambia su precio con validación numérica
Editar Stock	Selecciona un producto y actualiza el stock disponible
Cambiar a Cliente	Regresa al modo cliente sin pedir contraseña
Cerrar Sesión	Cierra la aplicación con ventana de confirmación

Edición directa desde las tarjetas
•	En modo admin, cada tarjeta de producto muestra dos botones adicionales
•	Boton Precio: abre un cuadro para ingresar el nuevo precio directamente
•	Boton Stock: abre un cuadro para ingresar el nuevo stock directamente
•	Los cambios se reflejan de inmediato en el catálogo sin necesidad de recargar

Cambio de rol
•	Desde el modo cliente: clic en 'Cambiar a Admin' → ingresa contraseña → accede al panel
•	Desde el modo admin: clic en 'Cambiar a Cliente' → regresa sin pedir contraseña
•	El header actualiza el nombre y rol del usuario activo en tiempo real

5. Catálogo de Productos
El sistema incluye 12 productos preconfigurados distribuidos en 6 categorías:

Producto	Categoría	Precio	Stock
Gafas Sol Wayfarers	Gafas	$85.000	15
Gafas Sol Aviator	Gafas	$120.000	10
Collar Perlas	Collares	$55.000	20
Collar Dorado Fino	Collares	$42.000	18
Gorra Cap Negra	Gorras	$38.000	25
Gorra Trucker Blanca	Gorras	$35.000	12
Pulsera Tejida	Pulseras	$22.000	30
Pulsera Oro Rosado	Pulseras	$65.000	8
Anillo Plata 925	Anillos	$48.000	14
Anillo Dorado Fino	Anillos	$52.000	10
Reloj Clasico Negro	Relojes	$185.000	6
Reloj Minimalista	Relojes	$220.000	4


7. Conceptos de POO Aplicados

Concepto POO	Cómo se aplica en el proyecto
Herencia	Cliente y Administrador extienden la clase abstracta usuario
Encapsulamiento	Todos los atributos son privados con getters y setters
Polimorfismo	usuario tiene métodos abstractos implementados diferente en cada subclase
Abstracción	usuario es abstracta: define el contrato sin instanciarse directamente
Excepciones checked	Fuerzan al llamador a manejar errores de negocio (StockInsuficiente, etc.)
Composición	Cliente contiene un Carrito; Carrito contiene una lista de Productos


Credenciales del sistema
•	Contraseña de administrador: admin
•	Usuario cliente por defecto: Cliente Juan

9. Flujo de Uso Típico
Como cliente
•	La aplicación inicia en modo cliente
•	Navega el catálogo o usa el buscador y los filtros de categoría
•	Haz clic en Agregar en los productos que deseas
•	Revisa el carrito en el panel derecho y ajusta si es necesario (botón X para quitar)
•	Haz clic en Realizar Pedido para confirmar la compra
•	El pedido queda registrado en Mis Pedidos

Como administrador
•	Haz clic en Cambiar a Admin en el sidebar
•	Ingresa la contraseña: admin
•	Usa las opciones del sidebar para gestionar el inventario
•	También puedes editar precio y stock directamente desde cada tarjeta de producto
•	Haz clic en Cambiar a Cliente para volver al modo compra

Mejoras a futuro
• Base de datos
• Mejora de interfaz
• Mejora de usuarios
• Mejora de codigo


