//Created By 21CE105 VRAJ PATEL

// Write a program to create thread which display “Hello World” message.
// A. by extending Thread class
// B. by using Runnable interface.

//Github Link = https://github.com/PatelVraj10/java-practical-file-6

class MyThread extends Thread{
    
    public void run()
    {
        try {
                System.out.println("Hello World");
        } catch (Exception e) {
            System.out.println("Exception Occured");
        }
    }
}

public class PR_6_1_1 {
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        t1.start();
    }
}
