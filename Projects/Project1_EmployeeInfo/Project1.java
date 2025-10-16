class Project1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter an employee ID as a command line argument.");
            return;
        }

        int empId = Integer.parseInt(args[0]);

        // Employee Data
        int[] empNo = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] joinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "01/01/2000", "12/06/2006"};
        char[] designationCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

        // Designation and DA
        char[] dCode = {'e', 'c', 'k', 'r', 'm'};
        String[] designation = {"Engineer", "Consultant", "Clerk", "Receptionist", "Manager"};
        int[] da = {20000, 32000, 12000, 15000, 40000};

        int index = -1;
        for (int i = 0; i < empNo.length; i++) {
            if (empNo[i] == empId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("There is no employee with empId: " + empId);
            return;
        }

        String empDesignation = "";
        int empDA = 0;

        switch (designationCode[index]) {
            case 'e':
                empDesignation = "Engineer";
                empDA = 20000;
                break;
            case 'c':
                empDesignation = "Consultant";
                empDA = 32000;
                break;
            case 'k':
                empDesignation = "Clerk";
                empDA = 12000;
                break;
            case 'r':
                empDesignation = "Receptionist";
                empDA = 15000;
                break;
            case 'm':
                empDesignation = "Manager";
                empDA = 40000;
                break;
        }

        int salary = basic[index] + hra[index] + empDA - it[index];

        System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
        System.out.println(empNo[index] + "\t" + empName[index] + "\t" + department[index] + "\t" + empDesignation + "\t" + salary);
    }
}
