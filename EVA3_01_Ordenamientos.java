
/**
 *
 * @author Ariel
 */
public class EVA3_01_Ordenamientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int[] aiPrueba = new int[100000];
        for(int i =0; i<aiPrueba.length; i++){
            aiPrueba[i] = (int)(Math.random()*100000)+1;
            
        }
        int[] aiCopia = new int[100000];
        for(int i =0; i<aiPrueba.length; i++){
            aiCopia[i] = aiPrueba[i]; 
        }
        
        System.out.println("Datos de origen: ");
        //imprimirArreglo(aiPrueba);
        long tIni = System.nanoTime();
        selectionSort(aiPrueba);
        long tFin =System.nanoTime();
        System.out.println("Tardo: " +(tFin - tIni)+ "miliseg");
        //System.out.println("Datos ordenados: ");
        //imprimirArreglo(aiPrueba);
        
        //Ordenar el arreglo con el Inserction Sort
        tIni = System.nanoTime();
        inserctionSort(aiCopia);
        tFin =System.nanoTime();
        System.out.println("Tardo: " +(tFin - tIni)+ "miliseg");
        //System.out.println("Datos ordenados: ");
        //imprimirArreglo(aiPrueba);*/
        
        
        /*
        
        //////////////////////////////////////  RESTRICTED AREA \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        int aiPruebaBubble[];
        aiPruebaBubble = new int[20];
        for (int i = 0; i < aiPruebaBubble.length; i++) {
            aiPruebaBubble[i] = (int)(Math.random()*100)+1;
        }
        System.out.println("Datos de origen: ");
        imprimirArreglo(aiPruebaBubble);
        bubbleAsquerosoSort(aiPruebaBubble);
        imprimirArreglo(aiPruebaBubble);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        */
        /////////////////////////////////// Quick Sort \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        
        int aiPruebaQuick[] = new int[20];
        for (int i = 0; i < aiPruebaQuick.length; i++) {
            aiPruebaQuick[i] = (int)(Math.random()*100)+1;
        }
        System.out.println("Datos de origen: ");
        imprimirArreglo(aiPruebaQuick);
        QuickSort(aiPruebaQuick);
        System.out.println("Datos ordenados");
        imprimirArreglo(aiPruebaQuick);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
    }
 
    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void imprimirArreglo(int[] aiDatos){
        for (int i : aiDatos) {
            System.out.print("["+i+"] ");
        }
        System.out.println("\n-----------------------------------------------------------------------");
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void selectionSort(int[] aiDatos){
       
        for (int i = 0; i < aiDatos.length; i++) {//Lista en desorden...
            int iMin = i;
            //Marcar la posición del mas pequeño:
            for (int j = i+1; j < aiDatos.length; j++) {
                if (aiDatos[j] < aiDatos[iMin]) {
                    iMin = j;  
                }         
            }
            //Intercambio con la primer posición de la lista en desorden
            int iTemp = aiDatos[iMin];
                aiDatos[iMin] = aiDatos[i];
                aiDatos[i] = iTemp;
        }
   
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void inserctionSort(int[] aiDatos){   
        for (int i = 0; i < aiDatos.length; i++) {
            int j = i;
            while (j > 0 && aiDatos[j] < aiDatos[j - 1]) {
                int Aux = aiDatos[j];//Variable auxiliar para no perdr el valos que se es remplazado
                aiDatos[j] = aiDatos[j - 1];
                aiDatos[j - 1] = Aux;
                j--;
            }
        }
    }    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void bubbleAsquerosoSort(int[] aiDatos){//YOU HAVE TO AVOID THIS ALGORITHM
        
        for (int k = 0; k < aiDatos.length-1; k++) {  
            for (int i = 0; i < aiDatos.length-1; i++) {
                int j = i+1;
                if(aiDatos[i]>aiDatos[j]){
                    int temp = aiDatos[i];
                    aiDatos[i] = aiDatos[j];
                    aiDatos[j] = temp;
                    
                }
               
            }
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void QuickSort(int[] aiDatos){
        QuickSort(aiDatos, 0,aiDatos.length-1);
    }
    public static int[] QuickSort(int[] arre, int ini, int fin){
        int piv;
        if (ini < fin) {
            piv = partition(arre, ini, fin);//Cacular el pivote del arreglo y saber si está o no particionado en varios arreglos
            QuickSort(arre, ini, piv);// Particion izquierda del pivote
            QuickSort(arre, piv+1, fin);// Particion derecha del pivote
        }
        return arre;
    }
    public static int partition(int[] arre, int ini, int fin){
        int piv, posPiv;
        piv = arre[ini];
        posPiv = ini;
        for (int i = ini+1; i <= fin; i++) {
            if(arre[i]<piv){
            arre[posPiv]= arre[i];
            arre[i]=arre[posPiv+1];
            posPiv++;//Cada que se cambia la posicion del pivote aumenta
            }
        }
        arre[posPiv] = piv;
        return posPiv;
    } 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Merge
    
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
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}


