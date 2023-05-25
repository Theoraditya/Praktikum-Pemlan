package prakPemlan.tugas8;

public class mainKoperasi {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Samsung Smart TV 43 inch", 1, 4279000);
        Invoice invoice2 = new Invoice("GREE Tower Fan Air Cooler", 2, 1099000);
        Invoice invoice3 = new Invoice("Karpet Permadani Shafira 275x350 cm", 1, 805000);

        Invoice[] invoices = {invoice1, invoice2, invoice3};

        Employee employee = new Employee(101, "Jamaluddin", 10000000, invoices);


        System.out.println("==================[Informasi_Karyawan]==================");
        System.out.println("Nomor Registrasi    : " + employee.getRegistrationNumber() +
                           "\nNama                : " + employee.getName() +
                           "\nGaji Per Bulan      : Rp" + employee.getSalaryPerMonth());

        System.out.println("\n====================[DETAIL_BELANJA]====================");
        for (Invoice invoice : employee.getInvoices()) {
            System.out.println("Nama Produk     : " + invoice.getProductName() +
                               "\nJumlah          : " + invoice.getQuantity() +
                               "\nHarga Per Item  : Rp" + invoice.getpricePerItem() +
                               "\nTotal Harga     : Rp" + invoice.getPayableAmount());
            System.out.println();
        }

        double totalGajiSetelahPotong = employee.getPayableAmount();
        System.out.println("\nTotal gaji saat ini : Rp" + totalGajiSetelahPotong);
        System.out.println("===========================================================");
    }
}
