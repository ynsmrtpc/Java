import { showHideEmployees } from "./app.js";
const $ = (id) => document.getElementById(id);
export class UI{
    constructor() {
        this.employeeList = $('employees')
        this.updateBtn = $('update-employee')
        this.addBtn = $('add')
        this.nameInput = $('name')
        this.departmentInput = $('department')
        this.salaryInput = $('salary')
        this.update_name = $('update_name')
        this.update_department = $('update_department')
        this.update_salary = $('update_salary')

    }
    addAllEmployeestoUI(employees){
        let result = ''
        employees.forEach(employee => {
             result += `
        <tr>
            <td>${employee.name}</td>
            <td>${employee.department}</td>
            <td>${employee.salary} ₺</td>
            <td><button data-toggle="modal" data-target="#formModal" type="button" style="margin-left: 15px" id="update-employee" class="btn-floating btn-small waves-effect green update"><i class="fa fa-pencil"></i></button></td>
            <td><a href="#" id="delete-employee" class="btn-floating btn-small waves-effect red"> <i class="fa fa-remove"></i></a></td>
            <td class="d-none">${employee.id}</td>  
        </tr>
             `
        })
        this.employeeList.innerHTML = result;
    }
    clearInput(){
        this.departmentInput.value = ''
        this.nameInput.value = ''
        this.salaryInput.value = ''
    }

    toastHTML(text,method){
        let message = ''
        if (method === 'delete'){
            message = 'başarıyla silindi'
        } else if(method === 'success'){
            message = 'başarıyla eklendi'
        }
        let toastHTML = `<div id="toast"><strong> ${text}</strong> <span>  ${message}</span> </div>`
        M.toast({html: toastHTML});
    }

    newEmployeeAdd(employee){
        this.employeeList.innerHTML += `
        <tr>
            <td>${employee.name}</td>
            <td>${employee.department}</td>
            <td>${employee.salary} ₺</td>
            <td><button data-toggle="modal" data-target="#formModal" type="button" style="margin-left: 15px"  id="update-employee" class="btn-floating btn-small waves-effect green update"><i class="fa fa-pencil"></i></button></td>
            <td><a  href="#" id="delete-employee" class="btn-floating btn-small waves-effect red"> <i class="fa fa-remove"></i></a></td>
            <td class="d-none">${employee.id}</td>  
        </tr>
        `
    }
    toggleEmployeeBtn(target){
        this.addEmployeeInfoToInputs(target)
    }
    addEmployeeInfoToInputs(target){
        const children = target.children
        this.update_name.value = children[0].textContent
        this.update_department.value = children[1].textContent
        this.update_salary.value = children[2].textContent.slice(0, -1).trim();
    }

    updateEmployeeOnUI(employee,parent){
        parent.innerHTML= `
        <tr>
            <td>${employee.name}</td>
            <td>${employee.department}</td>
            <td>${employee.salary} ₺</td>
            <td><a style="margin-left: 15px" id="update-employee" class="btn-floating btn-small waves-effect green"><i class="fa fa-pencil"></i></a></td>
            <td><a id="delete-employee" class="btn-floating btn-small waves-effect red"> <i class="fa fa-remove"></i></a></td>
            <td>${employee.id}</td>  
        </tr>
        `
        this.clearInput()
    }

    deleteEmployeeFromUI(element){
        element.remove();
    }
}