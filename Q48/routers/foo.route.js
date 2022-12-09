const { Router }=require("express");
const router=new Router();

const fooemp=require("../service/foo.getEmployees");
const fooempid=require("../service/foo.getempbyID");
router.get("/",fooemp.getEmployees);
router.get("/:id",fooempid.getEmpbyID);
module.exports=router;