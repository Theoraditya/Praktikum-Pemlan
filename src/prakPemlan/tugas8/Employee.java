package prakPemlan.tugas8;

class Employee implements Payable {
    private Integer nomorReg;
    private String nama;
    private Double gajiPerBulan;
    private Invoice[] invoices;

    public Employee(Integer nomorReg, String nama, Double gajiPerBulan, Invoice[] invoices) {
        this.nomorReg = nomorReg;
        this.nama = nama;
        this.gajiPerBulan = gajiPerBulan;
        this.invoices = invoices;
    }

    public Integer getNomorReg() {
        return nomorReg;
    }

    public String getNama() {
        return nama;
    }

    public Double getGajiPerBulan() {
        return gajiPerBulan;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalInvoicesAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoicesAmount += invoice.getPayableAmount();
        }
        return gajiPerBulan - totalInvoicesAmount;
    }
}
