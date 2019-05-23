package action;

import com.opensymphony.xwork2.Action;

public class Demoaction implements Action {
    @Override
    public String execute() throws Exception {
        return "SUCCESS";
    }
}
