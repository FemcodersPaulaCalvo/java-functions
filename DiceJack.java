import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        /* 
        Reglas del juego:
        - El usuario debe escoger 3 números entre 1 y 6 (incluidos).
        - El usuario debe lanzar los dados una vez, el resultado serán 3 números aleatorios.

        ¿Cuándo gana el usuario?:
        - Cuando la suma de los números escogidos es mayor a la suma de los dados lanzados
        - Y cuando la diferencia entre los dos números anteriores es menor de 5

        ej. 
        - Usuario escoge los números: 1 3 5 (la suma es 9)
        - Usuario lanza dados y salen los números: 3 1 3 (la suma es 7)
        - 9 es mayor a 7 y la diferencia entre los dos números es menor a 5. El usuario gana.

        Requisitos no funcionales (atributos de calidad):
        - Definir las 4 funciones descritas abajo.
        - En el método main escribir el programa (usar condicionales, reusar las funciones creadas, pedir al usuario que ingrese datos y recogerlos).
      
        Pasos:
        - Pedir al usuario que escoja 3 números.
        - Si el usuario escoge un número fuera del rango, salir del programa (mira en los recursos system exit).
        - Si los números son correctos, pedir al usuario si desea lanzar dados.
        - Si el usuario dice que no, salir del programa.
        - Si el usuario dice que si, lanzar dados, hacer los cálculos que indiquen si el usuario ganó o perdió.
        - Imprimir la suma de los números escogidos por el usuario y la suma de los números que salieron en los dados.
        - Imprimir si el usuario ganó o perdió.
        */

        Scanner scanner = new Scanner(System.in);

        int numUser1 = userNumber(scanner);
        int numUser2 = userNumber(scanner);
        int numUser3 = userNumber(scanner);

        if (isLessThanOne(numUser1, numUser2, numUser3) || isHigherThanSix(numUser1, numUser2, numUser3)) {
            System.out.println("One or more of your numbers is outside the valid range (1-6).");
            System.exit(1);
        }

        System.out.println("Would you like to roll the dice (yes or no):");
        String askUserToRollTheDice = scanner.next();

        if (askUserToRollTheDice.toLowerCase().equals("yes")){
            int rollDice1 = rollDice();
            int rollDice2 = rollDice();
            int rollDice3 = rollDice();

            int userSum = numUser1 + numUser2 + numUser3;
            int rollDiceSum = rollDice1 + rollDice2 + rollDice3;

            System.out.println("The sum of your numbers is: " + userSum);
            System.out.println("The sum of the numbers on the dice is: " + rollDiceSum);

            if(userWon(userSum,rollDiceSum)){
                System.out.println("Congratulations you have won!!!");
            } else {
                System.out.println("You lost, try again whenever you want.");
            }





        } else {
            System.out.println("Thanks for playing, see you!!");
            System.exit(1);
        }

        scanner.close();
    }


    /**
     * 
     * Function name: isLessThanOne
     * 
     * @param num1 (int)
     * @param num2 (int)
     * @param num3 (int)
     * @return (boolean)
     * 
     * Inside the function:
     * 1. check if numbers are less than 1
     */
    
    // Escribe tu código aquí

    public static boolean isLessThanOne(int num1, int num2, int num3){
        return num1 < 1 || num2 < 1 || num3 < 1;
    }

    /**
     * 
     * Function name: isHigherThanSix
     * 
     * @param num1 (int)
     * @param num2 (int)
     * @param num3 (int)
     * @return (boolean)
     * 
     * Inside the function:
     * 1. Check if numbers are greater than 6
     */

    // Escribe tu código aquí

    public static boolean isHigherThanSix(int num1, int num2, int num3){
        return num1 > 6 || num2 > 6 || num3 > 6;
    }

    /**
     * 
     * Function name: userWon
     * 
     * @param sumNumbers (int)
     * @param sumDiceRolls (int)
     * @return (boolean)
     * 
     * Inside the function:
     * 1. check if user numbers are greater than computer numbers and the difference between user numbers and computer numbers are less than 5. 
     */

    // Escribe tu código aquí

    public static boolean userWon (int sumNumbers, int sumDiceRolls){
        return sumNumbers > sumDiceRolls && sumNumbers-sumDiceRolls < 5;
    }

    /**
     * Function name: rollDice
     * 
     * @return (int)
     * 
     * Inside the function:
     * 1. get random number between 1 and 6
     */

    // Escribe tu código aquí

    public static int rollDice(){
        return (int) (Math.floor(Math.random() * (6 - 1 + 1))+1);
    }

    /**
     * Function name: userNumber
     *
     * @return
     *
     * Inside the function:
     * 1. Ask the user for a number
     */

    public static int userNumber(Scanner scanner){
        System.out.print("Choose a number between 1 and 6:");
        int number = scanner.nextInt();
        return number;
    }

}
