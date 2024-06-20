public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        // Validate the input parameters
        if (annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0) {
            throw new IllegalArgumentException("Loan amount, interest rate, and number of years must be greater than zero.");
        }

        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        // Validate the input parameter
        if (annualInterestRate <= 0) {
            throw new IllegalArgumentException("Annual interest rate must be greater than zero.");
        }
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        // Validate the input parameter
        if (numberOfYears <= 0) {
            throw new IllegalArgumentException("Number of years must be greater than zero.");
        }
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        // Validate the input parameter
        if (loanAmount <= 0) {
            throw new IllegalArgumentException("Loan amount must be greater than zero.");
        }
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    public java.util.Date getLoanDate() {
        return loanDate;
    }
}