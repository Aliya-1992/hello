package HomeTask3.Task4;
import java.lang.Math;
import java.text.DecimalFormat;


public class Logo {
    private double osnovanieLogo;
    private double argunentLogo;

    public Logo(double osnovanieLogo, double argunentLogo){
        this.osnovanieLogo = osnovanieLogo;
        this.argunentLogo = argunentLogo;
    }
    public double logo(){
        double res = Math.log(argunentLogo) / Math.log(osnovanieLogo);
        return res;

    }
}
