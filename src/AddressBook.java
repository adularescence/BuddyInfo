import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

public class AddressBook {

    // underlying data
    private Map<String, BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new HashMap<String, BuddyInfo>();
    }

    public void addBuddy(String name, BuddyInfo buddy) {
        if (this.buddies.containsKey(name)) {
            System.out.println("This address book already contains a BuddyInfo for '" + name + "'.");
        }
        this.buddies.put(name, buddy);
    }

    public void removeBuddy(String name) {
        if (this.buddies.containsKey(name)) {
            this.buddies.remove(name);
            System.out.println("Removed BuddyInfo associated with name '" + name + "'.");
        } else {
            System.out.println("There was no BuddyInfo associated with name '" + name + "' to remove.");
        }
    }

    public String toString() {
        Collection<BuddyInfo> buddyList = this.buddies.values();
        String[] contents = new String[buddyList.size()];
        int i = 0;
        for (BuddyInfo buddy : buddyList) {
            contents[i++] = buddy.toString();
        }
        return "AddressBook contents:\n" + String.join("\n", contents);
    }
}
