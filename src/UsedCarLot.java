import java.util.ArrayList;
/**
 * This class is the management of a plethora of car objects all contained within a single "inventory" array.
 *
 * @author Devan Ng
 */
public class UsedCarLot
{
    /** Creation of the car array. **/
    private ArrayList<Car> inventory;

    /** Initialization of the car array. **/
    public UsedCarLot()
    {
        inventory = new ArrayList<Car>();
    }

    /** Returns the inventory array holding all the car objects.
     *
     * @return The inventory array.
     */
    public ArrayList<Car> getInventory()
    {
        return inventory;
    }

    /** Adds another car object the inventory car array.
     *
     * @param newCar The car object which is being added.
     */
    public void addCar (Car newCar)
    {
        inventory.add(newCar);
    }

    /** Swaps the car at the first index with the car at the second index of the inventory array.
     *
     * @param car1idx Index of the first car to be swapped.
     * @param car2idx Index of the second car to be swapped.
     *
     * @return either true/false depending on if the swapping of the cars in the array was successful or not.
     */
    public boolean swapCar(int car1idx, int car2idx)
    {
        if (car1idx < 0 || car1idx > inventory.size() || car2idx < 0 || car2idx > inventory.size())
        {
            return false;
        }
        else
        {
            Car tempCar = inventory.get(car1idx);
            inventory.set(car1idx, inventory.get(car2idx));
            inventory.set(car2idx, tempCar);
            return true;

        }
    }

    /** Adds a new car object at the specific index within the inventory array, shifting all cars to the right.
     *<p>
     *PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     *
     * @param indexToAdd The index at which the new car will be added at.
     * @param carToAdd The new car object which will be added to the inventory array.
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /** "Sells" a car object from the inventory array, effectively removing it from the array and shifting the rest of the car objects in the array to the left.
     *<p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell The index of the car to be "sold" and removed from the array.
     * @return The car object which is being removed.
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        return  inventory.remove(indexOfCarToSell);

    }

    /** "Sells" a car object from the inventory array, effectively removing it from the array without shifting the array, instead replacing the sold car object with null.
     *<p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell The index of the car to be "sold" and removed from the array.
     * @return The car object which is being removed.
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car tempCar = inventory.get(indexOfCarToSell);
         inventory.set(indexOfCarToSell, null);
         return tempCar;

    }

    /** Moves a car object within the inventory array to a different index.
     *<p>
     * PRECONDITION: indexOfCarToMove &lt; inventory.size() destinationIndex &lt; inventory.size()
     *
     * @param indexOfCarToMove The index of the car object being moved.
     * @param destinationIndex The index of where to put the car object being moved.
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car tempCar = inventory.remove(indexOfCarToMove);

        inventory.add(destinationIndex, tempCar);
    }

}
