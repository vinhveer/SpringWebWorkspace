package EmployeeManagement;

import java.io.*;
import java.util.*;
import java.text.*;
import java.util.regex.*;

public class Employee {
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }

    public Employee(long id, String accountName, String fullName,
                    String dateOfBirth, boolean gender, String address, String roleName) {
        this.id = id;
        this.accountName = accountName;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.roleName = roleName;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    private Long id;
    private String accountName;
    private String fullName;
    private String dateOfBirth;
    private Boolean gender;
    private String address;
    private String roleName;

    public static ArrayList<Employee> employees = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);

    public static void ImportData() {
        try {
            File myFile = new File("EmployeeManagement/data.csv");
            Scanner fileReader = new Scanner(myFile);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] data = line.split(",");
                if (data.length >= 6) {
                    long id = Long.parseLong(data[0]);
                    String accountName = data[1];
                    String fullName = data[2];
                    String dateOfBirth = data[3];
                    boolean gender = Boolean.parseBoolean(data[4]);
                    String address = data[5];
                    String roleName = data[6];
                    Employee employee = new Employee(id, accountName, fullName, dateOfBirth, gender, address, roleName);
                    employees.add(employee);
                }
            }
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ExportData() {
        try {
            FileWriter fileWriter = new FileWriter("EmployeeManagement/data.csv");
            BufferedWriter info = new BufferedWriter(fileWriter);
            for (Employee employee : Employee.employees) {
                info.write(String.format("%s,%s,%s,%s,%b,%s,%s\n", employee.getId(), employee.getAccountName(),
                        employee.getFullName(), employee.getDateOfBirth(), employee.getGender(),
                        employee.getAddress(), employee.getRoleName()));
            }
            info.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean isUniqueID(long id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return false;
            }
        }
        return true;
    }

    private static String extractAccountName(String fullName) {
        String[] names = fullName.split(" ");
        StringBuilder accountName = new StringBuilder(names[names.length - 1]);
        for (int i = 0; i < names.length - 1; i++) {
            accountName.append(names[i].charAt(0));
        }
        String s = accountName.toString().replaceAll("^a-zA-Z0-9", "");
        return s.toLowerCase();
    }

    private static boolean validateDateOfBirth(String dateStr) {
        boolean isValidDate;
        Pattern datePattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
        Matcher matcher = datePattern.matcher(dateStr);
        isValidDate = matcher.matches();
        if (!isValidDate) {
            System.out.println("Invalid date format. Please enter in dd/MM/yyyy format.");
            return false;
        }
        String dateFormat = "dd/MM/yyyy";
        DateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);
        try {
            sdf.parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please try again");
            return false;
        }
        return true;
    }


    private static boolean validateGender(String userInput) {
        boolean isValidGender;
        boolean gender = false;
        do {
            if (userInput.equals("1")) {
                isValidGender = true;
                gender = true;
            } else if (userInput.equals("2")) {
                isValidGender = true;
            } else {
                System.out.println("Invalid input. Please enter 1 for Male or 2 for Female.");
                System.out.print("Gender? (1. Male, 2. Female): ");
                userInput = input.nextLine();
                isValidGender = false;
            }
        } while(!isValidGender);
        return gender;
    }

    private static boolean validateName(String str) {
        boolean isValidString = false;
        if ((str.length() > 1) && str.matches("^[a-zA-Z ]+$")) {
            isValidString = true;
        } else {
            System.out.println("The Full-name you just entered is invalid. Please try again!");
        }
        return !isValidString;
    }

    private static boolean validateAddress(String str) {
        boolean isValidString = false;
        if ((str.length() > 1) && str.matches("^[a-zA-Z0-9 ]+$")) {
            isValidString = true;
        } else {
            System.out.println("The Address you just entered is invalid. Please try again!");
        }
        return !isValidString;
    }

    public static void addEmployee() {
        String control;
        do {
            long id;
            boolean gender;
            String accountName, fullName, dateOfBirth, address, roleName;
            boolean isUniqueID;
            do {
                id = new Random().nextLong(10000000, 99999999);
                isUniqueID = isUniqueID(id);
            } while (!isUniqueID);

            do {
                System.out.print("Full-name: ");
                fullName = input.nextLine();
            } while(validateName(fullName));

            accountName = extractAccountName(fullName);

            do {
                System.out.print("Date of Birth: ");
                dateOfBirth = input.nextLine();
            } while(!validateDateOfBirth(dateOfBirth));

            String userInput;
            do {
                System.out.print("Gender? (1. Male, 2. Female): ");
                userInput = input.nextLine();
                gender = validateGender(userInput);
            } while (userInput.isEmpty());

            do {
                System.out.print("Address: ");
                address = input.nextLine();
            } while(validateAddress(address));

            roleName = "";
            do {
                System.out.print("Role-name: ");
                System.out.println("Please choose: ");
                System.out.println("1. Admin");
                System.out.println("2. Manager");
                System.out.println("3. Employee");
                System.out.print("Enter your choose: ");
                int choose = input.nextInt();
                switch (choose) {
                    case 1 -> roleName = "Admin";
                    case 2 -> roleName = "Manager";
                    case 3 -> roleName = "Employee";
                    default -> System.out.println("Your typing is incorrect. Please try again!");
                }
            } while(roleName.length() == 0);

            input.nextLine();
            System.out.print("Continue entering employee information? (y/n): ");
            control = input.nextLine();
            control = control.toLowerCase();

            Employee employee = new Employee(id, accountName, fullName, dateOfBirth, gender, address, roleName);
            employees.add(employee);
        } while (control.equals("y"));
        ExportData();
    }

    public static void showAllEmployee() {
        if (employees.size() > 0) {
            System.out.println("List of all employees:");
            System.out.printf("%-9s %-15s %-25s %-15s %-8s %-25s %-10s %n",
                    "ID", "Account name", "Full-name",
                    "Date Of Birth", "Gender", "Address", "Role-name");
            for (Employee employee : employees)
                System.out.printf("%-9s %-15s %-25s %-15s %-8s %-25s %-10s%n",
                        employee.getId(), employee.getAccountName(), employee.getFullName(),
                        employee.getDateOfBirth(), employee.getGender() ? "Male" : "Female",
                        employee.getAddress(), employee.getRoleName());
        } else {
            System.out.println("There are no employees.");
        }
    }

    public static void searchEmployeeByName() {
        System.out.print("Enter keyword: ");
        String keyword = input.nextLine().toLowerCase(); // Convert the keyword to lowercase for case-insensitive comparison
        int num = 0;

        for (Employee employee : employees) {
            String fullName = employee.getFullName().toLowerCase(); // Convert the employee's full name to lowercase for case-insensitive comparison

            for (int i = 0; i <= fullName.length() - keyword.length(); i++) {
                String name = fullName.substring(i, i + keyword.length());
                if (keyword.equals(name)) {
                    if (num == 0) {
                        System.out.println("Search result: ");
                        System.out.printf("%-9s %-15s %-25s %-15s %-8s %-25s %-10s %n",
                                "ID", "Account name", "Full-name",
                                "Date Of Birth", "Gender", "Address", "Role-name");
                    }
                    num++;
                    System.out.printf("%-9s %-15s %-25s %-15s %-8s %-25s %-10s %n",
                            employee.getId(), employee.getAccountName(), employee.getFullName(),
                            employee.getDateOfBirth(), employee.getGender() ? "Male" : "Female",
                            employee.getAddress(), employee.getRoleName());
                }
            }
        }

        if (num > 0) {
            System.out.println("There are " + num + " result(s).");
        } else {
            System.out.println("There are no results.");
        }
    }


    public static void detailEmployee() {
        long employeeID;
        do {
            System.out.print("Enter the employee ID to display the details: ");
            employeeID = input.nextLong();
        } while(employeeID <= 10000000 || employeeID >= 99999999);

        boolean control = false;
        for (Employee employee : employees) {
            if (employee.getId() == employeeID) {
                System.out.printf("%-9s %-15s %-25s %-15s %-8s %-25s %-10s %n",
                        "ID", "Account name", "Full-name",
                        "Date Of Birth", "Gender", "Address", "Role-name");
                System.out.printf("%-9s %-15s %-25s %-15s %-8s %-25s %-10s %n",
                        employee.getId(), employee.getAccountName(), employee.getFullName(),
                        employee.getDateOfBirth(), employee.getGender() ? "Male" : "Female",
                        employee.getAddress(), employee.getRoleName());
                control = true;
            }
        }
        if (!control) {
            System.out.println("The employee ID you just entered is not valid. Please try again!");
        }
    }

    public static void editEmployee() {
        long employeeID;
        do {
            System.out.print("Enter the employee ID you want to edit: ");
            employeeID = input.nextLong();
        } while (employeeID <= 10000000 || employeeID >= 99999999);

        boolean control = false;
        for (Employee employee : employees) {
            if (employee.getId() == employeeID) {
                System.out.printf("%-9s %-15s %-25s %-15s %-8s %-25s %-10s %n",
                        "ID", "Account name", "Full-name",
                        "Date Of Birth", "Gender", "Address", "Role-name");
                System.out.printf("%-9s %-15s %-25s %-15s %-8s %-25s %-10s %n",
                        employee.getId(), employee.getAccountName(), employee.getFullName(),
                        employee.getDateOfBirth(), employee.getGender() ? "Male" : "Female",
                        employee.getAddress(), employee.getRoleName());
                control = true;
                System.out.println("Please edit the information (Press Enter to skip).");

                String fullName, dateOfBirth, address;
                employee.setId(employee.getId());
                input.nextLine();
                do {
                    System.out.print("Full-name (Current Full-name: " + employee.getFullName() + "): ");
                    fullName = input.nextLine();
                    if (fullName.isEmpty()) break;
                } while (validateName(fullName));
                if (!fullName.isEmpty()) {
                    employee.setFullName(fullName);
                    employee.setAccountName(extractAccountName(fullName));
                }

                do {
                    System.out.print("Date of Birth: (Current Date of Birth: " + employee.getDateOfBirth() + "): ");
                    dateOfBirth = input.nextLine();
                    if (dateOfBirth.isEmpty()) break;
                } while (validateDateOfBirth(dateOfBirth));
                if (!dateOfBirth.isEmpty()) {
                    employee.setDateOfBirth(dateOfBirth);
                }

                String userInput;
                System.out.print("Gender? (1. Male, 2. Female): (Current Gender: " + (employee.getGender() ? "Male" : "Female" ) + "): ");
                userInput = input.nextLine();
                if (!userInput.isEmpty()) {
                    employee.setGender(validateGender(userInput));
                }

                do {
                    System.out.print("Address: (Current Address: " + employee.getAddress() + "): ");
                    address = input.nextLine();
                    if (address.isEmpty()) break;
                } while (validateAddress(address));
                if (!address.isEmpty()) employee.setAddress(address);
                int choose;
                do {
                    System.out.print("Role-name: (Current Role-name: " + employee.getRoleName() + "): ");
                    System.out.println("Please choose: ");
                    System.out.println("1. Admin");
                    System.out.println("2. Manager");
                    System.out.println("3. Employee");
                    System.out.println("0. Skip");
                    System.out.print("Enter your choose: ");
                    choose = input.nextInt();
                    switch (choose) {
                        case 1 -> employee.setRoleName("Admin");
                        case 2 -> employee.setRoleName("Manager");
                        case 3 -> employee.setRoleName("Employee");
                        case 0 -> {}
                        default -> System.out.println("Your typing is incorrect. Please try again!");
                    }
                } while(choose > 3 || choose < 0);
                System.out.println("Employee information update completed.");
            }

        }
        if (!control) {
            System.out.println("The employee ID you just entered is not valid. Please try again!");
        } else {
            ExportData();
        }
    }

    public static void deleteEmployee() {
        long employeeID;
        do {
            System.out.print("Enter the employee ID you want to delete: ");
            employeeID = input.nextLong();
            input.nextLine();
        } while (employeeID <= 10000000 || employeeID >= 99999999);

        boolean control = false;
        for (Employee employee : employees) {
            if (employee.getId() == employeeID) {
                control = true;
                System.out.printf("%-9s %-15s %-25s %-15s %-8s %-25s %-10s %n",
                        "ID", "Account name", "Full-name",
                        "Date Of Birth", "Gender", "Address", "Role-name");
                System.out.printf("%-9s %-15s %-25s %-15s %-8s %-25s %-10s %n",
                        employee.getId(), employee.getAccountName(), employee.getFullName(),
                        employee.getDateOfBirth(), employee.getGender() ? "Male" : "Female",
                        employee.getAddress(), employee.getRoleName());
                System.out.print("Do you want to delete this employee? (y/n): ");
                String accept = input.nextLine();
                if (accept.equalsIgnoreCase("y")) {
                    employees.remove(employee);
                    System.out.println("Employee has been deleted.");
                } else {
                    System.out.println("Abort.");
                }
                break;
            }
        }
        if (!control) {
            System.out.println("The employee ID you just entered is not valid. Please try again!");
        } else {
            ExportData();
        }
    }
}