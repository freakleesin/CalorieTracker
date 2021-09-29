package edu.ncsu.calorietracker.ui.notifications;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * from User WHERE id = :id")
    public User getUser(int id);

    @Query("SELECT id from User WHERE username = :username")
    public int getUser(String username);

    @Query("SELECT COUNT(username) from User")
    public int userCount();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public long insertUser(User user);

    @Update
    public void updateUser(User user);

    @Delete
    public void deleteUser(User user);
}
