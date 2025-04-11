package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

    private static  final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String email;
    private Date birthdate;
    private Double baseSalary;

    private Department department;

    public Seller(){
    }

    public Seller(Integer id, String name, String email, Date birthdate, Double baseSalary, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthdate = birthdate;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Seller seller = (Seller) object;
        return Objects.equals(id, seller.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "department=" + department +
                ", baseSalary=" + baseSalary +
                ", birthdate=" + birthdate +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
