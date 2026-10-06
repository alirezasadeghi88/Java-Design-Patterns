public class JavaPlatform implements Platform{
    public JavaPlatform(){
        System.out.println("Java Platform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing Java code.");
    }
}
