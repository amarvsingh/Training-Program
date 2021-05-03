//Complexity : O(n^2)
public class BubbleSort{
    public static void main(String[] args) {
        int array[] = new int[7];
        int i;
        for (i=array.length-1;i>=0;i--){
            array[array.length-1-i] = i;
        }
        for (i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        bubbleSort(array);
    }

    public static void bubbleSort(int[] array){
        int i,j;
        for (i=0;i<array.length;i++){
            for (j=0;j< array.length-1;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}