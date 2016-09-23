package hw3.catalogStatusCheck;

/**
 * 5) Реализуйте программу которая с периодичностью 1 сек,
 будет проверять состояние заданного каталога. Если в этом
 каталоге появиться новый файл или исчезнет, то выведет
 сообщение  об  этом событии. Программа должна  работать в
 параллельном  потоке выполнения.
 */
public class Main {
	public static void main(String[] args) {
		 CatalogStatusCheck catalogStatusCheck = new CatalogStatusCheck("F:\\__one\\");
		catalogStatusCheck.checkCatalog();
	}
}
