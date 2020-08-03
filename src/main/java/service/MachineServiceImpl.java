package service;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T> implements MachineService<T>, MachineProducer<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {
        List<T> list = get(type);

        return list;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        Class<? super T> type = (Class<? super T>) value.getClass();
        List<T> list = getAll((Class<? extends T>) type);
        for (Object machine: list) {
            machines.add((T)machine);
        }
        machines.add(0, value);
    }

    @Override
    public void startWorking(List<? extends T> machines) {
    }
}
