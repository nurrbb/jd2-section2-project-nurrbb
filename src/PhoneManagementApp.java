
import java.util.ArrayList;
import java.util.List;

public class PhoneManagementApp {

    public List<Phone> phones;
    private List<Apps> apps;
    private List<Contact> contacts;
    private double totalStorage;
	

	public PhoneManagementApp() {
		 phones = new ArrayList<>();
	        apps = new ArrayList<>();
	        contacts = new ArrayList<>();
	        totalStorage = 0;

	        addDefaultPhones();
	        addDefaultApps();
	        addDefaultContacts();
	}
    private void addDefaultPhones() {
        Phone phone1 = new Phone("Samsung", "Galaxy S10", "123456789", 64, "Android");
        Phone phone2 = new Phone("Apple", "iPhone 12", "987654321", 128, "iOS");

        phones.add(phone1);
        phones.add(phone2);

        totalStorage += phone1.getStorageCapacity();
        totalStorage += phone2.getStorageCapacity();
    }

    private void addDefaultApps() {
		Apps app1 = new Apps("WhatsApp", "1.0", 30);
		Apps app2 = new Apps("Instagram", "2.5", 50);
		Apps app3 = new Apps("Facebook", "3.2", 100);

        apps.add(app1);
        apps.add(app2);
        apps.add(app3);
    }

    private void addDefaultContacts() {
		Contact contact1 = new Contact("John", "Doe", "1234567890", "john.doe@example.com");
		Contact contact2 = new Contact("Jane", "Smith", "9876543210", "jane.smith@example.com");

        contacts.add(contact1);
        contacts.add(contact2);
    }


	public void addPhone(Phone phone) {
		phones.add(phone);
	}

	public void listPhone() {

		for (Phone phone : phones) {
			System.out.println(phone);
		}
	}

	public void deletePhone(String serialNumber) {
		Phone phoneToDelete = null;
		for (Phone phone : phones) {
			if (phone.getSerialNumber().equals(serialNumber)) {
				phoneToDelete = phone;
				break;
			}
		}

		if (phoneToDelete != null) {
			phones.remove(phoneToDelete);
			System.out.println("Succesfully deleted.");
		} else {
			System.out.println("Error: Serial number not found.");
		}
	}

    public void listContacts(Phone phone) {
        System.out.println("Contacts saved on " + phone.getBrand() + " " + phone.getModel() + ":");
        List<Contact> contacts = phone.getContacts();
        if (contacts.isEmpty()) {
            System.out.println("No contacts saved.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public void checkStorage(Phone phone) {
        int occupiedStorage = phone.getOccupiedStorage();
        int availableStorage = phone.getAvailableStorage();

        System.out.println("Storage information for " + phone.getBrand() + " " + phone.getModel() + ":");
        System.out.println("Occupied Storage: " + occupiedStorage + " MB");
        System.out.println("Available Storage: " + availableStorage + " MB");
    }
	public void addApp(Apps app) {
        apps.add(app);
    }

    public void removeApp(Apps app) {
        apps.remove(app);
    }


    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }

    
}
