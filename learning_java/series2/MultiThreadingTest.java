import java.util.Random;

class RandomNumberThread extends Thread {
	public void run() {
		Random random = new Random();
		while (true) {
			int randomInteger = random.nextInt(20);
			System.out.println("Random Integer generated : " + randomInteger);
			if((randomInteger%2) == 0) {
				EvenThread sThread = new EvenThread(randomInteger);
				sThread.start();
			}
			else {
				OddThread cThread = new OddThread(randomInteger);
				cThread.start();
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

class EvenThread extends Thread {
	int number;

	EvenThread(int randomNumbern) {
		number = randomNumbern;
	}

	public void run() {
		System.out.println("The even numbers between 1 and "+ number+" are :");
		for (int i = 1; i <= number; i++){
			if ((i%2) == 0){
				System.out.print(i+" ");
			}
		}
		System.out.println();

		
	}
}

class OddThread extends Thread {
	int number;

	OddThread(int randomNumber) {
		number = randomNumber;
	}

	public void run() {
		System.out.println("The odd numbers between 1 and "+ number+" are :");
		for (int i = 1; i <= number; i++){
			if ((i%2) != 0){
				System.out.print(i+" ");
			}
		}
		System.out.println();

	}
}

public class MultiThreadingTest {
	public static void main(String args[]) {
		RandomNumberThread rnThread = new RandomNumberThread();
		rnThread.start();
	}
}
