public class findDuplicate {
 
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 9, 1, 10, 11, 11};
    
            findDuplicates(array);
        }
    
        static void findDuplicates(int[] array) {
            boolean hasDuplicates = false;
    
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        hasDuplicates = true;
                        System.out.println("Duplicate found: " + array[i]);
                    }
                }
            }
    
            if (!hasDuplicates) {
                System.out.println("No duplicates found");
            }
        }
    }
    

