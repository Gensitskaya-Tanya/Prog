package otherHW.mult;

import java.io.File;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SearchController {
	ExecutorService pool;
	ConcurrentLinkedQueue<File> queue;
	ConcurrentLinkedQueue<String> searchResult;
	int threadNo;
	String pattern;
	public SearchController(String startDirectory, String pattern,
							final int threadNo) {

		queue = new ConcurrentLinkedQueue<File>();
		searchResult = new ConcurrentLinkedQueue<String>();
		this.pattern = pattern;
		pool = Executors.newFixedThreadPool(threadNo);
		this.threadNo = threadNo;

		queue.add(new File(startDirectory));
		System.out.println(new File(startDirectory).getAbsolutePath());
	}

	public void startSearch() throws Exception {

		for (int i = 0; i < threadNo; i++) {
			pool.execute(new SearchAgent(queue, searchResult, pattern));
			System.out.println("Thread #" + (i + 1) + " has been started");
			Thread.sleep(10);
		}
		pool.shutdown();
		pool.awaitTermination(00, TimeUnit.SECONDS);
	}
}
