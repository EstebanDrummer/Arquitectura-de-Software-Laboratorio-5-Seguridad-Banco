Arquitectura-de-Software-Laboratorio-5-Seguridad-Banco
======================================================

Seguridad, se implementa base de datos para cuentas.

1. Necesita crear la base de datos con el siguiente Script:

CREATE TABLE cuenta (
  id VARCHAR(25) NOT NULL,
	nombre VARCHAR(50),
  monto DOUBLE,
	PRIMARY KEY (rut)
);

y agregar usuarios:

INSERT INTO cuenta VALUES (1,Jason,0.0);
INSERT INTO cuenta VALUES (2,steve,0.0);

2. Es necesaria la configuración en el glassfish de las cuentas y los grupos de usuarios.
  2.1.  Ir a la Consola Administrativa
  2.2.	Seleccionar Configuration -> Security-> Realms -> File . El archivo de dominios es el dominio por defecto utilizado por  GlassFish. 
  2.3.	Hacer click en el botón Manage Users a la derecha. 
  2.4.	Hacer click en el botón New y adicione un usuario a la vez. Por cada usuario dar los detalles descritos en la siguiente tabla. 
    
     -----------------------------
    | username | password | gruop |
    |----------|----------|-------|
    | jason    | jason    |users  |
    | steve    | steve    |users  |
    | ben      | ben      |admin  |
    | cathy    | cathy    |guest  |

