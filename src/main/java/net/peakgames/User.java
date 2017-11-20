package net.peakgames;

public class User {
    private String name;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!getName().equals(user.getName())) return false;
        return getEmail().equals(user.getEmail());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getEmail().hashCode();
        return result;
    }
}
