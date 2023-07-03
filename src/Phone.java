import java.util.ArrayList;
import java.util.List;

public class Phone {
	
	 private String brand;
	 private String model;
	 private String serialNumber;
	 private int storageCapacity;
	 private String operatingSystem;
	 List<Apps> apps;
	 List<Contact> contacts;
	 
	 public Phone(String brand, String model, String serialNumber, int storageCapacity, String operatingSystem) {
	        this.brand = brand;
	        this.model = model;
	        this.serialNumber = serialNumber;
	        this.storageCapacity = storageCapacity;
	        this.operatingSystem = operatingSystem;
	        this.apps = new ArrayList<>();
	        this.contacts = new ArrayList<>();
	    }

	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", model=" + model + ", serialNumber=" + serialNumber + ", storageCapacity="
				+ storageCapacity + ", operatingSystem=" + operatingSystem + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public List<Apps> getApps() {
		return apps;
	}

	public void setApps(List<Apps> apps) {
		this.apps = apps;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
    public int getOccupiedStorage() {
        int occupiedStorage = 0;
        for (Apps app : apps) {
        	occupiedStorage += app.getSize();
        }
        return occupiedStorage;
    }

    public int getAvailableStorage () {
        return storageCapacity - getOccupiedStorage();
    }

    public static Phone getPhoneBySerialNumber(List<Phone> phones, String serialNumber) {
        for (Phone phone : phones) {
            if (phone.getSerialNumber().equals(serialNumber)) {
                return phone;
            }
        }
        return null;
    } 

}
