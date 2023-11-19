package interface_adapter.clear_users;


public class ClearState {
    private String usersDeleted = "";

    public ClearState(ClearState copy){
        this.usersDeleted = copy.getUsersDeleted();
    }
    public ClearState() {
    }

    public String getUsersDeleted(){ return usersDeleted; }

    public void setUsersDeleted(String UsersDeleted){
        this.usersDeleted = UsersDeleted;
    }

}
