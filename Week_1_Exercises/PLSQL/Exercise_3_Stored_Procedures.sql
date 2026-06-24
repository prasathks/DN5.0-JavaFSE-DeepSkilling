CREATE OR REPLACE PROCEDURE update_employee_salary (
    p_emp_id IN NUMBER,
    p_increment_pct IN NUMBER
)
IS
    v_current_salary NUMBER;
BEGIN

    
    
    v_current_salary := 50000;
    
    DBMS_OUTPUT.PUT_LINE('Current salary for employee ' || p_emp_id || ' is ' || v_current_salary);

    v_current_salary := v_current_salary + (v_current_salary * p_increment_pct / 100);

    
    DBMS_OUTPUT.PUT_LINE('New salary updated to: ' || v_current_salary);
END update_employee_salary;
/

BEGIN
    update_employee_salary(101, 10);
END;
/
