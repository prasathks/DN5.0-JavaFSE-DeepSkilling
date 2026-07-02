-- PL/SQL script for Stored Procedures
CREATE OR REPLACE PROCEDURE update_employee_salary (
    p_emp_id IN NUMBER,
    p_increment_pct IN NUMBER
)
IS
    v_current_salary NUMBER;
BEGIN
    -- This is a dummy query for demonstration
    -- SELECT salary INTO v_current_salary FROM employees WHERE emp_id = p_emp_id;
    
    -- Simulate current salary
    v_current_salary := 50000;
    
    DBMS_OUTPUT.PUT_LINE('Current salary for employee ' || p_emp_id || ' is ' || v_current_salary);
    
    -- Simulate the update
    v_current_salary := v_current_salary + (v_current_salary * p_increment_pct / 100);
    
    -- UPDATE employees SET salary = v_current_salary WHERE emp_id = p_emp_id;
    
    DBMS_OUTPUT.PUT_LINE('New salary updated to: ' || v_current_salary);
END update_employee_salary;
/

-- Executing the procedure
BEGIN
    update_employee_salary(101, 10);
END;
/
