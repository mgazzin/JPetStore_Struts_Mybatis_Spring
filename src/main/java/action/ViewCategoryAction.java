package action;

import com.opensymphony.xwork2.Action;

import java.util.List;

public class ViewCategoryAction implements Action {
    @Override
    public String execute() throws Exception {
       return "VIEW_CATEGORY";
    }
}
