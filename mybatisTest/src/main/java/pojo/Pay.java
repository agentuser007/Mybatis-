package pojo;

public class Pay {
    int payment_method_id;
    String name;

    public int getpayment_method_id() {
        return payment_method_id;
    }

    public String getName() { return name; }

    public void setpayment_method_id(int payment_method_id) {
        this.payment_method_id = payment_method_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pay{" +
                "payment_method_id =" + payment_method_id +
                ", name='" + name + '\'' +
                '}';
    }
}
