import java.util.ArrayList;

public class Basics_of_Heap {
    // Learn about how to insertelement in heap
    // Heap is implemented as an ArrayList
    // and Visualize as a Complete Binary Tree (CBT -> it is a tree which have fulled all the levels except last one)
    // CBT is always be add the Elements from left to right manner
    // There are two types of Heaps are there  1, Min Heap  2, Max Heap
    // 1, Min Heap -> In a min heap, the parent node is always smaller than or equal to its children, ensuring the smallest element is always at the root
    // 2, Max Heap -> the parent node is always larger than or equal to its children, ensuring the largest element is always at the root.

    // let's Code this
    
    public static void main(String[] args) {
        // now we create our heap
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(6);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}

class Heap {
    // Using an ArrayList to store the elements of the heap
    ArrayList<Integer> arr = new ArrayList<>();

    // Method to add an element to the heap
    public void add(int data) {
        // Add the element to the end of the ArrayList
        arr.add(data);
        
        // After adding, we need to ensure the heap property is maintained
        int child_index = arr.size() - 1; // Index of the newly added element (child)
        int parent_index = (child_index - 1) / 2; // Index of the parent of the new element

        // For Min Heap: The parent should always be smaller than the child
        // So, we swap if the parent is larger than the child
        // This loop ensures the newly added element bubbles up to the correct position
        while (arr.get(parent_index) > arr.get(child_index)) {
            // Swap the child with its parent to maintain the heap property
            int temp = arr.get(parent_index);
            arr.set(parent_index, arr.get(child_index));
            arr.set(child_index, temp);

            // Move up to the parent's index and check the heap property again
            child_index = parent_index;
            parent_index = (child_index - 1) / 2;
        }
    }

    // Method to return the smallest element in the heap (Min Heap property)
    public int peek() {
        return arr.get(0); // The root (first element) is always the smallest in a Min Heap
    }

    // Method to maintain the heap property (used after removing an element)
    private void heapify(int i) {
        int left = 2 * i + 1;  // Left child index
        int right = 2 * i + 2; // Right child index
        int minIdx = i;        // Index of the smallest element (initially the parent itself)

        // Compare parent with the left child. If the left child is smaller, update minIdx
        if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
            minIdx = left;
        }

        // Compare minIdx (parent or left child) with the right child
        if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
            minIdx = right;
        }

        // If minIdx has changed, it means the heap property was violated
        // So, we swap the parent with the smaller child and continue to heapify
        if (minIdx != i) {
            // Swap the parent with the smaller child
            int temp = arr.get(i);
            arr.set(i, arr.get(minIdx));
            arr.set(minIdx, temp);

            // Recursively heapify the affected subtree
            heapify(minIdx);
        }
    }

    // Method to remove and return the smallest element from the heap (Min Heap)
    public int remove() {
        // The smallest element is always at the root (index 0)
        int data = arr.get(0);

        // Step 1: Swap the root with the last element in the heap
        int temp = arr.get(0);
        arr.set(0, arr.get(arr.size() - 1));
        arr.set(arr.size() - 1, temp);

        // Step 2: Remove the last element (which was the root originally)
        arr.remove(arr.size() - 1);

        // Step 3: Call heapify to restore the heap property from the root downwards
        heapify(0);

        // Return the smallest element (which was the original root)
        return data;
    }

    // Method to check if the heap is empty
    public boolean isEmpty() {
        return arr.size() == 0; // If the size of the ArrayList is 0, the heap is empty
    }
}


// by me
// class Heap{
//     ArrayList<Integer> arr = new ArrayList<>();
//     public void add(int data){
//         // add the element at last
//         arr.add(data);
//         // arrange the elements according to the heap rules
//         int child_index = arr.size()-1;
//         int parent_index = (child_index-1)/2;
//         // while (arr.get(parent_index) < arr.get(child_index)) { // for Max Heap
//         while (arr.get(parent_index) > arr.get(child_index)) { // for Min Heap
//             int temp = arr.get(parent_index);
//             arr.set(parent_index, arr.get(child_index));
//             arr.set(child_index, temp);
//             child_index = parent_index;
//             parent_index = (child_index-1)/2;
//         }
//     }
//     public int peek(){
//         return arr.get(0);
//     }
//     private void heapify(int i){
//         int left = 2*i+1;
//         int right = 2*i+2;
//         int minIdx = i;

//         // if (left < arr.size() && arr.get(minIdx) < arr.get(left)) { // for Max Heap
//         if (left < arr.size() && arr.get(minIdx) > arr.get(left)) { // for Min Heap
//             minIdx = left;
//         }

//         // if (right < arr.size() && arr.get(minIdx) < arr.get(right)) { // for Max Heap
//         if (right < arr.size() && arr.get(minIdx) > arr.get(right)) { // for Min Heap
//             minIdx = right;
//         }

//         if (minIdx != i) {
//             // swap
//             int temp = arr.get(i);
//             arr.set(i, arr.get(minIdx));
//             arr.set(minIdx, temp);

//             // again call heapify for minIdx
//             heapify(minIdx);
//         }
//     }
//     public int remove(){
//         int data = arr.get(0);
        
//         // step 1 - swap first & last index
//         int temp = arr.get(0);
//         arr.set(0, arr.get(arr.size()-1));
//         arr.set(arr.size()-1, temp);

//         // step 2 - delete last element
//         arr.remove(arr.size()-1);

//         // step 3 - heapify
//         heapify(0);
//         return data;
//     }
//     public boolean isEmpty(){
//         return arr.size() == 0;
//     }
// }
