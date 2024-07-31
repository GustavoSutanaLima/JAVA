import java.util.ArrayList;

public class GroceryList {
    //defining fields (this time, my field is an ArrayList not a primitive type);
    ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String nameOfTheItem) {
        groceryList.add(nameOfTheItem);
    }

    private void addItem(String nameOfTheItem, int index) {
        groceryList.add(index, nameOfTheItem);
    }

    public void removeItem(String nameOfTheItem) {
        if (hasItem(nameOfTheItem)) {
            groceryList.remove(nameOfTheItem);
        }
        else {
            System.out.println("There's no such item: check your spelling.");
        }
    }
    public void removeItem(int indexOfTheItem) {
        if (hasItem(groceryList.get(indexOfTheItem-1))) {
            groceryList.remove(groceryList.get(indexOfTheItem-1));
        }
        else {
            System.out.println("There's no such item: check your spelling.");
        }
    }

    public boolean hasItem(String nameOfTheItem) {
        int index = groceryList.indexOf(nameOfTheItem); //Returns the index of an element inside of an ArrayList;
        return index > -1 && nameOfTheItem.equals(groceryList.get(index));
    }

    public void switchItem(int index, String newItem) {
        groceryList.set(index-1, newItem);
    }

    public void printArrayList() {
        for (String item : groceryList) {
            System.out.println(groceryList.indexOf(item)+1 + " - " + item);
        }
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
