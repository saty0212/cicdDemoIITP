//import org.junit.jupiter.api.Test;
//import java.lang.reflect.Method;

public class myApp {
    public static void main(String[] args) {
        System.out.println("=== Math Application ===");
        System.out.println("Hello, World!");
        System.out.println("Sum: " + MathUtil.add(5, 10));
        System.out.println();
        
        // Run tests
        //runTests();
    }
    /* 
    public static void runTests() {
        Class<?> testClass = MathUtilTest.class;
        Method[] methods = testClass.getDeclaredMethods();
        int passed = 0, failed = 0;
        
        System.out.println("=== Running Unit Tests ===");
        System.out.println("Tests from: " + testClass.getName());
        System.out.println("=====================================");
        
        try {
            Object testInstance = testClass.getDeclaredConstructor().newInstance();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Test.class)) {
                    try {
                        method.invoke(testInstance);
                        System.out.println("✓ " + method.getName() + " PASSED");
                        passed++;
                    } catch (Exception e) {
                        System.out.println("✗ " + method.getName() + " FAILED");
                        System.out.println("  Error: " + e.getCause());
                        failed++;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("=====================================");
        System.out.println("Tests run: " + (passed + failed) + ", Passed: " + passed + ", Failed: " + failed);
    }
    */
}
