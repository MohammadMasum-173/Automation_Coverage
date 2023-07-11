public class NonVegan extends Person {
    public void eats(){
        System.out.println("eats meat only");
    }

    @Override
    public void chills() {
        System.out.println("doesn't");
    }
}
