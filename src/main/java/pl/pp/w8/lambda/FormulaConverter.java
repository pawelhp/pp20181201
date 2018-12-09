package pl.pp.w8.lambda;

@FunctionalInterface
public interface FormulaConverter {
    double fromCelToFah(double celsius);
    default double fromFahToCel(double fahr){
        return 0;
    }
}
