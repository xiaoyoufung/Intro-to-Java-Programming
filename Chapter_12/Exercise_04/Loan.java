package Exercise_04;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYear;
    private double loanAmount;
    private Date loanDate;

    public Loan(){
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYear, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYear = numberOfYear;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }
}
