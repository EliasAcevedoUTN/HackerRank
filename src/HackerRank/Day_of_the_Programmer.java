package HackerRank;

public class Day_of_the_Programmer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        String resultado = "";
        if (year < 1918){
            if (year % 4 == 0){
                resultado = "12.09." + year;
            } else {
                resultado = "13.09." + year;
            }
        } else if (year == 1918){
            resultado = "26.09." + year;
        } else if (year > 1918){
            if (year % 400 == 0){
                resultado = "12.09." + year;
            } else {
                if (year % 4 == 0 && year % 100 != 0){
                    resultado = "12.09." + year;
                } else {
                    resultado = "13.09." + year;
                }
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        int year = 1800;

        String result = dayOfProgrammer(year);
        System.out.println(result);
    }
}
