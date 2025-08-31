public class MeaningfulNaming {
    private String customerName;
    private int customerAge;

    public MeaningfulNaming(String name, int age) {
        this.customerName = name;
        this.customerAge = age;
    }

    public void printCustomerInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Age: " + customerAge);
    }
}
