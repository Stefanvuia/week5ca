package use_case.clear_users;


import java.io.*;
import java.util.List;


public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;



    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject, ClearOutputBoundary clearPresenter){
        this.userDataAccessObject = userDataAccessObject;
        this.clearPresenter = clearPresenter;
    }
    @Override
    public void execute() throws IOException{
        List<String> accountsDeleted = userDataAccessObject.getAccounts();
        ClearOutputData clearOutputData = new ClearOutputData(accountsDeleted);
        userDataAccessObject.clear();
        clearPresenter.prepareSuccessView(clearOutputData);

    }
}
