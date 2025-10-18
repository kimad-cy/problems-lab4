package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int currentSize = 0;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
        currentSize = list.length;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    public void increaseSize(){
        int[] temp = new int[list.length];
        int size = list.length;
        for (int i=0; i<list.length; i++)
            temp[i] = list[i];
        list = new int[2*size];
        for (int i=0; i<temp.length; i++)
            list[i] = temp[i];
    }
    public void addElement(int newVal){
        if (currentSize == list.length){
            increaseSize();
            list[currentSize] = newVal;
        }else{
            list[currentSize] = newVal;
        }
        currentSize++;
    }
    public void removeElement(int element){
        int shiftInd = 0;
        boolean found = false;
        for (int i=0; i<list.length; i++){
            if (list[i] == element){
                shiftInd = i;
                found = true;
                break;
            }
        }
        if (found){
            for (int i=shiftInd; i<list.length-1; i++){
                list[i] = list[i+1];
            }
            currentSize--;
        }

    }
    public void removeAll(int element){
        int occ = 0;
        for (int i=0; i<list.length; i++){
            if(list[i] == element){
                occ++;
            }
        }
        for (int i=0; i<occ; i++){
            removeElement(element);
        }
    }
}