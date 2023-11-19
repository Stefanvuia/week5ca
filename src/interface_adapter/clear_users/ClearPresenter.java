package interface_adapter.clear_users;


import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;


import java.util.List;

public class ClearPresenter implements ClearOutputBoundary {
    private final SignupViewModel signupViewModel;

    public ClearPresenter(SignupViewModel signupViewModel) {
        this.signupViewModel = signupViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData clearOutputData) {
        String response = "";
        List<String> usernames = clearOutputData.getAccountsDeleted();
        for (String username: usernames){
            response = username + "\n" + response;
        }

        ClearState clearState = signupViewModel.getClearState();
        clearState.setUsersDeleted(response);
        signupViewModel.setClearState(clearState);
        signupViewModel.firePropertyChanged2();
    }

}
