package com.java.threads;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Given a file that contains a list of numbers, print all the lines where the
 * number is divisible by 97
 * 
 * Creating 4 threads to read the file, each thread will process 200 lines at a
 * time.
 * 
 * @author Rajesh Bhoopathy Raju
 */
public class ReadFileContent {

	public static void main(String[] args) throws Exception {
		ReadFromFile f = new ReadFromFile();
		f.setN(97);
		Thread t1 = new Thread(f, "Thread A");
		Thread t2 = new Thread(f, "Thread B");
		Thread t3 = new Thread(f, "Thread C");
		Thread t4 = new Thread(f, "Thread D");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

class ReadFromFile implements Runnable {

	private static BufferedReader br = null;

	private int n = 0;

	public void setN(int n) {
		this.n = n;
	}

	static {
		try {
			br = new BufferedReader(new FileReader("src/t/lines.txt"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		String line = null;
		int count = 0;
		while (true) {
			synchronized (br) {
				try {
					while ((line = br.readLine()) != null) {
						boolean isDivisibleByN = Integer.parseInt(line) % n == 0;

						if (count < 200) {
							if (isDivisibleByN) {
								System.out.println(Thread.currentThread().getName() + " --> " + line);
							}
							++count;
						} else {
							if (isDivisibleByN) {
								System.out.println(Thread.currentThread().getName() + " --> " + line);
							}
							count = 0;
							System.out.println("---------------------------------------------------");
							break;
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
					break;
				}
			}
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (line == null)
				break;
		}
	}

}