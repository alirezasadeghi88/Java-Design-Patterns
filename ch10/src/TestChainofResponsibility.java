public class TestChainofResponsibility {
    public static void main(String[] args) {
        File file=null;
        Handler textHandler=new TextFileHandler("TextHandler");
        Handler docHandler= new DocFileHandler("DocHandler");
        Handler excelHandler = new ExcelFileHandler("ExcelHandler");
        Handler audioHandler = new AudioFileHandler("AudioHandler");
        Handler videoHandler = new VideoFileHandler("VideoHandler");
        Handler imageHandler = new ImageFileHandler("ImageHandler");

        textHandler.setHandler(docHandler);
        docHandler.setHandler(excelHandler);
        excelHandler.setHandler(audioHandler);
        audioHandler.setHandler(videoHandler);
        videoHandler.setHandler(imageHandler);

        file=new File("Abc.mp3","audio","C:");
        textHandler.process(file);

        file=new File("Abc.jpg","video","C:");
        textHandler.process(file);

        file=new File("Abc.doc","doc","C:");
        textHandler.process(file);

        file=new File("Abc.bat","bat","C:");
        textHandler.process(file);
    }
}
