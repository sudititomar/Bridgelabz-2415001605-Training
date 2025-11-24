import java.util.*;

public class SmartHome{
    interface LightAction { void activate(); }

    public static void main(String[] args) {
        Map<String, LightAction> actions = new HashMap<>();
        actions.put("motion", () -> System.out.println("Turn light ON (motion detected)"));
        actions.put("evening", () -> System.out.println("Set to warm dim mode (evening)"));
        actions.put("voice", () -> System.out.println("Change color to blue (voice command)"));

        actions.get("motion").activate();
        actions.get("evening").activate();
        actions.get("voice").activate();
    }
}
