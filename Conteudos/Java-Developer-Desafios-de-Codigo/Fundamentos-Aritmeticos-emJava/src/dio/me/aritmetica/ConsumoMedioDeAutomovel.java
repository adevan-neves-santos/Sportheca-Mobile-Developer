package dio.me.aritmetica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;

public class ConsumoMedioDeAutomovel {
    public static void main(String[] args){
        BigDecimal km;
        BigDecimal combustivel;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            km = new BigDecimal(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            combustivel = new BigDecimal(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BigDecimal comMedio = km.divide(combustivel, MathContext.DECIMAL32).setScale(3, BigDecimal.ROUND_HALF_EVEN);

        System.out.println("" + comMedio + " km/l");
    }
}
