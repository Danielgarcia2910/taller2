DIAVEL PHANTOM 🕶️
Sistema de Tienda de Accesorios de Moda

Aplicación de escritorio desarrollada en Java Swing que simula una tienda de accesorios de moda con sistema de compras, carrito, historial de pedidos y panel de administración.
| Dato               | Información                      |
| ------------------ | -------------------------------- |
| Versión            | 1.0                              |
| Lenguaje           | Java                             |
| Interfaz           | Java Swing                       |
| IDE recomendado    | NetBeans 19+                     |
| Arquitectura       | Programación Orientada a Objetos |
| Tipo de aplicación | Escritorio                       |


👨‍💻 Autores
Daniel Jose Garcia Jimenez
Luis Carlos Pumares
Joinner Pedroza


🛍️ Descripción del Proyecto

DIAVEL PHANTOM es una aplicación de escritorio creada en Java que permite gestionar una tienda virtual de accesorios de moda.

El sistema cuenta con:

Catálogo interactivo de productos
Carrito de compras
Historial de pedidos
Filtros por categoría
Buscador en tiempo real
Panel de administración protegido por contraseña
Gestión dinámica de inventario

Además, el proyecto implementa múltiples conceptos fundamentales de la Programación Orientada a Objetos (POO) como:

Herencia
Encapsulamiento
Polimorfismo
Abstracción
Manejo de excepciones personalizadas
🖼️ Características Principales
👤 Modo Cliente
Explorar catálogo de productos
Buscar productos en tiempo real
Filtrar por categorías
Agregar productos al carrito
Eliminar productos del carrito
Realizar pedidos
Consultar historial de compras
Ver perfil del cliente
🔐 Modo Administrador
Acceso mediante contraseña
Agregar nuevos productos
Editar precios
Editar stock
Eliminar productos
Actualización inmediata del inventario
Cambio dinámico entre roles


🚀 Cómo Ejecutar el Proyecto
✅ Requisitos
Java JDK 17 o superior
Apache NetBeans 19+ (recomendado)
Maven integrado
▶️ Ejecutar en NetBeans
Abrir NetBeans
Seleccionar:
File → Open Project
Buscar la carpeta del proyecto
Abrir el proyecto
Verificar que todos los .java estén correctamente organizados
Ejecutar:
DiavelPhantom.java → Run File

🛠️ Tecnologías Utilizadas
| Tecnología | Uso                            |
| ---------- | ------------------------------ |
| Java       | Lógica principal               |
| Java Swing | Interfaz gráfica               |
| Java AWT   | Componentes visuales y layouts |
| Maven      | Gestión del proyecto           |
| NetBeans   | Desarrollo                     |


📂 Funcionalidades del Sistema
👤 Modo Cliente
📦 Catálogo de Productos
Cuadrícula visual de productos
Tarjetas individuales por producto
Visualización de:
Emoji de categoría
Nombre
Tipo
Precio
Stock
Indicadores visuales
🟢 Verde → producto disponible
🔴 Rojo → agotado
🔍 Buscador en Tiempo Real

Permite filtrar productos mientras el usuario escribe.

Busca coincidencias por:

Nombre
Categoría
🗂️ Filtro por Categorías

Categorías disponibles:

Gafas
Collares
Gorras
Pulseras
Anillos
Relojes

También puede combinarse con el buscador.

🛒 Carrito de Compras

Funciones:

Agregar productos
Quitar productos
Visualizar total automáticamente
Contador dinámico de ítems
Actualización instantánea
📋 Realizar Pedido

El sistema:

Verifica que el carrito no esté vacío
Genera un pedido automáticamente
Actualiza el historial del cliente
Vacía el carrito
Muestra confirmación de compra
🔐 Modo Administrador
Acceso

Para ingresar:

Contraseña: admin

Funciones del Administrador
| Función           | Descripción                       |
| ----------------- | --------------------------------- |
| Agregar Producto  | Crear productos nuevos            |
| Eliminar Producto | Eliminar productos del inventario |
| Editar Precio     | Modificar precios                 |
| Editar Stock      | Actualizar inventario             |
| Cambiar Rol       | Volver a modo cliente             |

9. Flujo de Uso Típico
Como cliente
•	La aplicación inicia en modo cliente
•	Navega el catálogo o usa el buscador y los filtros de categoría
•	Haz clic en Agregar en los productos que deseas
•	Revisa el carrito en el panel derecho y ajusta si es necesario (botón X para quitar)
•	Haz clic en Realizar Pedido para confirmar la compra
•	El pedido queda registrado en Mis Pedidos

🛍️ Catálogo Inicial
| Producto             | Categoría | Precio   | Stock |
| -------------------- | --------- | -------- | ----- |
| Gafas Sol Wayfarers  | Gafas     | $85.000  | 15    |
| Gafas Sol Aviator    | Gafas     | $120.000 | 10    |
| Collar Perlas        | Collares  | $55.000  | 20    |
| Collar Dorado Fino   | Collares  | $42.000  | 18    |
| Gorra Cap Negra      | Gorras    | $38.000  | 25    |
| Gorra Trucker Blanca | Gorras    | $35.000  | 12    |
| Pulsera Tejida       | Pulseras  | $22.000  | 30    |
| Pulsera Oro Rosado   | Pulseras  | $65.000  | 8     |
| Anillo Plata 925     | Anillos   | $48.000  | 14    |
| Anillo Dorado Fino   | Anillos   | $52.000  | 10    |
| Reloj Clasico Negro  | Relojes   | $185.000 | 6     |
| Reloj Minimalista    | Relojes   | $220.000 | 4     |

🧠 Conceptos de POO Aplicados
| Concepto                   | Aplicación                                  |
| -------------------------- | ------------------------------------------- |
| Herencia                   | Cliente y Administrador heredan de Usuario  |
| Encapsulamiento            | Uso de atributos privados y getters/setters |
| Polimorfismo               | Métodos redefinidos en subclases            |
| Abstracción                | Clase abstracta Usuario                     |
| Excepciones personalizadas | Manejo de errores del negocio               |
| Composición                | Carrito contiene Productos                  |

🔑 Credenciales
| Rol                 | Credencial |
| ------------------- | ---------- |
| Administrador       | `admin`    |
| Cliente por defecto | Juan       |

📖 Flujo de Uso
👤 Cliente
Explorar productos
Filtrar o buscar
Agregar al carrito
Revisar pedido
Confirmar compra
Consultar historial
🔐 Administrador
Cambiar a modo admin
Ingresar contraseña
Gestionar inventario
Editar precios y stock
Regresar a modo cliente
📌 Mejoras Futuras
💾 Integración con base de datos
🎨 Mejoras visuales de interfaz
👥 Sistema de múltiples usuarios
🔒 Sistema de autenticación real
📊 Reportes de ventas
🧾 Persistencia de pedidos
☁️ Conexión con APIs

📁 Estructura del Proyecto
src/
│
├── modelo/
│   ├── abstractas/
│   ├── excepciones/
│   └── tiendaaccesorios/
│
├── interfaz/
│
└── main/




