public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Original queue
        for(int i = 0; i < queue.size(); i++) {
            System.out.println(queue.get(i));
        }

        // Push testing
        System.out.println();
        testPush(queue, 4);
        for(int i = 0; i < queue.size(); i++) {
            System.out.println(queue.get(i));
        }

        // Remove testing
        System.out.println();
        testRemove(queue, 0);
        for(int i = 0; i < queue.size(); i++) {
            System.out.println(queue.get(i));
        }

        // Duplicate testing
        System.out.println();
        testPush(queue, 4);
        for(int i = 0; i < queue.size(); i++) {
            System.out.println(queue.get(i));
        }

        System.out.println();
        testRemoveDuplicate(queue);
        for(int i = 0; i < queue.size(); i++) {
            System.out.println(queue.get(i));
        }

        // Remove all value testing
        System.out.println();
        testPush(queue, 5);
        testPush(queue, 4);
        testPush(queue, 5);
        testPush(queue, 5);
        testPush(queue, 3);
        for(int i = 0; i < queue.size(); i++) {
            System.out.println(queue.get(i));
        }

        System.out.println();
        testRemoveAll(queue, 5);
        for(int i = 0; i < queue.size(); i++) {
            System.out.println(queue.get(i));
        }

    }


    public static <E> void testPush(Queue<E> queue, E value) {
        queue.push(value);
    }

    public static <E> void testRemove(Queue<E> queue, int index) {
        queue.remove(index);
    }

    public static <E> void testRemoveDuplicate(Queue<E> queue) {
        queue.removeDuplicates();
    }

    public static <E> void testRemoveAll(Queue<E> queue, E value) {
        queue.removeAll(value);
    }



}
