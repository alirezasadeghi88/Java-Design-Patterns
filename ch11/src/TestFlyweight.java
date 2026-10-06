public class TestFlyweight {
    public static void main(String[] args) {
        Code code=new Code();
        code.setCode("CCode...");
        Platform platform=PlatformFactory.getPlatformInstance("C");
        platform.execute(code);
        System.out.println("*************************");
        code=new Code();
        code.setCode("CCode2...");
        platform=PlatformFactory.getPlatformInstance("C");
        platform.execute(code);
        System.out.println("*************************");
        code=new Code();
        code.setCode("JAVACode...");
        platform=PlatformFactory.getPlatformInstance("JAVA");
        platform.execute(code);
        System.out.println("*************************");
        code=new Code();
        code.setCode("JAVACode2...");
        platform=PlatformFactory.getPlatformInstance("JAVA");
        platform.execute(code);
        System.out.println("*************************");
        code=new Code();
        code.setCode("RUBYCode...");
        platform=PlatformFactory.getPlatformInstance("RUBY");
        platform.execute(code);
        System.out.println("*************************");
        code=new Code();
        code.setCode("RUBYCode2...");
        platform=PlatformFactory.getPlatformInstance("RUBY");
        platform.execute(code);
    }
}
