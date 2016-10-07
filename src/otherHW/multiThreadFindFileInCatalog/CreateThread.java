package otherHW.multiThreadFindFileInCatalog;

public class CreateThread implements Runnable{

	private Research rs;
	private String folder;
	private String file;
	private int start;
	private int end;
	private Thread thr;

	public CreateThread(Research rs, String folder, String file, int start, int end) {
		super();
		this.rs = rs;
		this.folder = folder;
		this.file = file;
		this.start = start;
		this.end = end;
		thr = new Thread(this);
		thr.start();
	}

	public Thread getThr() {
		return thr;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		rs.find(folder, file, start, end);

	}
}
