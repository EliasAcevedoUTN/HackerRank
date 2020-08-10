import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Time_Conversion {
	static String timeConversion(String s) {
		String resultado = "";
		String horario = s.substring(s.length() - 2, s.length());
		int hora = Integer.parseInt(s.substring(0, 2));
		if (horario.equals("AM") && hora == 12) {
			resultado = "00" + s.substring(2, s.length() - 2);
		} else if (horario.equals("PM") && hora == 12) {
			resultado = hora + s.substring(2, s.length() - 2);
		} else if (horario.equals("PM")) {
			hora += 12;
			resultado = hora + s.substring(2, s.length() - 2);

		} else {

			resultado = s.substring(0, s.length() - 2);
		}
		return resultado;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String s = "12:05:39PM";

		String result = timeConversion(s);
		System.out.println(result);

	}
}
