# Software-Testing-with-Junit
We define three projects with different sizes in Java and we test them with Junit. If the Actual results given by the methods are equal to the expected results, then we can conclude that the method is working properly. By testing a program, we want to lower the risk of using a software or develop higher quality softwares. The set of test values and the expected answers is called Test Cases.
<h4>Small Test Project</h4>
<p>In the Matrix.java class, we have three simple methods for operating on matrices and also checking if a given number is prime.</p>
<p>In the MatrixTest.java class, we write simple test methods to test each of the methods defined in Matrix.java class</p>
<p>In the MatrixRunner.java class, we run the test methods in the MatrixTest.java on the methods defined in the Matrix.java class.</p>

<h4>Medium Test Project</h4>
<p>In the WierdSort.java class, we have a method that works as the following.</p>
<p>This method, will take a Double array and sort them in a way that the odd numbers will be sorted <br>
	 in ascending order, and the even numbers will be sorted afterwards in descending order. <br>
	 This is an example of how it works:<br>
	 input: {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}<br>
	 output:{1, 3, 5, 7, 9, 8, 6, 4, 2, 0}<br>
	 If there are decimal numbers, then the number must be rounded down to the closest intege</p>
<p>In the WierdSortTest.java class, we write a test method and a set of values to test the method defined in the WierdSort.java against those test values. We also define the actual values for that test, which are the values that we expect of the method defined in WierdSort.java class.</p>
<p>In the WierdSortRunner.java class, we run the test methods in the WierdSortTest.java on the methods defined in the WierdSort.java class.</p>

<h4>Large Test Project</h4>
<p>In the Loopover.java class, we have a method that works as the following.</p>
<p>In this method, we get a board and apply some moves to the board and return the board after the moves. <br>
 We have four distinct moves:<br>
 U: means up. for instance, U3 means that the fourth column should move one step upward.(upward shift) <br>
 D: means down. for instance, D2 means that the third column should move one step downward. (downward shift) <br>
 L: means left. for instance, L3 means that the fourth row should move one step to the left. (shift to the left) <br>
 R: means right. for instance, R0 means that the first row should move one step to the right. (shift to the right) <br>
</p>
<p>In the LoopoverTest.java class, we write a test method and a set of values to test the method defined in the Loopover.java against those test values. We also define the actual values for that test, which are the values that we expect of the method defined in Loopover.java class. </p>
<p>In the LoopoverRunner.java class, we run the test methods in the LoopoverTest.java on the methods defined in the Loopover.java class.</p>
