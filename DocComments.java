public class DocComments {

    //Para documentar un método se toman en cuenta, el nombre de la función, los parámetros con su tipo de dato, lo que devuelve con su tipo de dato y lo que hace la función. Mira estos ejemplos y resuelve el ejercicio final. 
    
    //Si escribes primero la función y luego sobre ella escribes /** */ te saldrá automáticamente la plantilla de documentación.
    
    public static void main(String[] args) {
        greeting();
        greetingCoder("Alex", 155, 44.50);
        double bmi = calculateBodyMassIndex(1.55, 44.50);
        System.out.println(bmi);

        //Ejecuta el nuevo método
        System.out.println(BMI(bmi));
    }

    /**
     * Function name: greeting
     * 
     * Inside the function:
     * 1. prints "Hola FemCoder"
     * 
     */
    public static void greeting(){
        System.out.println("Hola FemCoder");
    }

    /**
     * Function name: greetingCoder
     * 
     * @param name (String)
     * @param height (double)
     * @param weight (double)
     * 
     * Inside the function:
     * 1. print the name the height and the weight as part of a text
     */

    public static void greetingCoder(String name, double height, double weight){
        System.out.println("Hola mi nombre es " + name + " mido " + height + " cm y peso " + weight + " kg" );
    }

    /**
     * Function name: calculateBodyMassIndex
     *
     * @param height (double)
     * @param weight (double)
     * @return (double)
     *
     * Inside the function:
     * 1. calculates the weight in kilograms by the squared height in meters and return it.
     */

    public static double calculateBodyMassIndex(double height, double weight){
        double bmi = weight / Math.pow(height, 2);
        return bmi;
    }

    //Escribe una función que con el índice de masa corporal devuelva un String con los resultados y documéntala:

    /* Clasificación índice de masa corportal rango - kg/m2
    Delgadez severa	< 16
    Delgadez moderada	16 - 17
    Delgadez leve	17 - 18.5
    Normal	18.5 - 25
    Sobrepeso	25 - 30
    Obeso Clase I	30 - 35
    Obeso Clase II	35 - 40
    Obeso Clase III	> 40 */


    /**
     * Function name: BMI (body mass index)
     *
     * @param bmi
     * @return String
     *
     * Inside the function:
     * Find the category corresponding to your BMI value:
     * "Underweight," "Normal," "Overweight," or "Obese."
     */
    public static String BMI (double bmi){
        if( bmi < 16){
            return "Severely thin";
        } else if ( bmi >= 16 && bmi <= 17) {
            return "Moderately thin";
        } else if ( bmi > 17 && bmi <= 18.5) {
            return "Mildly thin";
        } else if ( bmi > 18.5 && bmi <=25) {
            return "Normal";
        } else if ( bmi > 25 && bmi <= 30) {
            return "Overweight";
        } else if ( bmi > 30 && bmi <= 35) {
            return "Class I obese";
        } else if ( bmi > 35 && bmi <= 40) {
            return "Class II obese";
        } else {
            return "Class III obese";
        }
    }




}
