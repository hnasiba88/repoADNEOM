/**
 * 
 */
package array.partition;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;


/**
 * 
 * @author Nasiba HUSEYNOVA
 *
 */
public class PartitionArrayTest {

	/**
	 * For ex.:
	 * <pre>{@code
	 * int[][] partitionArray = PartitionArray.partitionArray(new int[] {1,2,3,4,5,6}, 4);
	 * assertArrayEquals(partitionArray[0], new int[] {1,2,3,4});
	 * assertArrayEquals(partitionArray[1], new int[] {5,6});
	 * }</pre>
	 * **/
	@Test
	public void testPartition() {
		int[][] partitionArray = PartitionArray.partitionArray(new int[] {1,2,3,4,5,6}, 4);
		assertArrayEquals(partitionArray[0], new int[] {1,2,3,4});
		assertArrayEquals(partitionArray[1], new int[] {5,6});
	}

}
