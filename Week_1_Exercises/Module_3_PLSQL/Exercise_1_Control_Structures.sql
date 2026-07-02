-- PL/SQL script for Control Structures
DECLARE
    v_score NUMBER := 85;
    v_grade VARCHAR2(2);
BEGIN
    -- IF-THEN-ELSE control structure
    IF v_score >= 90 THEN
        v_grade := 'A';
    ELSIF v_score >= 80 THEN
        v_grade := 'B';
    ELSIF v_score >= 70 THEN
        v_grade := 'C';
    ELSE
        v_grade := 'F';
    END IF;

    DBMS_OUTPUT.PUT_LINE('The grade for score ' || v_score || ' is: ' || v_grade);
    
    -- FOR loop structure
    DBMS_OUTPUT.PUT_LINE('Counting from 1 to 5:');
    FOR i IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE('Count: ' || i);
    END LOOP;
END;
/
