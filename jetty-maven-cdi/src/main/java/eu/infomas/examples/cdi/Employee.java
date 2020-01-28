package eu.infomas.examples.cdi;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

//@RequestScoped
@SessionScoped
@Named(value = "emp")
public class Employee implements Serializable {

    int empno;
    String ename;
    double salary;

    public Employee() {
        System.out.println("qqq");
        this.ename="Shankar";
    }

    public int getEmpno() {
        return empno++;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}