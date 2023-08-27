import java.util.HashMap;
import java.util.Map;

class FabricaArboles {
    private Map<String, Arbol> arboles = new HashMap<>();

    public Arbol obtenerArbol(String tipoHojas) {
        if (arboles.containsKey(tipoHojas)) {
            return arboles.get(tipoHojas);
        } else {
            Arbol nuevoArbol = new Arbol(tipoHojas);
            arboles.put(tipoHojas, nuevoArbol);
            return nuevoArbol;
        }
    }
}