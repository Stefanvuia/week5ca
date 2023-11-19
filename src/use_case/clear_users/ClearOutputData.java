package use_case.clear_users;

import java.util.List;


public class ClearOutputData {
    private final List<String> accountsDeleted;

    public ClearOutputData(List<String> accountsDeleted){
        this.accountsDeleted = accountsDeleted;
    }

    public List<String> getAccountsDeleted(){
        return this.accountsDeleted;
    }

}
