package pl.coderslab;

import org.mindrot.jbcrypt.BCrypt;
import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.Format;

public class Main {
    public static void main(String[] args) {
        /*create*/
        UserDao userDao = new UserDao();
//        User user = new User();
//        user.setUserName("arek");
//        user.setEmail("arkadiusz.jozwiak@coderslab.pl");
//        user.setPassword("pass");
//        userDao.create(user);

//        read
//        User read = userDao.read(1);
//        System.out.println(String.format("id =%s, userName=%s, email=%s", read.getId(), read.getUserName(), read.getEmail()));
//        User read = userDao.read(2);
//        System.out.println(String.format("id =%s, userName=%s, email=%s", read.getId(), read.getUserName(), read.getEmail()));

//        update
//        User read = userDao.read(1);
//        System.out.println(String.format("id =%s, userName=%s, email=%s, password=%s", read.getId(), read.getUserName(), read.getEmail(), read.getPassword()));
//        User userToUpdate = userDao.read(1);
//        userToUpdate.setUserName("Arkadiusz");
//        userToUpdate.setEmail("arek@coderslab.pl");
//        userToUpdate.setPassword("superPassword");
//        userDao.update(userToUpdate);
//        User read_2 = userDao.read(1);
//        System.out.println(String.format("id =%s, userName=%s, email=%s, password=%s", read_2.getId(), read_2.getUserName(), read_2.getEmail(), read_2.getPassword()));

//        findAll
//        User secondUser = new User();
//        secondUser.setUserName("marek");
//        secondUser.setEmail("marek@coderslab.pl");
//        secondUser.setPassword("pass");
//        userDao.create(secondUser);
//        User[] all = userDao.findAllUsers();
//        for (User u : all) {
//            System.out.println(String.format("id =%s, userName=%s, email=%s, password=%s", u.getId(), u.getUserName(), u.getEmail(), u.getPassword()));
//        }
//        delete
//        userDao.delete(2);
//        User[] all = userDao.findAllUsers();
//        for (User u : all) {
//            System.out.println(String.format("id =%s, userName=%s, email=%s, password=%s", u.getId(), u.getUserName(), u.getEmail(), u.getPassword()));
//        }

    }
}