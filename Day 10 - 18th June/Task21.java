import java.io.*;

class Task21 {
    public static void main(String args[]) {
        try {
            FileInputStream file1 = new FileInputStream("FileName02.txt");
            FileInputStream file2 = new FileInputStream("FileNameRenamed.txt");
            SequenceInputStream file3 = new SequenceInputStream(file1, file2);

            BufferedInputStream br1 = new BufferedInputStream(file3);
            BufferedOutputStream br2 = new BufferedOutputStream(System.out);

            int ch;
            while ((ch = br1.read()) != -1) {
                br2.write(ch);  // ✅ No char cast needed
            }

            br2.flush();  // ✅ Ensure all bytes are written
            System.out.println("\nMerge Two Files Successfully.");  // ✅ Print after flush

            // Close resources
            br1.close();
            br2.close();
            file1.close();
            file2.close();
        } catch (IOException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        }
    }
}
