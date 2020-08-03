package service;

import java.util.ArrayList;
import java.util.List;
import model.Bulldozer;
import model.Excavator;
import model.Track;

public interface MachineProducer<T> {
    /**
     * In your implementations - create 2-3 models, add them to the list and return
     * @return - the list of models
     */
    default List<T> get(Class<? extends T> type) {
        List<T> list = new ArrayList<>();

        if (type == Bulldozer.class) {
            list.add((T) new Bulldozer());
            list.add((T) new Bulldozer());
        } else if (type == Excavator.class) {
            list.add((T) new Excavator());
            list.add((T) new Excavator());
        } else if (type == Track.class) {
            list.add((T) new Track());
            list.add((T) new Track());
        }

        return list;
    }
}
