// helper class to let user select the components they want in their PC.
public class pcParts {
    private String cpu;
    private String gpu;
    private String memory;
    private String storage;
    private String storageType;
    private String size;

    public pcParts(String cpu, String gpu, String memory, String storage, String storageType, String size) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.memory = memory;
        this.storage = storage;
        this.storageType = storageType;
        this.size = size;
    }

    public void getPartsInfo() {
        System.out.println("CPU: "+this.cpu+"\nGPU: "+this.gpu+"\nMemory: "+this.memory+"\nStorage Capacity: "+this.storage+"\nStorage Type: "+this.storageType+"\nModel Size: "+this.size);
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
