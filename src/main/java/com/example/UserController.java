package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/u1")
public class UserController {
@Autowired
    UserRepo repo;
    @PostMapping("/add")
    public String create(@RequestBody Userdto data)
    {
        UserTable userObj=new UserTable();

        userObj.setName(data.getName());
        userObj.setEmail(data.getEmail());
        userObj.setPhoneNo(data.getPhoneNo());
        repo.save(userObj);
        return "success";
    }
    @GetMapping("/findall")
    public List<Userdto> findAll(){

        List<UserTable> userData = repo.findAll();
        List<Userdto> userdto = new ArrayList<Userdto>();

        for (UserTable userList : userData) {
            userdto.add(new Userdto(userList.getId(),userList.getName(),userList.getEmail(),userList.getPhoneNo()));
        }

        return userdto;
    }


    }
