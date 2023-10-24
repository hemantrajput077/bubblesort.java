  public class bubblesort
{

public static void bubblesort(int arr[])
{

    for(int turn=0;turn<arr.length;turn++)
{
    //reduce time complecity
    int swaps=0;
    for(int j=0;j<arr.length-1-turn;j++)
    {
        if(arr[j]>arr[j+1])
        {
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            swaps++;

        }
    }
}
}

public static void printarr(int arr[])
{
    for(int k=0;k<arr.length;k++)
 {   System.out.print(arr[k]+" ");
}
// to reduce its time which is n^2 before using swaps variable 

}
public static void main(String args[])
{int arr[ ]={1,3,4,4,5};
    bubblesort(arr);
    printarr(arr);

}

}