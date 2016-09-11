package session2;

/**
 * Created by ZaR on 10-Sep-16.
 */
public class CatController {
    public  void saveCat(DAOCats daoCatsImplementation, Cat cat){
        daoCatsImplementation.saveCat(cat);
    }

    public Cat loadCat(DAOCats daoCatsImplementation){
        return daoCatsImplementation.loadCat();
    }
}
