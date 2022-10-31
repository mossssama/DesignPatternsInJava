package builderdesignpattern;

public class BuilderDesignPattern {

    public static void main(String[] args) {
        
         User user1 = new User.UserBuilder("Mohamed", "Osama")
	.age(23)
	.phone("01007025929")
	.address("Fustat")
	.build();

	System.out.println(user1);
    }
    
}
