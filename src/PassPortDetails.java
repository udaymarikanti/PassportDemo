public class PassPortDetails {
    private String name;
    private  int passPortNo;
    private  int passportValidity;

    private int mobileNo;

    public PassPortDetails(String name, int passPortNo, int passportValidity, int mobileNo) {
        this.name = name;
        this.passPortNo = passPortNo;
        this.passportValidity = passportValidity;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "PassPortDetails{" +
                "name='" + name + '\'' +
                ", passPortNo=" + passPortNo +
                ", passportValidity=" + passportValidity +
                ", mobileNo=" + mobileNo +
                '}';
    }
}
