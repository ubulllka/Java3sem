package prac32;
import java.io.Serializable;

public interface Alcoholable extends Serializable {
    boolean isAlcoholicDrink();
    double getAlcoholVol();
}