package action;

import com.opensymphony.xwork2.Action;

public class ViewCartAction implements Action {
    @Override
    public String execute() throws Exception {
        return "VIEW_CART";
    }
}
