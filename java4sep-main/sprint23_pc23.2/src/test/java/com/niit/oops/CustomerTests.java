package com.niit.oops;

import com.niit.oops.Address;
import com.niit.oops.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTests {

    private Customer customerOne;
    private Customer customerTwo;
    private Address addressOne;
    private Address addressTwo;

    @BeforeEach
    public void setUp() {
        addressOne = new Address("HSR", "Bangalore");
        addressTwo = new Address("HSR", "Bangalore");
        customerOne = new Customer(101, "John", "john@stackroute.in", addressOne);
        customerTwo = new Customer(101, "John", "john@stackroute.in", addressTwo);
    }

    @AfterEach
    public void tearDown() {
        addressOne = null;
        addressTwo = null;
        customerOne = null;
        customerTwo = null;
    }

    @Test
    public void givenValidPropertyValuesWhenCustomerObjectCreatedThenPropertiesAreSet() {
        assertEquals(101, customerOne.getCustomerId());
        assertEquals("John", customerOne.getName());
        assertEquals("john@stackroute.in", customerOne.getEmail());
        assertNotNull(customerOne.getAddress());
    }

    @Test
    public void givenTwoCustomerObjectsWhenPropertyValuesAreSameThenReturnTrue() {
        assertTrue(customerOne.equals(customerTwo));
        assertTrue(customerTwo.equals(customerOne));
    }

    @Test
    public void givenTwoCustomerObjectsWhenCreatedUsingDefaultConstructorThenReturnTrue() {
        customerOne = new Customer();
        customerTwo = new Customer();
        assertTrue(customerOne.equals(customerTwo));
        assertTrue(customerTwo.equals(customerOne));
    }

    @Test
    public void givenCustomerObjectWhenComparedWithItselfThenEqualsShouldReturnTrue() {
        assertTrue(customerOne.equals(customerOne));
        assertTrue(customerTwo.equals(customerTwo));
    }
//
//    @Test
//    public void givenTwoCustomerObjectsWhenPropertyValuesAreDifferentThenEqualsMethodReturnsFalse() {
//        customerOne.setCustomerId(102);
//        assertFalse(customerOne.equals(customerTwo));
//        assertFalse(customerTwo.equals(customerOne));
//    }
//
//    @Test
//    public void givenTwoCustomerObjectsWhenAddressValuesAreDifferentThenEqualsMethodReturnsFalse() {
//        customerOne.getAddress().setCity("Mangalore");
//        assertFalse(customerOne.equals(customerTwo));
//        assertFalse(customerTwo.equals(customerOne));
//    }

//
//    @Test
//    public void givenTwoCustomerObjectsWhenPassedCustomerObjectIsNullThenEqualsMethodReturnsFalse() {
//        customerTwo = null;
//        assertFalse(customerOne.equals(customerTwo));
//    }
//
//    @Test
//    public void givenCustomerObjectsWhenOtherObjectIsNotCustomerThenEqualsMethodReturnsFalse() {
//        String sample = "sample";
//        assertFalse(customerOne.equals(sample));
//    }

    @Test
    public void givenTwoCustomerObjectsWhenBothObjectsPropertyValueIsNullThenEqualsMethodReturnsTrue() {
        customerOne.setEmail(null);
        customerTwo.setEmail(null);

        assertTrue(customerOne.equals(customerTwo));
        assertTrue(customerTwo.equals(customerOne));
    }

//
//    @Test
//    public void givenTwoCustomerObjectsWhenOneObjectsPropertyValuesIsNullThenEqualsMethodReturnsFalse() {
//        customerTwo.setEmail(null);
//        assertFalse(customerOne.equals(customerTwo));
//        assertFalse(customerTwo.equals(customerOne));
//    }
}
