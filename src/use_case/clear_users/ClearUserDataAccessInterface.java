package use_case.clear_users;

import java.io.IOException;
import java.util.List;

public interface ClearUserDataAccessInterface {
    void clear() throws IOException;

    List<String> getAccounts();
}
