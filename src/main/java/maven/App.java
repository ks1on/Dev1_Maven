package maven;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        System.out.println(new Gson().toJson(new User("Tychon", "Vilkhovyi")));
    }
    static class User {
        public String name;
        public String lastName;

        public User (String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }
    }
}
