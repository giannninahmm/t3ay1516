package macavinta.gianninah.ex5revised;

/**
 * Created by IE on 8/1/2016.
 */
public class Company {
    private int ID;
    private String companyName;
    private String add;
    private String telephone;

    public Company() {
        this.ID = 0;
        this.companyName = "ABC cosmetics inc";
        this.add = "Manila";
        this.telephone = "8091471";
    }

    public Company(int ID, String companyName, String address, String telephone) {
        this.ID = ID;
        this.companyName = companyName;
        this.add = address;
        this.telephone = telephone;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}