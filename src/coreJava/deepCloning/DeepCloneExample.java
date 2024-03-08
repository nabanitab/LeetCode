package coreJava.deepCloning;

//Deep cloning creates a new object and recursively copies all fields, including the fields
// of referenced objects. This ensures that the cloned object is completely independent of the original object.
public class DeepCloneExample {

        public static void main(String[] args) {
            int[] originalData = {1, 2, 3};
            DeepCopy original = new DeepCopy(originalData);

            try {
                DeepCopy cloned = (DeepCopy) original.clone();

                // Modify the cloned object's data
                cloned.getData()[0] = 5;

                // The modification will only affect the cloned object
                System.out.println("Original Data: " + original.getData()[0]); // 1
                System.out.println("Cloned Data: " + cloned.getData()[0]); // 5
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
}
