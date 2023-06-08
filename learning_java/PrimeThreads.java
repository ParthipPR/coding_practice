import java.util.Random;

/*
   Create 3 threads
   1st thread should read num b/w 50 and 80
   if num is prime 2nd thread should print square of num
   else 3rd thread display the number
 */

//thread1
class Thread1 extends Thread{
    
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
    public void run(){
        
        Random random = new Random();
        while(true){
            int num = random.nextInt(31) + 50;
            if (isPrime(num)){
                Thread2 pThread = new Thread2(num);
                pThread.start();
                }
            else {
                Thread3 nThread = new Thread3(num);
                nThread.start();
            }
            try {
                Thread.sleep(1000);
            } 
            catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
     

    }
}

//thread2
class Thread2 extends Thread{
    int number;
    Thread2(int prime){
        number = prime;
       
    }

    public void run(){
        System.out.println("The number is prime("+ number +"), the square of the number is :"+number*number);
    }
}

//thread3
class Thread3 extends Thread{
    int number;
    Thread3(int nonprime){
        number = nonprime;
        
    }

    public void run(){
        System.out.println("The number is not prime :"+ number );
    }
}

public class PrimeThreads {
	public static void main(String args[]) {
		Thread1 Thread = new Thread1();
        Thread.start();
	}
}

/*
1.Start
2.Create a class called "Thread1" that extends "Thread" class
3.Define a static method called "isPrime" in the "Thread1" class that takes an integer as input and returns a boolean value indicating whether the input integer is prime or not
4.Override the "run" method in the "Thread1" class
5.Inside the "run" method, create a new instance of the "Random" class
6.Use a while loop to generate a random integer between 50 and 80 (inclusive) indefinitely
7.Check if the generated integer is prime by calling the "isPrime" method, and create a new instance of "Thread2" with the generated integer as a parameter and start the thread if the integer is prime
8.If the generated integer is not prime, create a new instance of "Thread3" with the generated integer as a parameter and start the thread
9.Use a try-catch block to handle InterruptedException and sleep the thread for 1000 milliseconds after each iteration of the loop
10.Create a class called "Thread2" that extends "Thread" class and has a constructor that takes an integer as input
11.Override the "run" method in the "Thread2" class and print the message "The number is prime (input integer), the square of the number is: (input integer squared)"
12.Create a class called "Thread3" that extends "Thread" class and has a constructor that takes an integer as input
13.Override the "run" method in the "Thread3" class and print the message "The number is not prime: (input integer)"
14.Create a "main" method in the "PrimeThreads" class
15.Create an instance of "Thread1" and start the thread
16.Stop


 */