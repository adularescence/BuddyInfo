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
        BuddyInfo homer = new BuddyInfo("Homer Simpson");

        buddies.addBuddy("Homer Simpson", homer);
        buddies.removeBuddy("Homer Simpson");
    }
}
