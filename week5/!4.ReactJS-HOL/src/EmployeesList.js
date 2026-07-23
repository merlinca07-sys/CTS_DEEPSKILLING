import EmployeeCard from './EmployeeCard';
function EmployeesList(props) {
    return (
        <div>
            <h1>Employees List</h1>
            {
                props.employees.map(employee =>
                    <EmployeeCard employee={employee}  />
                    )}
        </div>
    );
}
export default EmployeesList;

