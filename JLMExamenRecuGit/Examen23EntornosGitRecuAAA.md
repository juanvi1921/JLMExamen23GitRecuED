## Examen Entornos de Desarrollo. IES Marcos Zaragoza
### Recuperación Git. 14/05/24


Nombre y apellidos: ________________________________ 			

 

LINK DEL REPOSITORIO:________________________________________________ 

> Vamos a trabajar sobre Strings.  
> Debajo de cada ejercicio deberán aparecer las capturas de pantalla pertinentes que justifiquen su realización. Intentad hacer todo lo posible desde la consola si no se indica lo contrario. 
> Se valorará negativamente las malas prácticas de GIT 

 

**1.- (0,5) Crea un repositorio privado en github “AAAExamen23GitRecuED“ e invítame a colaborar: "TomBort8" . AAA serán las primeras letras de tu nombre, 1er apellido y 2º apellido respectivamente.** 

**2.- (0,5) Inicializa el repostiorio en local y vincúlalo al repostiroio de github** 

**3.- Crea un main que pida una cadena por teclado .** 

```
import java.util.Scanner;

public class ProcesamientoTexto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un texto:");
        String texto = scanner.nextLine();
        scanner.close();
    }
}
```
> Sube los cambios al repositorio. 

**4.- (0,2) Crea  un fichero Leeme.txt : “Vamos a trabajar sobre Strings con una clase propia, crearemos Ramas para que cada miembro trabajae su parte y luego las uniremos todas”.** 

*  **4.1  (0,3)Crea también un fichero de texto que no debes subir a github pero debe estar dentro de la carpeta NoSubir.txt: (Este archivo debes añadirlo y quitarlo, como si te hubieras confundido). “Este archivo debe estar en la carpeta pero no subido a git”.** 

> Muestra por comandos que no lo has subido 

> Sube los cambios al repositorio. 

**5.- (0,5) Muestra la diferencia entre los 2 últimos commits.** 

**6.- (0,5) Crea 2 ramas Alicia y Bob** 

**7.- Sitúate en Alicia y añade al main las siguientes funcionalidades:**
```
    public static String convertirAMayusculas(String texto) {
        return texto.toUpperCase();
    }
    
    public static String recortarEspacios(String texto) {
        return texto.trim();
    }

```

> Sube los cambios al repositorio (rama Alice).

**8.- Sitúate en Bob y añade al main lo siguiente:**
```
    public static String convertirAMinusculas(String texto) {
        return texto.toLowerCase();
    }
    
    public static String invertirTexto(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }
    
```

> Sube los cambios al repositorio (rama Bob). 

**9.- (1) Muestra la diferencia entre las ramas Alicie y Bob y guárdalo en un fichero llamado DIFERENCIA _RAMAS (desde consola). Este ficehro debe subirse al repositorio.** 

 

**10.- (1,5) Fusiónalo en main (consola) y resuelve el conflicto (en gitHUB).** 

> Sube los cambios al repositorio. 

 

**11.-(0,5) Borra las ramas Alice Y Bob.**

 

**12.- (0,5) Entra a SOURCETREE y haz una captura del eje temporal del repositorio. Haz una breve explicación de lo que observas.** 

 

**13.- (0,75) ¿ Cuál es la diferencia entre “git pull” y “git clone” ?** 
 



**14.- (1,25) Abre el main y déjalo inservible poniendo el tipo de dato a StringBuilder. Sube los cambios. A continuación deshaz el último commit.**
 

**15.- (1,25) Vuelve al estado en el que estaba el proyecto al acabar el ejercicio 3 en local.**
 
 
 **16.-(0,75) Añade este documento al repoitorio, con todas las imágenes para que se pueda ver desde git.**


**17.-  Por último, ejecutad el siguiente comando:** 

> *history > historial.txt* 

**sube el resultado a aules junto al PDF de este documento.** 