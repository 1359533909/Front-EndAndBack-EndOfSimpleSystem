package com.mxl.contoller;

import com.mxl.pojo.Item;
import com.mxl.pojo.User;
import org.springframework.web.bind.annotation.*;

/**
 * #
 * # 　　　┏┓　　　┏┓
 * # 　　┏┛┻━━━┛┻┓
 * # 　　┃　　　　　　　 ┃
 * # 　　┃　　　━　　　 ┃
 * # 　　┃　┳┛　┗┳　┃
 * # 　　┃　　　　　　　 ┃
 * # 　　┃　　　┻　　　 ┃
 * # 　　┃　　　　　　　 ┃
 * # 　　┗━┓　　　┏━┛Codes are far away from bugs with the animal protecting
 * # 　　　　┃　　　┃    神兽保佑,代码无bug
 * # 　　　　┃　　　┃
 * # 　　　　┃　　　┗━━━┓
 * # 　　　　┃　　　　　 ┣┓
 * # 　　　　┃　　　　 ┏┛
 * # 　　　　┗┓┓┏━┳┓┏┛
 * # 　　　　　┃┫┫　┃┫┫
 * # 　　　　　┗┻┛　┗┻┛
 */
//@CrossOrigin
@RestController
//@CrossOrigin(origins="http://localhost:8080")
public class DemoController {
    @RequestMapping(value = "tu/tuLabourDept/list")
    public Item getList(){
        Item item=new Item();
        item.setBut("but");
        item.setDetailAddress("广西省南宁市");
        item.setId(1);
        item.setPhone("1359533909");
        return item;
    }
//    "petitionerName": this.msglist.name.val,
//            "petitionerPhone": this.msglist.phone.val,
//            "petitionerGenner": this.msglist.gender.val,
//            "petitionerAddress": this.msglist.address.val,
//            "petitionerAge": this.msglist.age.val,
//            "petitionerNum": this.msglist.person.val,
//            "petitionerType": this.msglist.select.val,
//            "petitionDetail": this.msglist.contain.val,
//    http://localhost:8081/tu/app/tuRightProtect/save 404
    @RequestMapping(value = "tu/app/tuRightProtect/save")
    public String applyInfo(
            @RequestBody(required=false) String petitionerName
            ){
        System.out.println(petitionerName);
        return "ok";
    }

    @PostMapping(value = "login",produces = "application/json")
    public String test(
            String username, String password
    ){
        System.out.println(username+":"+password);
        return "ok";
    }
//"userName": this.dataForm.userName,
//            "password": this.dataForm.password,
//            "name": this.dataForm.name,
//            "idcard": this.dataForm.idcard,
//            "phonenumber": this.dataForm.phonenumber,
//            "email": this.dataForm.email
    @PostMapping(value = "install",produces = "application/json")
    public String logoutTest(
            String userName, String password,String name,String idcard,String phonenumber,String email
    ){
        System.out.println(userName+":"+password);
        return "ok";
    }


    @PostMapping(value = "test/login",produces = "application/json")
    public String testLogin(
            String username,String password
    ){
        System.out.println(username+password);
        return "ok";
    }
    @PostMapping(value = "test/User",produces = "application/json")
    public String testUser(
            User user
    ){
        System.out.println(user);
        return "ok";
    }

    @GetMapping(value = "test/get")
    public String tesGet(){
        return "ok";
    }

}
