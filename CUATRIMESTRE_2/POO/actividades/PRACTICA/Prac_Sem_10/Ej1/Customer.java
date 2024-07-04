package CUATRIMESTRE_2.POO.actividades.PRACTICA.Prac_Sem_10.Ej1;

public class Customer {
    private int customerID;
    private String name;
    private Address address;
    private int phoneNumber;
    private String emailAddress;
    private char status;
    private double totalPurchases;

    public Customer(int customerID, String name, Address address, int phoneNumber, String emailAddress, char status,
            double totalPurchases) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.status = status;
        this.totalPurchases = totalPurchases;
    }

    // setters
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(Address address) {
        if (address != null) {
            this.address = address;
        } else {
            System.out.println("Dirección inválida. Debe proporcionar una dirección.");
        }
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void setTotalPurchases(double totalPurchases) {
        this.totalPurchases = totalPurchases;
    }

    // getters
    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public Address getAdress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAdress() {
        return emailAddress;
    }

    public char getStatus() {
        return status;
    }

    public double getTotalPurchases() {
        return totalPurchases;
    }

    public String toString() {
        return "Customer ID: " + customerID + "\n" +
                "Name: " + name + "\n" +
                "Address: " + address.toString() + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Email Address: " + emailAddress + "\n" +
                "Status: " + status + "\n" +
                "Total Purchases: " + totalPurchases;
    }
}
