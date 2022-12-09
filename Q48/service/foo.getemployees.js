module.exports.getEmployees=async(req,res,next)=>{
    var employees=require('./employees')
    console.log("this is getting  the list of all employees");
    const obj=req.body;
    console.log(obj);
    res.send({employees});
}