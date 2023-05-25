package prakPemlan.tugas8;

class Invoice implements Payable {
    private String productName;
    private Integer quantity;
    private Integer pricePerItem;

    public Invoice(String productName, Integer quantity, Integer pricePerItem) {
        this.productName = productName;
        this.quantity= quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getpricePerItem() {
        return pricePerItem;
    }

    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }
}
