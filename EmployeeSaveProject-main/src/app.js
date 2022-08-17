import {Requests} from "./requests";
import {UI} from "./ui";

const $ = (id) => document.getElementById(id);
const nameInput = $('name')
const departmentInput = $('department')
const salaryInput = $('salary')
const employeesList = $('employees')
const updateEmployeeBtn = $('update')
const employee_card = $('employee-card')
const button = $('employee-list')
const addForm = $('addForm')
const count = $('count')
const request = new Requests('http://localhost:3000/employees')
const ui = new UI()

let updateState = null;

function eventListener(){
    button.addEventListener('click', showHideEmployees)
    document.addEventListener('DOMContentLoaded', getAllEmployees)
    document.addEventListener('submit',addEmployee)
    employeesList.addEventListener('click',UpdateorDelete)
    updateEmployeeBtn.addEventListener('click',updateEmployee)

} eventListener()
 // GET Employee
function getAllEmployees(){
    request.get()
        .then(employees => {
            ui.addAllEmployeestoUI(employees)
            count.textContent = Object.keys(employees).length + ' adet kayıt bulundu.';
        })
        .catch(err => ui.toastHTML(err,'error'))
}
// POST Employee
function addEmployee(e){
    // çalışan ekleme
    const employeeName = nameInput.value.trim()
    const employeeDepartment = departmentInput.value.trim()
    const employeeSalary = salaryInput.value.trim()

    // post request
    request.post({name:employeeName,department:employeeDepartment,salary:Number(employeeSalary)})
        .then(employee => {
            ui.newEmployeeAdd(employee)
            let employeeName = employee.name.toUpperCase()
            ui.toastHTML(employeeName,'success')
        })
        .catch(err => ui.toastHTML(err,'error'))
    ui.clearInput()
    e.preventDefault()
}

// PUT Employee
function UpdateorDelete(e){
    if (e.target.parentElement.id === 'delete-employee'){
        deleteEmployee(e.target)
    } else if(e.target.parentElement.id === 'update-employee'){
        updateEmployeeController(e.target.parentElement.parentElement.parentElement)
    }
}
function updateEmployeeController(targetEmployee){
    ui.toggleEmployeeBtn(targetEmployee);
    if (updateState === null){
        updateState = {
            updateId: targetEmployee.children[5].textContent,
            updateParent : targetEmployee
        }
    }else {
        updateState = null
    }
}

function updateEmployee() {
    if(updateState) {
     const data = {
         name : nameInput.value.trim(),
         department : departmentInput.value.trim(),
         salary : Number(salaryInput.value.trim())
     }
     request.put(updateState.updateId, data)
         .then(updatedEmployee => ui.updateEmployeeOnUI(updatedEmployee,updateState.updateParent))
         .catch(err => ui.toastHTML(err,'error'))
    }
}

// DELETE Employee
function deleteEmployee(targetEmployee){
    const id = targetEmployee.parentElement.parentElement.nextElementSibling.textContent;
    const employeeName = targetEmployee.parentElement.parentElement.previousElementSibling.previousElementSibling.previousElementSibling.previousElementSibling.textContent.toUpperCase();
    request.delete(id)
        .then(message => {
            ui.deleteEmployeeFromUI(targetEmployee.parentElement.parentElement.parentElement)
            ui.toastHTML(employeeName,'delete')
        })
}

export default function showHideEmployees(){
    let body = document.body;
    let container = document.getElementsByClassName('container')
    if (employee_card.style.opacity === '0'){
        employee_card.style.opacity = 1;
        addForm.style.display = 'none';
        button.textContent = 'Çalışan Ekle';
        body.style.overflow = 'scroll';
        for (let i=0; i<container.length ;i ++){
            container[i].style.marginTop = '0';
        }
    }else {
        employee_card.style.opacity = 0;
        button.textContent = 'Çalışan Listesini Göster';
        addForm.style.display = 'block';
        body.style.overflow = 'hidden';
        for (let i=0; i<container.length ;i ++){
            container[i].style.marginTop = '0';
        }
    }
}