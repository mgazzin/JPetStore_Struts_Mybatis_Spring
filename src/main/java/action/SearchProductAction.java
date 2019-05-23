package action;

import com.opensymphony.xwork2.Action;

public class SearchProductAction implements Action {
    @Override
    public String execute() throws Exception {
        return "SEARCH_PRODUCT";
    }
}
