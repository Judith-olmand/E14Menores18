- BC3- COLECCIONES, FICHEROS Y ENTRADA/SALIDA
- ITERADORES

Filtrado de Menores de Edad

Programa en Java que gestiona una lista de objetos de tipo "Persona" y aplica una lógica de filtrado para mantener únicamente a los mayores de edad.

🚀 Funcionalidades
- Gestión de Objetos: Maneja una colección de instancias personalizadas con atributos de nombre y edad.
- Lógica de Filtrado: Implementa un método específico para evaluar la edad de cada individuo.
- Depuración Automática: Elimina de la lista a cualquier persona cuya edad sea inferior a 18 años.
- Verificación por Consola: Imprime el estado de la colección antes y después del proceso de limpieza.

🛠️ Estructura técnica
- El programa utiliza un diseño modular y herramientas de iteración segura:
- ArrayList<Persona>: Para el almacenamiento dinámico de los objetos.
- Iterator<Persona>: Utilizado dentro de un método estático para recorrer y modificar la lista sin errores de concurrencia.
- Método EliminarMenores18: Encapsula la lógica de negocio, facilitando la reutilización del código de filtrado.
