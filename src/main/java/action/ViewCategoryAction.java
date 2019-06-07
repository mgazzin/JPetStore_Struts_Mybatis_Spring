package action;

import domain.Category;
import domain.Product;
import service.CatalogService;

import java.util.List;

public class ViewCategoryAction extends AbstractAction {

    private CatalogService catalogService;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    private String categoryId;
    public String viewCategory(){
//        Category category=catalogService.getCategory(categoryId);
//        List<Product>productList=catalogService.getProductListByCategory(categoryId);
//        System.out.println(category);
//        session.put("category",category);
//        session.put("productList",productList);
       return "VIEW_CATEGORY";
    }
}
