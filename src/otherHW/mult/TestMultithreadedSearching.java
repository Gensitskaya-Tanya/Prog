package otherHW.mult;

public class TestMultithreadedSearching {


	public static void main(String[] args) throws Exception {
		SearchController search = new SearchController("F:\\", "3.txt", 10);
		search.startSearch();

		//After finishing,Printing Result
		for (String s : search.searchResult)
			System.out.println(s);
	}
}