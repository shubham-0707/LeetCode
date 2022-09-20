Select Department.name AS "Department" , Employee.name AS "Employee" , Employee.Salary from employee join department on employee.departmentId=department.id where (employee.departmentId , salary) in (select departmentId , max(salary) from employee group by departmentId);
