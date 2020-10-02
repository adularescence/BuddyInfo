public class BuddyInfo {

    private String name;
    private String phoneNumber;

    public BuddyInfo(String name) {
        this(name, "Update me!");
    }

    public BuddyInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "[" + this.name  + "]" + "\n\tTel: " + this.phoneNumber;
    }

    public static void main(String[] args) {
        AddressBook buddies = new AddressBook();
        BuddyInfo homer = new BuddyInfo("Homer Simpson", "(613) 123-4567");

        buddies.addBuddy("Homer Simpson", homer);
        buddies.addBuddy("Imposter", new BuddyInfo("Imposter"));
        System.out.println(buddies.toString());
        buddies.removeBuddy("Homer Simpson");
    }
}
