package Allproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class EmployeeRecordCRUDTest {

    @Test
    public void testCreateEmployeeRecord() {
        String input = "John Doe\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        EmployeeRecordCRUD.createEmployeeRecord(scanner);
        assertEquals("John Doe", EmployeeRecordCRUD.employeeRecords.get(1));
    }

    @Test
    public void testReadEmployeeRecord() {
        EmployeeRecordCRUD.employeeRecords.put(1, "Jane Smith");
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        EmployeeRecordCRUD.readEmployeeRecord(scanner);
        assertEquals("Jane Smith", EmployeeRecordCRUD.employeeRecords.get(1));
    }

    @Test
    public void testUpdateEmployeeRecord() {
        EmployeeRecordCRUD.employeeRecords.put(1, "Jane Smith");
        String input = "1\nJohn Doe\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        EmployeeRecordCRUD.updateEmployeeRecord(scanner);
        assertEquals("John Doe", EmployeeRecordCRUD.employeeRecords.get(1));
    }

    @Test
    public void testDeleteEmployeeRecord() {
        EmployeeRecordCRUD.employeeRecords.put(1, "Jane Smith");
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        EmployeeRecordCRUD.deleteEmployeeRecord(scanner);
        assertNull(EmployeeRecordCRUD.employeeRecords.get(1));
    }
}
