package test.java;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

class AlgoTest {
	
	SortDemoData data = new SortDemoData();
	
    /**
     * sameSize checks that the given array and the output array have the same size
     */
    @Test
    public void sameSize() {
        data.initializeArray("2 3 4");
        Item[] copyOfMyArray = new Item[data.myArray.length];
        System.arraycopy(
                data.myArray, 0, copyOfMyArray, 0, data.myArray.length);
        
        SortAlgos.bubbleSort(data.myArray);
        
        assertTrue(data.myArray.length == copyOfMyArray.length);
    }
    
    /**
     * emptyArray checks that the method throws a NullPointer for a given null array
     */
    @Test
    public void emptyArray() {
        assertThrows(NullPointerException.class,
                ()->{
                    Item[] myArray = null;
                    SortAlgos.bubbleSort(myArray);
                });
    }

    /**
     * correctSort checks that the array is sorted correctly at the end
     */
    @Test
    public void correctSort() {
        Item [] array = new Item[3];
        array[0] = new Item(5);
        array[1] = new Item(4);
        array[2] = new Item(3);
        SortAlgos.bubbleSort(array);
        System.out.println(array[0].key);
        assertTrue(array[0].key == 3);
        assertTrue(array[1].key == 4);
        assertTrue(array[2].key == 5);
    }
    
    /**
     * Node Coverage-Merge
     */
  	@Test
  	public void NodeMergeTest() {
  		data.initializeArray("101 100 64 72 31");  

  		data.runAlgo(3);
  		for(int i = 0; i < 3; i++)
  		{
  			for(int j = i+1; j < 5; j++)
  			{
  				assertTrue(data.myArray[i].key < data.myArray[j].key);
  			}
  		}
  	}

  	/**
  	 * Edge Coverage-Merge
  	 */
  	@Test
  	public void EdgeMergeTest() {
  		data.initializeArray("1");

  		data.runAlgo(3);
  		assertTrue(data.myArray[0].key == 1);
  	}


  	/**
  	 * Condition Coverage-Merge
  	 */
  	@Test
  	public void ConditionMergeTest() {
  		assertThrows(NullPointerException.class,
                ()->{
                	data.runAlgo(3);
                });
  	}

  	/**
  	 * Node Coverage-Selection
  	 */
  	@Test
  	public void NodeSelectionTest() {
  		data.initializeArray("101 100 64 72 31");  

  		data.runAlgo(1);
  		for(int i = 0; i < 3; i++)
  		{
  			for(int j = i+1; j < 5; j++)
  			{
  				assertTrue(data.myArray[i].key < data.myArray[j].key);
  			}
  		}
  	}

  	/**
  	 * Edge Coverage-Selection
  	 */
  	@Test
  	public void EdgeSelectionTest() {
  		data.initializeArray("1");

  		data.runAlgo(1);
  		assertTrue(data.myArray[0].key == 1);
  	}


  	/**
  	 * Condition Coverage-Selection
  	 */
  	@Test
  	public void ConditionSelectionTest() {
  		assertThrows(NullPointerException.class,
                ()->{
                	data.runAlgo(1);
                });
  	}

  	/**
  	 * Node Coverage-Insertion
  	 */
  	@Test
  	public void NodeInsertionTest() {
  		data.initializeArray("101 100 64 72 31");  

  		data.runAlgo(2);
  		for(int i = 0; i < 3; i++)
  		{
  			for(int j = i+1; j < 5; j++)
  			{
  				assertTrue(data.myArray[i].key < data.myArray[j].key);
  			}
  		}
  	}

  	/**
  	 * Edge Coverage-Insertion
  	 */
  	@Test
  	public void EdgeInsertionTest() {
  		data.initializeArray("1");

  		data.runAlgo(2);
  		assertTrue(data.myArray[0].key == 1);
  	}


  	/**
  	 * Condition Coverage-Insertion
  	 */
  	@Test
  	public void ConditionInsertionTest() {
  		assertThrows(NullPointerException.class,
                ()->{
                	data.runAlgo(2);
                });
  	}

  	/**
  	 * Node Coverage-Quick
  	 */
  	@Test
  	public void NodeQuickTest() {
  		data.initializeArray("101 100 64 72 31");  

  		data.runAlgo(4);
  		for(int i = 0; i < 3; i++)
  		{
  			for(int j = i+1; j < 5; j++)
  			{
  				assertTrue(data.myArray[i].key < data.myArray[j].key);
  			}
  		}
  	}

  	/**
  	 * Edge Coverage-Quick
  	 */
  	@Test
  	public void EdgeQuickTest() {
  		data.initializeArray("1");

  		data.runAlgo(4);
  		assertTrue(data.myArray[0].key == 1);
  	}


  	/**
  	 * Condition Coverage-Quick
  	 */
  	@Test
  	public void ConditionQuickTest() {
  		assertThrows(NullPointerException.class,
                ()->{
                	data.runAlgo(4);
                });
  	}

  	/**
  	 * Node Coverage-Heap
  	 */
  	@Test
  	public void NodeHeapTest() {
  		data.initializeArray("101 100 64 72 31");  

  		data.runAlgo(5);
  		for(int i = 0; i < 3; i++)
  		{
  			for(int j = i+1; j < 5; j++)
  			{
  				assertTrue(data.myArray[i].key < data.myArray[j].key);
  			}
  		}
  	}

  	/**
  	 * Edge Coverage-Heap
  	 */
  	@Test
  	public void EdgeHeapTest() {
  		data.initializeArray("1");

  		data.runAlgo(5);
  		assertTrue(data.myArray[0].key == 1);
  	}


  	/**
  	 * Condition Coverage-Heap
  	 */
  	@Test
  	public void ConditionHeapTest() {
  		assertThrows(NullPointerException.class,
                ()->{
                	data.runAlgo(5);
                });
  	}
}

