# GenericQueue
Generic Queue - for practice
Created May 17th, 2019

-------------------------------------------------------------------------------
## Overview
This is a program to test out and practice Generic Queues, using the E generic.

-------------------------------------------------------------------------------
### Classes
1. Main.java 
 * Class for the main driver, contains function testing
 * Functions:
   * testPush(Queue<E> queue, E value)
     * This function test the functionality of the push method
   * testRemove(Queue<E> queue, int index)
     * This function test the functionality of the remove method
   * testRemoveDuplicate(Queue<E> queue)
     * This function will test the functionality of the remove duplicate method
   * testRemoveAll(Queue<E> queue, E value)
     * This function will test the functionality of the remove all method
 
 
2. Queue.java 
 * Class contains data structure for generic queues
 * Functions:
   * add(E value)
     * This function will add the given value
   * remove()
     * This function will remove a value
   * push()
     * This function will insert a value at the end of the array, expanding it
   * peek()
     * This function will return the first index of the array
   * isEmpty()
     * This function will check whether the instantiated array is empty
   * remove(int index)
     * This function will remove the value on the given index
   * removeAll(E value)
     * This function will remove all of the given value in the array
   * removeDuplicates()
     * This function will remove all duplicates
   * size()
     * This function will return the size of the array
   * equals(Object obj)
     * This function will check for equality
   * get(int index)
     * This function will return the value at the given index
   * expandSize()
     * This function will expand the size of the array
