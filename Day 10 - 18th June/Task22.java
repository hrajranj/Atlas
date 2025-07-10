import java.io.*;

class FileRenameDemo {
    public static void main(String args[]) {
        if (args.length < 2) {
            System.out.println("Usage: java FileRenameDemo <oldfilename> <newfilename>");
            return;
        }

        File f1 = new File(args[0]);
        File f2 = new File(args[1]);

        if (f1.renameTo(f2)) {
            System.out.println("Renamed file " + f1.getName() + " to " + f2.getName() + " successfully.");
        } else {
            System.out.println("Failed to rename file. Make sure the original file exists and is not open.");
        }
    }
}
