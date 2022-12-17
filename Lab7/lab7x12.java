package Lab7;

import java.util.ArrayList;

public class lab7x12 {
    public static class Customer {
        private String name;
        private ArrayList<Double> transactions;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<Double> getTransactions() {
            return transactions;
        }

        public void setTransactions(ArrayList<Double> transactions) {
            this.transactions = transactions;
        }

        public void addTransaction(double amount) {
            if (transactions == null) {
                transactions = new ArrayList<Double>();
            }
            transactions.add(amount);
        }
    }

    public static class Branch {
        private String name;
        private ArrayList<Customer> customers;

        public Branch(String name) {
            this.name = name;
            this.customers = new ArrayList<Customer>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<Customer> getCustomers() {
            return customers;
        }

        public void setCustomers(ArrayList<Customer> customers) {
            this.customers = customers;
        }


        
        private Customer findCustomer(String customerName) {
            for (int i = 0; i < this.customers.size(); i++) {
                Customer checkedCustomer = this.customers.get(i);
                if (checkedCustomer.getName().equals(customerName)) {
                    return checkedCustomer;
                }
            }
            return null;
        }

        public boolean newCustomer(String customerName, double initialAmount) {
            if (findCustomer(customerName) == null) {
                Customer newCustomer = new Customer();
                newCustomer.name = customerName;
                newCustomer.addTransaction(initialAmount);
                customers.add(newCustomer);
                return true;
            }
            return false;
        }

        public boolean addCustomerTransaction(String customerName, double amount) {
            Customer existingCustomer = findCustomer(customerName);
            if (existingCustomer != null) {
                existingCustomer.addTransaction(amount);
                return true;
            }
            return false;
        }
    }

    public static class Bank {
        private String name;
        private ArrayList<Branch> branches;

        public Bank(String name) {
            this.name = name;
            this.branches = new ArrayList<Branch>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<Branch> getBranches() {
            return branches;
        }

        public void setBranches(ArrayList<Branch> branches) {
            this.branches = branches;
        }

        public boolean addBranch(String branchName) {
            if (findBranch(branchName) == null) {
                Branch newBranch = new Branch(branchName);
                branches.add(newBranch);
                return true;
            }
            return false;
        }

        private Branch findBranch(String branchName) {
            for (int i = 0; i < this.branches.size(); i++) {
                Branch checkedBranch = this.branches.get(i);
                if (checkedBranch.getName().equals(branchName)) {
                    return checkedBranch;
                }
            }
            return null;
        }

        public boolean addCustomerTransaction(String branchName, String customerName, double initialAmount) {
            Branch branch = findBranch(branchName);
            if (branch != null) {
                return branch.newCustomer(customerName, initialAmount);
            }
            return false;
        }


        public void listCustomer(String branchName, boolean showTransactions) {
            Branch branch = findBranch(branchName);
            if (branch != null) {
                System.out.println("Customer details for branch " + branch.getName());
                ArrayList<Customer> branchCustomers = branch.getCustomers();
                for (int i = 0; i < branchCustomers.size(); i++) {
                    Customer branchCustomer = branchCustomers.get(i);
                    System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
                    if (showTransactions) {
                        System.out.println("Transactions");
                        ArrayList<Double> transactions = branchCustomer.getTransactions();
                        for (int j = 0; j < transactions.size(); j++) {
                            System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                        }
                    }
                }
            } else {
                System.out.println("Branch not found");
            }
        }
       
    } 

    public static void main(String[] args) {
        Bank bank = new Bank("Vietcombank");
        bank.addBranch("Hanoi");
        bank.addCustomerTransaction("Hanoi", "Nguyen Van A", 50.05);
        bank.addCustomerTransaction("Hanoi", "Nguyen Van B", 175.34);
        bank.addCustomerTransaction("Hanoi", "Nguyen Van C", 220.12);
        bank.addBranch("Ho Chi Minh");
        bank.addCustomerTransaction("Ho Chi Minh", "Nguyen Van D", 150.54);
        bank.addCustomerTransaction("Ho Chi Minh", "Nguyen Van E", 320.00);
        bank.addCustomerTransaction("Ho Chi Minh", "Nguyen Van E", 500.00);
        bank.listCustomer("Hanoi", true);
        bank.listCustomer("Ho Chi Minh", true);
        bank.listCustomer("Da Nang", true);

    }
}
