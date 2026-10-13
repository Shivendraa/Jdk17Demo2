package java8;

import java.util.Optional;

class User {
    private String name;
    private String city;

    public User(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}

public class OptionalDemo {
    public static void main(String[] args) {
        //optional - container
        //may hold null or non-null values
        //to avoid null pointer exceptions
        //to represent presence or absence of object

        //User user = new User("Shiv",null); //fetching it from DB
        User user = null; //sometimes it fails

//        Optional<User> optionalUser = Optional.ofNullable(user);
//
//        if(optionalUser.isPresent()){
//        optionalUser.get().getCity();
//        }

        System.out.println(getUserCity(user));

    }

    private static String getUserCity(User user){
        return Optional.ofNullable(user)
                .map(User::getName)
                .orElse("Unknown");
    }
}
