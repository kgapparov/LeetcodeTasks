package Arrays;

import static org.junit.jupiter.api.Assertions.*;

class myArrayCollectionTest {
    ArrayCollection mySolutions;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        mySolutions = new myArrayCollection();
    }

    @org.junit.jupiter.api.Test
    void duplicateZeroes() {
        int[] arr = new int[] {1,0,2,3,0,4,5,0};
        mySolutions.duplicateZeroes(arr);
        int[] exp = new int[] {1,0,0,2,3,0,0,4};
        assertArrayEquals(arr, exp);
    }

    @org.junit.jupiter.api.Test
    void greatestElementToTheRight() {
        int[] arr = new int[] {17,18,5,4,6,1};
        mySolutions.greatestElementToTheRight(arr);
        int[] exp = new int[] {18,6,6,6,1,-1};
        assertArrayEquals(arr, exp);
    }


    @org.junit.jupiter.api.Test
    void isMountainArray() {
        assertTrue(mySolutions.isMountainArray(new int[]{0,3,2,1}));
        assertFalse(mySolutions.isMountainArray(new int[]{2,1}));
        assertFalse(mySolutions.isMountainArray(new int[]{1,2,3}));
    }

    @org.junit.jupiter.api.Test
    void moveZeroes() {
        int[] arr = new int[] {0,1,0,3,12};
        mySolutions.moveZeroes(arr);
        int[] exp = new int[] {1,3,12,0,0};
        assertArrayEquals(exp, arr);
    }

//    @org.junit.jupiter.api.Test
//    void isDoubleElement() {
//
//    }
//
//    @org.junit.jupiter.api.Test
//    void removeDuplicates() {
//    }
}