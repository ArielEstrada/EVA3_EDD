import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) 
    {
        //10,50,100,500,1000,5000,10000,100000,1000000
        int arSS1[] = new int[10];
        int arIS1[] = new int[arSS1.length];
        int arBS1[] = new int[arSS1.length];
        int arMS1[] = new int[arSS1.length];
        int arQS1[] = new int[arSS1.length];
        
        int arSS2[] = new int[50];
        int arIS2[] = new int[arSS2.length];
        int arBS2[] = new int[arSS2.length];
        int arMS2[] = new int[arSS2.length];
        int arQS2[] = new int[arSS2.length];
        
        int arSS3[] = new int[100];
        int arIS3[] = new int[arSS3.length];
        int arBS3[] = new int[arSS3.length];
        int arMS3[] = new int[arSS3.length];
        int arQS3[] = new int[arSS3.length];
        
        int arSS4[] = new int[500];
        int arIS4[] = new int[arSS4.length];
        int arBS4[] = new int[arSS4.length];
        int arMS4[] = new int[arSS4.length];
        int arQS4[] = new int[arSS4.length];
        
        int arSS5[] = new int[1000];
        int arIS5[] = new int[arSS5.length];
        int arBS5[] = new int[arSS5.length];
        int arMS5[] = new int[arSS5.length];
        int arQS5[] = new int[arSS5.length];
        
        int arSS6[] = new int[5000];
        int arIS6[] = new int[arSS6.length];
        int arBS6[] = new int[arSS6.length];
        int arMS6[] = new int[arSS6.length];
        int arQS6[] = new int[arSS6.length];
        
        int arSS7[] = new int[10000];
        int arIS7[] = new int[arSS7.length];
        int arBS7[] = new int[arSS7.length];
        int arMS7[] = new int[arSS7.length];
        int arQS7[] = new int[arSS7.length];
        
        int arSS8[] = new int[100000];
        int arIS8[] = new int[arSS8.length];
        int arBS8[] = new int[arSS8.length];
        int arMS8[] = new int[arSS8.length];
        int arQS8[] = new int[arSS8.length];
        
        int arSS9[] = new int[1000000];
        int arIS9[] = new int[arSS9.length];
        int arBS9[] = new int[arSS9.length];
        int arMS9[] = new int[arSS9.length];
        int arQS9[] = new int[arSS9.length];
        
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < arSS1.length; i++) {
            arSS1[i]=(int) ((Math.random()*10));
            arIS1[i]=arSS1[i];
            arBS1[i]=arSS1[i];
            arMS1[i]=arSS1[i];
            arQS1[i]=arSS1[i];
            }
            for (int i = 0; i < arSS2.length; i++) {
                arSS2[i]=(int) ((Math.random()*50));
                arIS2[i]=arSS2[i];
                arBS2[i]=arSS2[i];
                arMS2[i]=arSS2[i];
                arQS2[i]=arSS2[i];
            }
            for (int i = 0; i < arSS3.length; i++) {
                arSS3[i]=(int) ((Math.random()*100));
                arIS3[i]=arSS3[i];
                arBS3[i]=arSS3[i];
                arMS3[i]=arSS3[i];
                arQS3[i]=arSS3[i];
            }
            for (int i = 0; i < arSS4.length; i++) {
                arSS4[i]=(int) ((Math.random()*500));
                arIS4[i]=arSS4[i];
                arBS4[i]=arSS4[i];
                arMS4[i]=arSS4[i];
                arQS4[i]=arSS4[i];
            }
            for (int i = 0; i < arSS5.length; i++) {
                arSS5[i]=(int) ((Math.random()*1000));
                arIS5[i]=arSS5[i];
                arBS5[i]=arSS5[i];
                arMS5[i]=arSS5[i];
                arQS5[i]=arSS5[i];
            }
            for (int i = 0; i < arSS6.length; i++) {
                arSS6[i]=(int) ((Math.random()*5000));
                arIS6[i]=arSS6[i];
                arBS6[i]=arSS6[i];
                arMS6[i]=arSS6[i];
                arQS6[i]=arSS6[i];
            }
            for (int i = 0; i < arSS7.length; i++) {
                arSS7[i]=(int) ((Math.random()*10000));
                arIS7[i]=arSS7[i];
                arBS7[i]=arSS7[i];
                arMS7[i]=arSS7[i];
                arQS7[i]=arSS7[i];
            }
            for (int i = 0; i < arSS8.length; i++) {
                arSS8[i]=(int) ((Math.random()*100000));
                arIS8[i]=arSS8[i];
                arBS8[i]=arSS8[i];
                arMS8[i]=arSS8[i];
                arQS8[i]=arSS8[i];
            }
            for (int i = 0; i < arSS9.length; i++) {
                arSS9[i]=(int) ((Math.random()*1000000));
                arIS9[i]=arSS9[i];
                arBS9[i]=arSS9[i];
                arMS9[i]=arSS9[i];
                arQS9[i]=arSS9[i];
            }
            System.out.println("Prueba con 10 numeros en arreglo: ");
            System.out.println("");
            System.out.println("Selection Sort: ");
            SelectionS(arSS1);
            System.out.println("Insertion Sort: ");
            InsertionS(arIS1);
            System.out.println("Bubble Sort: ");
            BubbleS(arBS1);
            System.out.println("Merge Sort: ");
            MergeS(arMS1);
            System.out.println("Quick Sort: ");
            QuickS(arQS1);
            System.out.println("");
            System.out.println("Prueba con 50 numeros en arreglo: ");
            System.out.println("");
            System.out.println("Selection Sort: ");
            SelectionS(arSS2);
            System.out.println("Insertion Sort: ");
            InsertionS(arIS2);
            System.out.println("Bubble Sort: ");
            BubbleS(arBS2);
            System.out.println("Merge Sort: ");
            MergeS(arMS2);
            System.out.println("Quick Sort: ");
            QuickS(arQS2);
            System.out.println("");
            System.out.println("Prueba con 100 numeros en arreglo: ");
            System.out.println("");
            System.out.println("Selection Sort: ");
            SelectionS(arSS3);
            System.out.println("Insertion Sort: ");
            InsertionS(arIS3);
            System.out.println("Bubble Sort: ");
            BubbleS(arBS3);
            System.out.println("Merge Sort: ");
            MergeS(arMS3);
            System.out.println("Quick Sort: ");
            QuickS(arQS3);
            System.out.println("");
            System.out.println("Prueba con 500 numeros en arreglo: ");
            System.out.println("");
            System.out.println("Selection Sort: ");
            SelectionS(arSS4);
            System.out.println("Insertion Sort: ");
            InsertionS(arIS4);
            System.out.println("Bubble Sort: ");
            BubbleS(arBS4);
            System.out.println("Merge Sort: ");
            MergeS(arMS4);
            System.out.println("Quick Sort: ");
            QuickS(arQS4);
            System.out.println("");
            System.out.println("Prueba con 1000 numeros en arreglo: ");
            System.out.println("");
            System.out.println("Selection Sort: ");
            SelectionS(arSS5);
            System.out.println("Insertion Sort: ");
            InsertionS(arIS5);
            System.out.println("Bubble Sort: ");
            BubbleS(arBS5);
            System.out.println("Merge Sort: ");
            MergeS(arMS5);
            System.out.println("Quick Sort: ");
            QuickS(arQS5);
            System.out.println("");
            System.out.println("Prueba con 5000 numeros en arreglo: ");
            System.out.println("");
            System.out.println("Selection Sort: ");
            SelectionS(arSS6);
            System.out.println("Insertion Sort: ");
            InsertionS(arIS6);
            System.out.println("Bubble Sort: ");
            BubbleS(arBS6);
            System.out.println("Merge Sort: ");
            MergeS(arMS6);
            System.out.println("Quick Sort: ");
            QuickS(arQS6);
            System.out.println("");
            System.out.println("Prueba con 10000 numeros en arreglo: ");
            System.out.println("");
            System.out.println("Selection Sort: ");
            SelectionS(arSS7);
            System.out.println("Insertion Sort: ");
            InsertionS(arIS7);
            System.out.println("Bubble Sort: ");
            BubbleS(arBS7);
            System.out.println("Merge Sort: ");
            MergeS(arMS7);
            System.out.println("Quick Sort: ");
            QuickS(arQS7);
            System.out.println("");
            System.out.println("Prueba con 100000 numeros en arreglo: ");
            System.out.println("");
            System.out.println("Selection Sort: ");
            SelectionS(arSS8);
            System.out.println("Insertion Sort: ");
            InsertionS(arIS8);
            System.out.println("Bubble Sort: ");
            BubbleS(arBS8);
            System.out.println("Merge Sort: ");
            MergeS(arMS8);
            System.out.println("Quick Sort: ");
            QuickS(arQS8);
            System.out.println("");
            System.out.println("Prueba con 1000000 numeros en arreglo: ");
            System.out.println("");
            System.out.println("Selection Sort: ");
            SelectionS(arSS9);
            System.out.println("Insertion Sort: ");
            InsertionS(arIS9);
            System.out.println("Bubble Sort: ");
            BubbleS(arBS9);
            System.out.println("Merge Sort: ");
            MergeS(arMS9);
            System.out.println("Quick Sort: ");
            QuickS(arQS9);
        }  
    }
    public static void imprimir(int[] ar)
    {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" - ");
        }
    }
    public static void SelectionS(int[] ar)
    {
        long startTime = System.nanoTime();
        for (int i = 0; i < ar.length; i++) 
        {
            int min = i;
            for (int j = i+1; j < ar.length; j++) 
            {
                if(ar[min]>ar[j])
                {
                    min=j;
                }
            }
            int cent=ar[min];
            ar[min]=ar[i];
            ar[i]=cent;
        }
        long endTime = System.nanoTime();
        System.out.println("Duración: " + (endTime-startTime)/1e6 + " ms");
    }
    public static void InsertionS(int[] ar)
    {
        long startTime = System.nanoTime();
        int i,n,j;
        for (i=1; i<ar.length; i++)
        {
            n=ar[i];
            j=i-1;
            while(j>=0&&ar[j]>n)
            {
                ar[j+1]=ar[j];
                j=j-1;
            }
            ar[j+1]=n;
        }
        long endTime = System.nanoTime();
        System.out.println("Duración: " + (endTime-startTime)/1e6 + " ms");
    }
    public static void BubbleS(int[] ar)
    {
        long startTime = System.nanoTime();

        int save;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < (ar.length-i); j++) {
                if(j>0)
                {
                    if(ar[j]<ar[j-1])
                    {
                        save=ar[j];
                        ar[j]=ar[j-1];
                        ar[j-1]=save;
                    }
                }
            }
        }

        long endTime = System.nanoTime();
        System.out.println("Duración: " + (endTime-startTime)/1e6 + " ms");
    }
    public static void MergeS(int [] ar)
    {
        long startTime = System.nanoTime();
        Mergesort(ar);
        long endTime = System.nanoTime();
        System.out.println("Duración: " + (endTime-startTime)/1e6 + " ms");
    }
    public static int[] Mergesort(int [] list) 
    {
        if (list.length <= 1) 
        {
            return list;
        }
        int[] first = new int[list.length / 2];
        int[] second = new int[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);
        Mergesort(first);
        Mergesort(second);
        merge(first, second, list);
        return list;
    }
    private static void merge(int[] first, int[] second, int [] result) 
    {
        int iFirst = 0;
        int iSecond = 0;
        int j = 0;
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
                } else {
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
    }
    public static void QuickS(int[] array) 
    { 
        long startTime = System.nanoTime();
        recursiveQuickSort(array, 0, array.length - 1);
        long endTime = System.nanoTime();
        System.out.println("Duración: " + (endTime-startTime)/1e6 + " ms");
    }  
    public static void recursiveQuickSort(int[] array, int startIdx, int endIdx) 
    { 
        int idx = partition(array, startIdx, endIdx); 
        if (startIdx < idx - 1) 
        { 
            recursiveQuickSort(array, startIdx, idx - 1); 
        } 
        if (endIdx > idx) 
        { 
            recursiveQuickSort(array, idx, endIdx); 
        } 
    } 
    public static int partition(int[] array, int left, int right) 
    { 
        int pivot = array[left]; 
        while (left <= right) 
        { 
            while (array[left] < pivot) 
            { 
                left++; 
            } 
            while (array[right] > pivot) 
            { 
                right--; 
            } 
            if (left <= right) 
            { 
                int tmp = array[left]; 
                array[left] = array[right]; 
                array[right] = tmp; 
                left++; 
                right--; 
            } 
        } 
        return left; 
    }
}