public class BuddyInfo {

    private String name;

    public BuddyInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        AddressBook buddies = new AddressBook();
        BuddyInfo homer = new BuddyInfo("Homer");

        System.out.println("Hello " + homer.getName());
    }
}
