"# jv-pecs" 
You have abstract class Machine and three sub-classes: Bulldozer, Excavator and Track.

Each machine has the ability to start working.

There is MachineProducer interface created. The goal of this interface is to create a list of specific machines (Bulldozer, Excavator and Track). Please parameterize it and replace Object with the right option.

public interface MachineProducer<PARAMETRIZE ME>{ ... }
Create three classes implementing MachineProducer interface. As a result, in these implementations your method get() should return the list of specific machines. For example:

List<Bulldozer> get();
or

List<Track> get();
or

List<Excavator> get();
There is also MachineService interface created. You need to parameterize it as well and replace Object in method signature with the right option (use PECS):

the method getAll(Class type) produces the list of machines based on the input param.
the method fill(List<Object> machines, Object value) fills the machines list with passed value.
the method startWorking() should be able to accept a list containing any Machine.
Create a class implementing MachineService and realize these methods:

getAll(Class type): based on the input class type, choose the right MachineProducer implementation from those you created earlier, and call its get() method.
For example: if (type == Bulldozer.class) - we should call the get() method from right implementation of MachineProducer (the one that will return List<Bulldozer>) and return these machines.

fill(List<Object> machines, Object value) - add the passed value (which can be of any Machine subtype) to the passed list n times (where n is the initial size of the list)

startWorking() - call doWork on every Machine in the list.