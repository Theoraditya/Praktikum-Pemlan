package prakPemlan.tugas8;

class Employee implements Payable {
    private Integer registrationNumber;
    private String name;
    private Integer salaryPerMonth;
    private Invoice[] invoices;

    public Employee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalInvoicesAmount = 1;
        for (Invoice invoice : invoices) {
            totalInvoicesAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoicesAmount;
    }
}
