package homework10;

public class User implements Cloneable {

    private String userName;
    private int id;
    private Role role;

    public User(String userName, int id, Role role) {
        this.id = id;
        this.userName = userName;
        this.role = role;
    }

    @Override
    public String toString() {
        return  "User:" +
                "Id: " + this.id +
                "User Name: " + this.userName +
                "Role: " + role.roleName;
    }

    @Override
    public int hashCode() {
        return (id+userName.hashCode())*2;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        User p = (User) obj;
        return this.userName == p.userName  && this.id == p.id;
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    protected User deepClone() throws CloneNotSupportedException {
        User newUser = (User) super.clone();
        newUser.role = (Role) super.clone();
        return newUser;

    }
}
