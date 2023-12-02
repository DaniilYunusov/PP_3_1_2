package ru.yunusov.PP_3_1_2.dao;


import ru.yunusov.PP_3_1_2.models.User;

import java.util.List;

public interface UserDao {
     List<User> getUsers();
     User getUser(int id);
     void save(User user);
     void delete(int id);
}
