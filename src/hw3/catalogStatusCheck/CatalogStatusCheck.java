package hw3.catalogStatusCheck;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * 5) Реализуйте программу которая с периодичностью 1 сек,
 будет проверять состояние заданного каталога. Если в этом
 каталоге появиться новый файл или исчезнет, то выведет
 сообщение  об  этом событии. Программа должна  работать в
 параллельном  потоке выполнения.
 */
public class CatalogStatusCheck {
	private String inputPath;
	private File file;
	private String[] fileNamesArray;
	private boolean checkStatus = true;

	public CatalogStatusCheck(String inputPath) {
		this.inputPath = inputPath;
		this.file = new File(inputPath);
	}


	public void checkCatalog(){
		while (checkStatus){
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					fileNamesArray = file.list();
					List<String> fileNamesArrayList = Arrays.asList(fileNamesArray);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					String[] fileNamesArrayTemp = file.list();
					List<String> fileNamesArrayTempList = Arrays.asList(fileNamesArrayTemp);

					if (fileNamesArrayList.size()>fileNamesArrayTempList.size()){
						System.out.println("delete file!!!!");
					}else if(fileNamesArrayList.size()<fileNamesArrayTempList.size()){
						System.out.println("add file!!!!");
					}
				}
			});
			thread.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
