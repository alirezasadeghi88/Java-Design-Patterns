import java.util.HashMap;
import java.util.Map;

public class PlatformFactory {
    private static Map<String,Platform> map=new HashMap<>();
    private PlatformFactory(){
        throw new AssertionError("Cannot instantiate the class");
    }
}
