package homework10;

public class Role implements Cloneable{

    protected String roleName;

    public Role(String roleName){
        this.roleName = roleName;
    }

    @Override
    protected Role clone() throws CloneNotSupportedException {
        return (Role) super.clone();
    }
}
