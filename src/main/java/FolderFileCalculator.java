import java.io.File;

public class FolderFileCalculator {

    public static long fileSize=0;
    public static void main(String[] args) {

        String basePath ="F:\\MyCourse\\repo\\algorithm";
        
        
        printAllDetails(basePath);
        System.out.println("Total File Size Would be ");
        System.out.println(fileSize);


    }

    private static void printAllDetails(String basePath) {

        File f = new File(basePath);
        File[] files = f.listFiles();

        for (File f01 : files)
        {

            if (f01.isDirectory())
            {

                System.out.println( "************************** " +f01+"****************************************");

                                   printAllDetails(f01.toString());

                System.out.println("************************************************"+f01 +"****************************************");
            }
            else
            {

                System.out.println("-->"+f01+" ===="+f01.length());
                fileSize =fileSize+f01.length();


            }

        }





    }
}
