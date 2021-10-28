package com.niit.oops;
import com.niit.oops.Address;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AddressTests {
    private Address addressOne;
    private Address addressTwo;

    @BeforeEach
    public void setUp() {
        addressOne = new Address("HSR", "Bangalore");
        addressTwo = new Address("HSR", "Bangalore");
    }

    @AfterEach
    public void tearDown() {
        addressOne = null;
        addressTwo = null;
    }

    @Test
    public void givenValidPropertyValuesWhenAddressObjectCreatedThenPropertiesAreSet() {
        assertEquals("HSR", addressOne.getArea());
        assertEquals("Bangalore", addressOne.getCity());
    }

    @Test
    public void givenTwoAddressObjectsWhenPropertyValuesAreSameThenEqualsMethodReturnsTrue() {
        assertTrue(addressOne.equals(addressTwo));
        assertTrue(addressTwo.equals(addressOne));
    }

//    @Test
//    public void givenTwoAddressObjectsWhenPropertyValuesAreDifferentThenEqualsMethodReturnsFalse() {
//        addressTwo.setCity("Mangalore");
//        assertFalse(addressOne.equals(addressTwo));
//        assertFalse(addressTwo.equals(addressOne));
//    }

//    @Test
//    public void givenTwoAddressObjectsWhenPassedAddressObjectIsNullThenEqualsMethodReturnsFalse() {
//        addressTwo = null;
//        assertFalse(addressOne.equals(addressTwo));
//    }

//    @Test
//    public void givenAddressObjectsWhenOtherObjectIsNotAddressThenEqualsMethodReturnsFalse() {
//        String sample = "sample";
//        assertFalse(addressOne.equals(sample));
//    }

    @Test
    public void givenTwoAddressObjectsWhenBothObjectsPropertyValueIsNullThenEqualsMethodReturnsTrue() {
        addressOne.setCity(null);
        addressTwo.setCity(null);
        assertTrue(addressOne.equals(addressTwo));
        assertTrue(addressTwo.equals(addressOne));
    }
//
//    @Test
//    public void givenTwoAddressObjectsWhenOneObjectsPropertyValuesIsNullThenEqualsMethodReturnsFalse() {
//        addressOne.setCity(null);
//        assertFalse(addressOne.equals(addressTwo));
//        assertFalse(addressTwo.equals(addressOne));
//    }
}
