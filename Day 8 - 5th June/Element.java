import java.util.HashMap;
import java.util.Map;

public enum Element {

    H("Hydrogen", 1, 1.008f),
    HE("Helium", 2, 4.0026f),
    LI("Lithium", 3, 6.94f),
    BE("Beryllium", 4, 9.0122f),
    B("Boron", 5, 10.81f),
    C("Carbon", 6, 12.011f),
    N("Nitrogen", 7, 14.007f),
    O("Oxygen", 8, 15.999f),
    F("Fluorine", 9, 18.998f),
    NE("Neon", 10, 20.180f);

    private static final Map<String, Element> BY_LABEL = new HashMap<>();
    private static final Map<Integer, Element> BY_ATOMIC_NUMBER = new HashMap<>();
    private static final Map<Float, Element> BY_ATOMIC_WEIGHT = new HashMap<>();

    static {
        for (Element e : values()) {
            BY_LABEL.put(e.label, e);
            BY_ATOMIC_NUMBER.put(e.atomicNumber, e);
            BY_ATOMIC_WEIGHT.put(e.atomicWeight, e);
        }
    }

    public final String label;
    public final int atomicNumber;
    public final float atomicWeight;

    private Element(String label, int atomicNumber, float atomicWeight) {
        this.label = label;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public static Element valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }

    public static Element valueOfAtomicNumber(int number) {
        return BY_ATOMIC_NUMBER.get(number);
    }

    public static Element valueOfAtomicWeight(float weight) {
        return BY_ATOMIC_WEIGHT.get(weight);
    }

    // ✅ Main method to display all enum values
    public static void main(String[] args) {
        System.out.println("All Elements:");
        for (Element e : Element.values()) {
            System.out.println("Symbol: " + e.name() +
                               ", Label: " + e.label +
                               ", Atomic Number: " + e.atomicNumber +
                               ", Atomic Weight: " + e.atomicWeight);
        }

        // 🔍 Test specific lookups
        System.out.println("\nLookup by label 'Oxygen': " + Element.valueOfLabel("Oxygen"));
        System.out.println("Lookup by atomic number 2: " + Element.valueOfAtomicNumber(2));
        System.out.println("Lookup by atomic weight 6.94f: " + Element.valueOfAtomicWeight(6.94f));
    }
}
