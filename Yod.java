package syete; 
import java.util.*;
import java.util.Scanner; 
public class Yod {
	public static void main(String[] args) {

		// int [] numbers = new int [5]; //size, length
		// // int [0,0,0,0,0,0]| String [null,null,null,null,null,]
		// int [] nums = {10,20,30,40};
		//
		// System.out.println(nums[0]);
		// System.out.println(nums[2]);
		// nums[2] = 50;
		// System.out.println(nums[2]);
		//

		// for(int i=0; i<nums.length;i++) {
		// System.out.println(nums[i]);

		// }

		//

		// for (int num:nums) {
		// System.out.println(num);
		// }

		Scanner sc = new Scanner(System.in);

		//

		// String[] names = new String[3];
		// for(int x=0;x<names.length;x++) {
		// System.out.println("Enter Names: ");
		// names[x]=sc.nextLine();

		// }

		//

		// for(String name: names) {
		// System.out.println(name);
		// }

		// int[][] matrix = new int[4][3];
		// for(int x=0;x<matrix.length;x++) {
		// for(int y=0;y<matrix[x].length;y++) {
		// matrix[x][y]=sc.nextInt();

		// }

		// }

		// for(int x=0;x<matrix.length;x++) {
		// for(int y=0;y<matrix[x].length;y++) {
		// System.out.print(matrix[x][y]+" ");
		// }

		// System.out.println(" ");
		// }

		// for(int numbers[]:matrix) {
		// for(int num:numbers) {
		// System.out.print(num + " ");
		// }

		// System.out.println(" ");

		// }

		int numbers[][] = {{100,200,300,400},{10,20,30,40},{1,2,3,4},{5,15,30,90}};
		for(int i=0; i<numbers.length;i++) {
			for(int j=0; j<numbers[i].length;j++) {
				if(numbers[i][j]==2) {
					System.out.println("Number 15 is found at indices " + i + " & " + j);

				}

			}

		}

		System.out.println("old:");
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");

			}

			System.out.println();
		}

		int x = -1, y = -1;
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				if(numbers[i][j] == 15) {
					x = i;
					y = j;

				}

			}

		}

		System.out.println("Number 15 is found at indices " + x + " & " + y);
		if(x != -1 && y != -1) {
			numbers[x][y] = 99;
		}

		System.out.println("updated:");
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}

			System.out.println();

		}

		//print the current 2d array
		//find index of number 15.
		//print the indices of number 15.
		//get x and y
		//update 15 - > 99
		//print the updated 2d array

	}

}