class Test {
    public static void main(String args[]) {
        int intArray[] = { 1, 2, 3 };

        int cloneArray[] = intArray.clone();

        // Will print false as a shallow copy is created
        System.out.println(intArray == cloneArray);

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");
        }
    }
}
