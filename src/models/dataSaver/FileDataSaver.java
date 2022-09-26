package models.dataSaver;

public class FileDataSaver<T> implements DataSaver<T> {

    private T data;

    @Override
    public void save(T data){
        System.out.println("Saving to file");
        this.data = data;
    }

    @Override
    public T load() {
        System.out.println("Reading from file");
        return data;
    }
}
