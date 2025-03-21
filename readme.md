⌨️ Convert String to camelCase

downloads build chat

Este documento describe la implementación de un programa en Java que convierte cadenas de texto en formato camelCase.
📌 Contenidos

📝 Guía de Uso

📖 Enunciado del Problema

🛠️ Implementación en Java

❓ Apéndice y FAQ

📖 Guía de Uso

Para utilizar el código y probar su funcionamiento, sigue estos pasos:

Descargar el código fuente:
📂 Clonar el repositorio en GitHub:          
git clone https://github.com/keeanu-spec/KATA1.git

Abrir en tu IDE favorito (Eclipse, IntelliJ, VS Code).
Ejecutar Main.java para probar el programa.
Ejecutar SolutionTest.java para validar con JUnit.

📝 Enunciado del Problema

El ejercicio consiste en transformar una cadena de texto en formato camelCase, eliminando guiones (-) y guiones bajos (_), y capitalizando cada palabra excepto la primera.

🔗 Problema original en GitHub

🏷️ Ejemplo de Entrada y Salida

Entrada Salida

"the_Stealth_Warrior" "theStealthWarrior"

"the-Stealth-Warrior" "theStealthWarrior"

"The_Stealth_Warrior" "TheStealthWarrior"

"The-Stealth-Warrior" "TheStealthWarrior"

🛠️ Implementación en Java

📌 Solution.java (Clase con el método toCamelCase)
    
    import java.lang.StringBuilder;
    import java.util.regex.Matcher;    
    import java.util.regex.Pattern;
    class Solution {

    static String toCamelCase(String s){
        return Pattern.compile("[-|_](.)").matcher(s).replaceAll(r -> r.group(1).toUpperCase());  
        }
    }

📌 Main.java (Ejecutar el programa)

    public class Main {
    public static void main(String args[])
    {
    
    Solution s = new Solution();
    
    System.out.println(s.toCamelCase("the_Stealth_Warrior"));
        }
    }

📌 SolutionTest.java (Pruebas unitarias)

    import static org.junit.Assert.assertEquals;
    import org.junit.Test;

    public class SolutionTest {
    
    @Test

    public void testSomeUnderscoreLowerStart() {

    String input = "the_Stealth_Warrior";
    System.out.println("input: "+input);
    assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
    String input = "the-Stealth-Warrior";
    System.out.println("input: "+input);
    assertEquals("theStealthWarrior", Solution.toCamelCase(input));
        }
    }

📌 Explicación del Código:

La clase `Solution` contiene el método `toCamelCase` que utiliza una expresión regular para encontrar los guiones y guiones bajos en la cadena de texto y reemplazarlos con la primera letra de la palabra siguiente en mayúscula.
La clase `Main` contiene el método `main` que prueba el método `toCamelCase` con una cadena de texto.
La clase `SolutionTest` contiene pruebas unitarias para validar el funcionamiento del método `toCamelCase`.

❓ Apéndice y FAQ

📌 Autor: keeanu-spec

📌 Proyecto: KATA1

📌 Fecha: 21-03-2025

🏷️ Etiquetas: Java camelCase Documentation