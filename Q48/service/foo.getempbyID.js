const { json } = require('body-parser');

module.exports.getEmpbyID=async(req,res,next)=>{
    var employees=require('./employees')
    console.log("this is get employee by ID");
    const obj=req.params;
    console.log(obj.id);
    var EmployeeID=obj.id;
    var employee=employees[EmployeeID]
    console.log(employee);
    res.send({employee});
}