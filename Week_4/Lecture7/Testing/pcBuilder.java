/*
* Multiple errors stemming from the pcParts inheritance class
*/

import java.util.Scanner;

public class pcBuilder extends pcParts {
    private String userName;
    private int customerNo;
    private pcParts parts;

    public pcBuilder(String userName, int customerNo) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.memory = memory;
        this.storage = storage;
        this.storageType = storageType;
        this.size = size;
        this.userName = userName;
        this.customerNo = customerNo;
    }

    public void setPCParts(pcParts parts) {
        this.pcParts = parts;
    }

    public pcParts getPCParts() {
        return parts.getPartsInfo();
    }

    public static void main(String[] args) {

        // create Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // getting user input to build their PC
        String username = input.nextLine();
        int customerNumber = input.nextInt();
        String userCPU = input.nextLine();
        String userGPU = input.nextLine();
        String userMemory = input.nextLine();
        String userStorage = input.nextLine();
        String userStorageType = input.nextLine();
        String userSize = input.nextLine();

        // construct the pcBuilder object with the user input as parameters
        pcBuilder newProduct = new pcBuilder(username, customerNumber, userCPU, userGPU, userMemory, userStorage, userStorageType, userSize);

        newProduct.getPCParts();
    }
}
