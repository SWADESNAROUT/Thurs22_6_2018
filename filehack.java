import java.io.*;
public class filehack
{
    public static void main(String args[]) throws IOException
    {
        File f1 = new File("D:/swa.txt");
        f1.createNewFile();

        System.out.println("IS WRITABLE:"+f1.canWrite());
        System.out.println("SIZE:" + f1.length());
        System.out.println(f1.getName());
        System.out.println(f1.exists());

        f1.delete();

    }
}
