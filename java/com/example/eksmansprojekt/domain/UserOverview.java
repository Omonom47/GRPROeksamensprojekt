package com.example.eksmansprojekt.domain;

import com.example.eksmansprojekt.data.DataFileReader;

import java.util.ArrayList;
import java.util.List;

public class UserOverview {
    List<User> userList;
    User activeUser;

    public UserOverview(){
        userList = new ArrayList<User>();
        DataFileReader.getInstance().readTxtFile("/materials/users.txt").forEach(line->{
            String[] l = line.split(";");
            this.addUser(l[0],l[1]);
        });
    }

    public List<User> getUserList() {
        return userList;
    }

    public User getActiveUser(){
        return activeUser;
    }

    /**
     * Sets the active user if username and password match a user in the users.txt file
     * @param username
     * @param password
     */
    public void login(String username, String password) throws WrongLoginException{
        for (User u: userList) {
            if (u.getUsername().equals(username)){
                if(u.getPassword().equals(password)){
                    activeUser = u;
                } else {
                    throw new WrongLoginException();
                }
            }
        }
        if (activeUser == null){
            throw new WrongLoginException();
        }
    }

    public void logout(){
        activeUser = null;
    }

    public void addUser(String username, String password){
        
        addUser(new User(username,password));
    }

    public void addUser(User user){
        userList.add(user);
    }

    public void show(){
        System.out.println("Logged in as "+activeUser.getUsername());
    }
}
